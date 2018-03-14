package com;

public class ChromosomePair {
    private Chromosome chromosome1;
    private Chromosome chromosome2;
    private String chromosomeName;
    public ChromosomePair( String chromosomeName, Chromosome initialChromosome1, Chromosome initialChromosome2)
    {
        chromosome1 = initialChromosome1;
        chromosome2 = initialChromosome2;
        chromosomeName = chromosomeName;
    }
    public ChromosomePair()
    {
        this(null,null,null);
    }

    public Chromosome getChromosome1() {
        return chromosome1;
    }

    public Chromosome getChromosome2() {
        return chromosome2;
    }

    public Chromosome getRandomChromosome()
    {
        if(Math.random() > .5)
        {
            return chromosome1;
        }
        else
        {
            return chromosome2;
        }
    }
    public Chromosome getChromosome(int chromosomeNumber)
    {
        if(chromosomeNumber == 0)
        {
            return chromosome1;
        }
        else if(chromosomeNumber == 1)
        {
            return chromosome2;
        }
        else
        {
            return null;
        }
    }

    public void setChromosome1(Chromosome chromosome1) {
        this.chromosome1 = chromosome1;
    }

    public void setChromosome2(Chromosome chromosome2) {
        this.chromosome2 = chromosome2;
    }

    public String getChromosomeName() {
        return chromosomeName;
    }

    public void setChromosomeName(String chromosomeName) {
        this.chromosomeName = chromosomeName;
    }

    @Override
    public String toString() {
        return "ChromosomePair{" +
                "chromosome1=" + chromosome1 +
                ", chromosome2=" + chromosome2 +
                ", chromosomeName='" + chromosomeName + '\'' +
                '}';
    }
}
