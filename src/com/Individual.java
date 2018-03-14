package com;

import java.util.ArrayList;

public class Individual {
    private String individualName;
    private ArrayList<ChromosomePair> chromosomePairs;

    public Individual(String individualName, ArrayList<ChromosomePair> chromosomePairs) {
        this.individualName = individualName;
        this.chromosomePairs = chromosomePairs;
    }

    public Individual(ArrayList<ChromosomePair> chromosomePairs) {
        this.chromosomePairs = chromosomePairs;
        this.individualName=null;
    }

    public Individual() {
        this(null,null);
    }

    public String getIndividualName() {
        return individualName;
    }

    public void setIndividualName(String individualName) {
        this.individualName = individualName;
    }

    public ArrayList<ChromosomePair> getChromosomePairs() {
        return chromosomePairs;
    }

    public void setChromosomePairs(ArrayList<ChromosomePair> chromosomePairs) {
        this.chromosomePairs = chromosomePairs;
    }

    @Override
    public String toString() {
        return "Individual{" +
                "individualName='" + individualName + '\'' +
                ", chromosomePairs=" + chromosomePairs +
                '}';
    }
}
