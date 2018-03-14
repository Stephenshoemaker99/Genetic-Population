package com;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args)
    {
        ArrayList<Gene> genes = new ArrayList<Gene>();
        genes.add(new Gene("1A", 'A', 1));
        genes.add(new Gene("1B", 'b', 0));
        genes.add(new Gene("1C",'C', 1));
        Chromosome chromosome = new SexLinkedChromosome('X', genes);
        System.out.println(chromosome);

    }
}
