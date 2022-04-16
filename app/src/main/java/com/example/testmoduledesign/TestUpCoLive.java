package com.example.testmoduledesign;

public class TestUpCoLive {
    String javaText, mathsText, dateText, timeText,chemText,phyText;
    String qsns, min, marks;

    public TestUpCoLive(String javaText, String mathsText, String dateText, String timeText, String chemText, String phyText, String qsns, String min, String marks) {
        this.javaText = javaText;
        this.mathsText = mathsText;
        this.dateText = dateText;
        this.timeText = timeText;
        this.chemText = chemText;
        this.phyText = phyText;
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

    public String getChemText() {
        return chemText;
    }

    public String getPhyText() {
        return phyText;
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
