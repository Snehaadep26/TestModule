package com.example.testmoduledesign;

public class TestOT {

    String javaText,mathsText,phyTest,chemTest;
    String qsns,min,marks;

    public TestOT(String javaText, String mathsText, String phyTest, String chemTest, String qsns, String min, String marks) {
        this.javaText = javaText;
        this.mathsText = mathsText;
        this.phyTest = phyTest;
        this.chemTest = chemTest;
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
}
