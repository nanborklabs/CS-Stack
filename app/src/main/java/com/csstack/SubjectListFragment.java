package com.csstack;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.csstack.Adapter.SubjectListAdapter;

import java.util.List;

/**
 * Created by nandhu on 26/1/17.
 * Fisplays the Subject  year wise
 *
 */

public class SubjectListFragment extends Fragment {

    private Context mContext;
    private String year_selected;

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

        View v   = LayoutInflater.from(mContext).inflate(R.layout.subject_fragment,container,false);

        //Get The Variable Whic Represents what year
        if (getArguments() != null){
             year_selected = getArguments().getString("YEAR");
        }
        else{
            throw new NullPointerException("Arguments cannot be null");
        }

        List<String> mSubjectList = SubjectList.getSubjectList(year_selected,mContext);
        SubjectListAdapter mAdapter  = new SubjectListAdapter(getContext(),mSubjectList);


        return v;

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
