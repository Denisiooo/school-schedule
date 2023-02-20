package com.solvd.schedule.schoolschedule.models;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Component
public class Algorithm {

    private ClassGeneration classGeneration;

    public Algorithm(ClassGeneration classGeneration) {
        this.classGeneration = classGeneration;
    }

    public Hromosome[] start(int count, Hromosome[] hromosomes,int oo) {
        Arrays.sort(hromosomes, Comparator.comparing(Hromosome::getR));
        List<Hromosome> hromosomesList = Arrays.stream(hromosomes).toList();
        Hromosome[] result = new Hromosome[count + 1];
        if(oo%2!=0)
            for (int i=0;i<count;i++){
                hromosomesList.get(i).setR(hromosomesList.get(i).getR()+70);
            }

        int random_int = (int)Math.floor(Math.random() * (100 - 1 + 0) + 0);
        if(random_int<10){
            int rand=(int)Math.floor(Math.random() * (hromosomes.length - 1 + 0) + 0);
            hromosomes[rand].setSubjects(classGeneration.getRandomSubject());
            hromosomes[rand].setTeachers(classGeneration.getRandomTeacher());
            hromosomes[rand].setR(hromosomes[rand].getSubjects().getR()+ hromosomes[rand].getTeachers().getR());
            hromosomes[rand].setH(String.valueOf(hromosomes[rand].getSubjects().getH())+ String.valueOf(hromosomes[rand].getTeachers().getH()));
        }

        hromosomesList=firstCheck(hromosomesList);
        for (int i = 0; i < count; i++)
            result[i] = hromosomesList.get(i);
        return result;
    }

    private List<Hromosome> firstCheck(List<Hromosome> hromosomes) {
        Subjects[] subjects = classGeneration.getSubjects();
        List<Hromosome> result = new ArrayList<>();
        List<Hromosome> math = new ArrayList<>();
        List<Hromosome> pe = new ArrayList<>();
        List<Hromosome> prog = new ArrayList<>();
        List<Hromosome> physics = new ArrayList<>();
        List<Hromosome> english = new ArrayList<>();
        for (int i = 0; i < hromosomes.size(); i++) {
            for (int k = 0; k < subjects.length; k++)
                if (hromosomes.get(i).getSubjects().equals(subjects[k])) {
                    switch (subjects[k].getSubjectTitle()) {
                        case "Maths":
                            math.add(hromosomes.get(i));
                            break;
                        case "PE":
                            pe.add(hromosomes.get(i));
                            break;
                        case "Programming":
                            prog.add(hromosomes.get(i));
                            break;
                        case "Physics":
                            physics.add(hromosomes.get(i));
                            break;
                        case "English":
                            english.add(hromosomes.get(i));
                            break;
                    }
                }

        }

        if(!physics.isEmpty())
            result.add(physics.stream().min(Comparator.comparing(v->v.getR())).get());
        if(!english.isEmpty())
            result.add(english.stream().min(Comparator.comparing(v->v.getR())).get());
        if(!math.isEmpty())
            result.add(math.stream().min(Comparator.comparing(v->v.getR())).get());
        if(!pe.isEmpty())
            result.add(pe.stream().min(Comparator.comparing(v->v.getR())).get());
        if(!prog.isEmpty())
            result.add(prog.stream().min(Comparator.comparing(v->v.getR())).get());


        result.sort(Comparator.comparing(Hromosome::getR).reversed());
        return result;
    }
}
