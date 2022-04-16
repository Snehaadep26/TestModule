package com.example.testmoduledesign;

public class SubjectsTest {
    int imageSubj;
    String subjTest,noOfTest;

    public SubjectsTest(int imageSubj, String subjTest, String noOfTest) {
        this.imageSubj = imageSubj;
        this.subjTest = subjTest;
        this.noOfTest = noOfTest;
    }

    public int getImageSubj() {
        return imageSubj;
    }

    public String getSubjTest() {
        return subjTest;
    }

    public String getNoOfTest() {
        return noOfTest;
    }
}
