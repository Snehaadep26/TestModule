package com.example.testmoduledesign;

public class MissedCard {
    String javaText, mathsText, phyTest, chemTest;
    String qsns, min, marks, recentText;

    public MissedCard(String javaText, String mathsText, String phyTest, String chemTest, String qsns, String min, String marks, String recentText) {
        this.javaText = javaText;
        this.mathsText = mathsText;
        this.phyTest = phyTest;
        this.chemTest = chemTest;
        this.qsns = qsns;
        this.min = min;
        this.marks = marks;
        this.recentText = recentText;
    }

    public String getJavaText() {
        return javaText;
    }

    public String getMathsText() {
        return mathsText;
    }

    public String getPhyTest() {
        return phyTest;
    }

    public String getChemTest() {
        return chemTest;
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

    public String getRecentText() {
        return recentText;
    }
}
