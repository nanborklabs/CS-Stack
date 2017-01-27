package com.csstack.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.csstack.Model.Topic;
import com.csstack.R;

import java.util.List;

/**
 * Created by nandhu on 26/1/17.
 *
 */
public class TopicListAdapter  extends RecyclerView.Adapter<TopicListAdapter.TopicHolder> {


    private Context mContext;
    private List<Topic> mTopicsList;
    private TopicCallback mCallback ;

    public TopicListAdapter(Context mContext, List<Topic> mTopicsList,TopicCallback mCallback) {
        this.mTopicsList = mTopicsList;
        this.mContext = mContext;
        this.mCallback = mCallback;
    }

    @Override
    public TopicHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         View v  = LayoutInflater.from(parent.getContext()).inflate(R.layout.topic_item_row,parent,false);
        return new TopicHolder(v);
    }

    @Override
    public void onBindViewHolder(final TopicHolder holder, final int position) {
        holder.mTopicName.setText(mTopicsList.get(position).getTopicName());
        holder.mTopicName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mCallback != null){
                    mCallback.showURL(mTopicsList.get(holder.getAdapterPosition()).getTopicUrl());
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return mTopicsList.size();
    }

    public static class TopicHolder extends RecyclerView.ViewHolder{

        TextView mTopicName ;

        public TopicHolder(View itemView) {
            super(itemView);

            mTopicName = (TextView) itemView.findViewById(R.id.topic_name);
        }
    }

    public interface TopicCallback{
        void showURL(String url);
    }
}
