package com.csstack.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.csstack.R;

import java.util.List;

/**
 * Created by nandhu on 27/1/17.
 *
 */
public class SubjectListAdapter extends RecyclerView.Adapter<SubjectListAdapter.SubjectHolder>{
    private List<String> mList = null;
    private Context mContext   =  null;
    public SubjectListAdapter(Context context, List<String> mSubjectList) {


        this.mContext  = context;
        this.mList  = mSubjectList;
    }

    @Override
    public SubjectHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View  v = LayoutInflater.from(parent.getContext()).inflate(R.layout.subject_item_row,parent,false);
        return new SubjectHolder(v);
    }

    @Override
    public void onBindViewHolder(final SubjectHolder holder, int position) {
        holder.mTextView.setText(mList.get(position));
        holder.mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    public static class  SubjectHolder extends RecyclerView.ViewHolder{

        public TextView mTextView;

        public SubjectHolder(View itemView) {
            super(itemView);

            mTextView  = (TextView) itemView.findViewById(R.id.subject_item_text);
        }
    }

    interface SubjectFragCallbacks{
        void subjectCliced();
    }
}
