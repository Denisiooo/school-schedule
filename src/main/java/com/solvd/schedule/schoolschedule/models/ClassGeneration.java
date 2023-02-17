package com.solvd.schedule.schoolschedule.models;

import com.solvd.schedule.schoolschedule.services.ClassesService;
import com.solvd.schedule.schoolschedule.services.SubjectService;
import com.solvd.schedule.schoolschedule.services.TeachersService;
import com.solvd.schedule.schoolschedule.services.WeekdaysService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ClassGeneration {
    private WeekdaysService weekdaysService;
    private SubjectService subjectService;
    private TeachersService teachersService;
    private ClassesService classesService;

    public ClassGeneration(WeekdaysService weekdaysService, SubjectService subjectService, TeachersService teachersService, ClassesService classesService) {
        this.weekdaysService = weekdaysService;
        this.subjectService = subjectService;
        this.teachersService = teachersService;
        this.classesService = classesService;
    }

    public Weekdays[] getWeekdays(){
        Weekdays[] weekdays=new Weekdays[5];
        for(int i=0;i<weekdays.length;i++)
            weekdays[i]=weekdaysService.getWeekdays(i+1);
        return weekdays;
    }

    public Classes[] getClasses(){
        Classes[] classes=new Classes[3];
        for (int i=0;i<classes.length;i++)
            classes[i]=classesService.getClasses(i+1);
        return classes;
    }

    public Subjects[] getSubjects(){
        Subjects[] subjects=new Subjects[6];
        for(int i=0;i<subjects.length;i++)
            subjects[i]=subjectService.getSubjects(i+1);
        return subjects;
    }

    public Subjects getRandomSubject(){
        int random_int = (int)Math.floor(Math.random() * (5 - 1 + 0) + 0);
        Subjects[] subjects=new Subjects[5];
        for(int i=0;i<subjects.length;i++)
            subjects[i]=subjectService.getSubjects(i+1);
        return subjects[random_int];
    }

    public Teachers getRandomTeacher(){
       int random_int = (int)Math.floor(Math.random() * (6 - 1 + 0) + 0);
       Teachers[] teachers=new Teachers[7];
       for(int i=0;i<teachers.length;i++ )
           teachers[i]=teachersService.getTeachers(i+1);
       return teachers[random_int];
    }

    public Hromosome[] getHromosomes(){
        Hromosome[] hromosomes=new Hromosome[20];
        for(int h=0;h<20;h++){
            Subjects subjects=getRandomSubject();
            Teachers teachers=getRandomTeacher();
            hromosomes[h]=new Hromosome(subjects,teachers, subjects.getR()+teachers.getR(),String.valueOf(subjects.getH())+String.valueOf(teachers.getH()));
        }
        return hromosomes;
    }
}
