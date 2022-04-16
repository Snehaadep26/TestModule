package com.example.testmoduledesign;

public class AvailableCard2P13 {
    String javaText, mathsText, dateText, timeText;
    String qsns, min, marks;

    public AvailableCard2P13(String javaText, String mathsText, String dateText, String timeText, String qsns, String min, String marks) {
        this.javaText = javaText;
        this.mathsText = mathsText;
        this.dateText = dateText;
        this.timeText = timeText;
        this.qsns = qsns;
        this.min = min;
        this.marks = marks;
    }

    public String getJavaText() {
        return javaText;
    }

    public String getMathsText() {
        return mathsText;
    }

    public String getDateText() {
        return dateText;
    }

    public String getTimeText() {
        return timeText;
    }

    public String getQsns() {
        return qsns;
    }

    public String getMin() {
        return min;
    }

    public String getMarks() {
        return marks;
    }
}
