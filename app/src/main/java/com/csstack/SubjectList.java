package com.csstack;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nandhu on 26/1/17.
 *
 * The Class which provides a List of subejcts based on Year
 */
public class SubjectList {


    public static List<String> getSubjectList(String year_selected, Context mContext) {

        List<String> subjectList = new ArrayList<>();
        switch (year_selected){
            case "FIRST" :
                subjectList.add(mContext.getString(R.string.cp));
                subjectList.add(mContext.getString(R.string.pce));
                subjectList.add(mContext.getString(R.string.cplus));


                break;
            case "SECOND":
                subjectList.add(mContext.getString(R.string.ca));
                subjectList.add(mContext.getString(R.string.ds));
                subjectList.add(mContext.getString(R.string.dbms));
                subjectList.add(mContext.getString(R.string.daa));
                subjectList.add(mContext.getString(R.string.jip));
                break;
            case "THIRD":

                subjectList.add(mContext.getString(R.string.os));
                subjectList.add(mContext.getString(R.string.se));
                subjectList.add(mContext.getString(R.string.cn));
                subjectList.add(mContext.getString(R.string.mp));
                subjectList.add(mContext.getString(R.string.ss));
                subjectList.add(mContext.getString(R.string.flat));
                subjectList.add(mContext.getString(R.string.ooad));


                break;
            case "FOURTH":
                subjectList.add(mContext.getString(R.string.ai));
                subjectList.add(mContext.getString(R.string.pcd));
                subjectList.add(mContext.getString(R.string.cg));
                subjectList.add(mContext.getString(R.string.pp));
                subjectList.add(mContext.getString(R.string.pom));
                subjectList.add(mContext.getString(R.string.mobile));
                subjectList.add(mContext.getString(R.string.security));

                break;
            default:
                break;
        }

        return  subjectList;
    }
}
