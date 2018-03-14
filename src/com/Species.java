package com;

import java.util.ArrayList;

public class Species {
    private ArrayList<Generation> generations;
    private String speciesName;

    public Species(ArrayList<Generation> generations, String speciesName) {
        this.generations = generations;
        this.speciesName = speciesName;
    }

    public Species(ArrayList<Generation> generations) {
        this.generations = generations;
    }

    public Species() {
    }

    public ArrayList<Generation> getGenerations() {
        return generations;
    }

    public void setGenerations(ArrayList<Generation> generations) {
        this.generations = generations;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    @Override
    public String toString() {
        return "Species{" +
                "generations=" + generations +
                ", speciesName='" + speciesName + '\'' +
                '}';
    }
}
