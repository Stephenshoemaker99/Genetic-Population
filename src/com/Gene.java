package com;

import org.jetbrains.annotations.NotNull;

public class Gene {
    private String geneName;
    private char geneChar;
    private int dominanceFactor;
    public Gene(String initialGeneName, char initialGeneChar, int initialDominanceFactor)
    {
        geneName = initialGeneName;
        geneChar = initialGeneChar;
        dominanceFactor = initialDominanceFactor;
    }
    @NotNull
    public static Gene DominantGene(String initialGeneName, char initialGeneChar)
    {
        return new Gene(initialGeneName, initialGeneChar, 1);
    }
    @NotNull
    public static Gene RecessiveGene(String initialGeneName, char initialGeneChar)
    {
        return new Gene(initialGeneName, initialGeneChar, 0);
    }
    public int getDominanceFactor()
    {
        return dominanceFactor;
    }
    public String getGeneName()
    {
        return geneName;
    }
    public char getGeneChar()
    {
        return geneChar;
    }
    public String toString()
    {
        return "Gene: " + geneName + "\n" +
                "GeneChar: " + geneChar + "\n" +
                "DominanceFactor: " + dominanceFactor;
    }


}
