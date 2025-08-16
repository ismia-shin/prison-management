package com.prison.guardSupervisor;

public class ReplyFeedbackModel {
    String ThreadView, ReplyBox;

    public ReplyFeedbackModel(String threadView, String replyBox) {
        ThreadView = threadView;
        ReplyBox = replyBox;
    }


    public String getThreadView() {
        return ThreadView;
    }

    public void setThreadView(String threadView) {
        ThreadView = threadView;
    }

    public String getReplyBox() {
        return ReplyBox;
    }

    public void setReplyBox(String replyBox) {
        ReplyBox = replyBox;
    }


    @Override
    public String toString() {
        return "ReplyFeedbackModel{" +
                "ThreadView='" + ThreadView + '\'' +
                ", ReplyBox='" + ReplyBox + '\'' +
                '}';
    }
}
