package com.example.cw7;

public class OnBoardModal {

    private int image;
    private String firstTitle;
    private String secondTitle;

    public OnBoardModal(int image, String firstTitle, String secondTitle) {
        this.image = image;
        this.firstTitle = firstTitle;
        this.secondTitle = secondTitle;
    }

    public int getImage() {
        return image;
    }

    public String getFirstTitle() {
        return firstTitle;
    }

    public String getSecondTitle() {
        return secondTitle;
    }
}
