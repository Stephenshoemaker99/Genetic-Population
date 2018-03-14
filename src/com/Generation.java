package com;

import java.util.ArrayList;

public class Generation {
    private ArrayList<Individual> individuals;
    private String generationName;

    public Generation(ArrayList<Individual> individuals, String generationName) {
        this.individuals = individuals;
        this.generationName = generationName;
    }

    public Generation(ArrayList<Individual> individuals) {
        this.individuals = individuals;
    }

    public Generation() {
    }

    public ArrayList<Individual> getIndividuals() {
        return individuals;
    }

    public void setIndividuals(ArrayList<Individual> individuals) {
        this.individuals = individuals;
    }

    public String getGenerationName() {
        return generationName;
    }

    public void setGenerationName(String generationName) {
        this.generationName = generationName;
    }

    @Override
    public String toString() {
        return "Generation{" +
                "individuals=" + individuals +
                ", generationName='" + generationName + '\'' +
                '}';
    }
}

