package com.csstack;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.csstack.Activity.WebviewActivity;
import com.csstack.Adapter.TopicListAdapter;
import com.csstack.Model.Topic;

import java.util.List;

/**
 * Created by nandhu on 26/1/17.
 *
 * THe Fragment Which Displays a List of TOpics w
 *
 * when a topic is cliced show {@link WebviewActivity wit Url}
 */
public class TopicFragment  extends Fragment{


    TopicListAdapter mAdapter = null;
    private String year;
    private String subject;
    private String unit;

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public LayoutInflater getLayoutInflater(Bundle savedInstanceState) {
        return super.getLayoutInflater(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = LayoutInflater.from(getContext()).inflate(R.layout.topic_frag_layout,container,false);


        if(getArguments() != null){
            //get The Year
            year = getArguments().getString("YEAR");
            subject =  getArguments().getString("SUBJECT");
            unit  = getArguments().getString("UNIT");
        }
        else{
            throw new NullPointerException("Arguments cannot be null");
        }


        List<Topic> mTopicsList = TopicUtils.getTopics(year,subject,unit);

        RecyclerView mLsitView = (RecyclerView) mView.findViewById(R.id.topic_list);

        mAdapter  = new TopicListAdapter();
        mLsitView.setLayoutManager(new LinearLayoutManager(getContext()));
        mLsitView.setAdapter(mAdapter);





        return mView;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
