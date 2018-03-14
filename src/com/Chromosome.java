package com;

import java.util.ArrayList;

public abstract class Chromosome {
    private ArrayList<Gene> geneArrayList;
    public Chromosome()
    {
        this( new ArrayList<Gene>());
    }

    public Chromosome(ArrayList<Gene> initialGeneArrayList)
    {
        geneArrayList = initialGeneArrayList;
    }
    public Gene getGene(String geneName)
    {
        Gene output = null;
        if(geneArrayList.size() > 0)
        {
            for(int index = 0; index < geneArrayList.size(); index++)
            {
                if(geneName ==  geneArrayList.get(index).getGeneName())
                {
                    output = geneArrayList.get(index);
                }
            }
        }
        return output;
    }
    public Gene getGene(char geneChar)
    {
        Gene output = null;
        if(geneArrayList.size() > 0)
        {
            for(int index = 0; index < geneArrayList.size(); index++)
            {
                if(geneChar ==  geneArrayList.get(index).getGeneChar())
                {
                    output = geneArrayList.get(index);
                }
            }
        }
        return output;
    }
    public Gene getGene(int index)
    {
        return geneArrayList.get(index);
    }

    public ArrayList<Gene> getGeneArrayList() {
        return geneArrayList;
    }

    public abstract boolean isSexLinked();
    public String toString()
    {
        String output = new String();
        if(isSexLinked())
        {
            output += "Sex Linked \n";
        }
        else
        {
            output += "Non Sex Linked";
        }
        for(int index = 0; index < geneArrayList.size(); index++)
        {
            output += geneArrayList.get(index);
            output += '\n';
        }
        return output;
    }
}
