package com.csstack;

import com.csstack.Model.Topic;

import java.util.List;

/**
 * Created by nandhu on 27/1/17.
 * THe Class whic creates Topic for the whole app
 *
 * each topic is initialized only if Requested by provideing year, subject, unit
 */
public class TopicUtils {



    public static List<Topic> getTopics(String year, String subject, String unit) {

        List<Topic> mList ;

        mList = getTopicList(subject,unit);
        return mList;
    }

    private static List<Topic> getTopicList(String subject, String unit) {
        if (subject.equals(""))
    }
}
