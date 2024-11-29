package com.quest.casestudy;

import java.io.Serializable;

public class Call implements Serializable {
    private String callType;
    private double duration;

    public Call(String callType, double duration) {
        this.callType = callType;
        this.duration = duration;
    }

    public String getCallType() {
        return callType;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Call Type: " + callType + ", Duration: " + duration + " minutes";
    }
}
