package com.csstack.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.csstack.R;

/**
 * Created by nandhu on 26/1/17.
 *
 */
public class TopicListAdapter  extends RecyclerView.Adapter<TopicListAdapter.TopicHolder> {


    @Override
    public TopicHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         View v  = LayoutInflater.from(parent.getContext()).inflate(R.layout.topic_item_row,parent,false);
        return new TopicHolder(v);
    }

    @Override
    public void onBindViewHolder(TopicHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class TopicHolder extends RecyclerView.ViewHolder{

        public TopicHolder(View itemView) {
            super(itemView);
        }
    }
}
