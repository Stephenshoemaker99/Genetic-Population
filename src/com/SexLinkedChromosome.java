package com;

import java.util.ArrayList;

public class SexLinkedChromosome extends Chromosome {
    private char gender;
    public SexLinkedChromosome(char initialGender, ArrayList<Gene> initialGeneArrayList)
    {
        super(initialGeneArrayList);
        gender = initialGender;
    }
    public SexLinkedChromosome(char initialGender)
    {
        super();
        gender = initialGender;
    }

    @Override
    public boolean isSexLinked() {
        return true;
    }
}

