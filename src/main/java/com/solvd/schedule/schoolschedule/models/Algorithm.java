package com.solvd.schedule.schoolschedule.models;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Algorithm {

    public Hromosome[] start(int count, Hromosome[] hromosomes){
        Arrays.sort(hromosomes, Comparator.comparing(Hromosome::getR));
        Hromosome[] result=new Hromosome[count+1];
        for (int i=0;i<count;i++)
            result[i]=hromosomes[i];
        return result;
    }
}
