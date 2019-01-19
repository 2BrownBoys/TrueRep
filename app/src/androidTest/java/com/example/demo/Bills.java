package com.example.demo;

public class Bills {
    private int pointVal;
    private int issue;
    private boolean leaning;

    public Bills(){}

    public Bills(int pointVal, int issue, boolean leaning){

        this.pointVal = pointVal;
        this.issue = issue;
        this.leaning = leaning;
    }

    public int getPoint() {
        return this.point;
    }

    public int getIssue() {
        return this.issue;
    }

    public boolean getLeaning() {
        return this.leaning;
    }
}
