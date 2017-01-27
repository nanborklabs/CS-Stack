package com.csstack.Model;

/**
 * Created by nandhu on 27/1/17.
 */
public class Topic {
    public String topicName;
    public String topicUrl;

    public Topic(String topicName, String topicUrl) {
        this.topicName = topicName;
        this.topicUrl = topicUrl;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicUrl() {
        return topicUrl;
    }

    public void setTopicUrl(String topicUrl) {
        this.topicUrl = topicUrl;
    }
}
