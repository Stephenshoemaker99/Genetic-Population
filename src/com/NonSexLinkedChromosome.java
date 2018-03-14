package com;

import java.util.ArrayList;

public class NonSexLinkedChromosome extends Chromosome {
    public NonSexLinkedChromosome()
    {
        this(new ArrayList<Gene>());
    }
    public NonSexLinkedChromosome(ArrayList<Gene> initialArrayListGene)
    {
        super(initialArrayListGene);
    }

    @Override
    public boolean isSexLinked() {
        return false;
    }
}
