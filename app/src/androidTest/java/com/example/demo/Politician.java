package com.example.demo;

public class Politician {

    private String name;
    private String party;
    private int[] scales = new int[3];
    private int issueindex = 0;


    public Politician() {}

    public Politician(String name, String party, int[] scales){
        this.name = name;
        this.party = party;
        this.scales = scales;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setParty(String party){
        this.party = party;
    }
    public String getName() {
        return this.name ;
    }
    public String getParty() {
        return this.party;
    }

    public int getScale(int[] scales, int issueindex){
        this.scales = scales;
        this.issueindex = issueindex;
        return scales[issueindex];
    }
}
