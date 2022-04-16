package com.example.testmoduledesign;

public class PerformaceCardP42 {
    String  subjText,marks,infotext;
    int image;

    public PerformaceCardP42(String subjText, String marks, String infotext, int image) {
        this.subjText = subjText;
        this.marks = marks;
        this.infotext = infotext;
        this.image = image;
    }

    public String getSubjText() {
        return subjText;
    }

    public String getMarks() {
        return marks;
    }

    public String getInfotext() {
        return infotext;
    }

    public int getImage() {
        return image;
    }
}
