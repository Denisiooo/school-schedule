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
        weekdays[0]=weekdaysService.getWeekdays(1);
        weekdays[1]=weekdaysService.getWeekdays(2);
        weekdays[2]=weekdaysService.getWeekdays(3);
        weekdays[3]=weekdaysService.getWeekdays(4);
        weekdays[4]=weekdaysService.getWeekdays(5);
        return weekdays;
    }

    public Classes[] getClasses(){
        Classes[] classes=new Classes[3];
        classes[0]=classesService.getClasses(1);
        classes[1]=classesService.getClasses(2);
        classes[2]=classesService.getClasses(3);
        return classes;
    }

    public Subjects getRandomSubject(){
        int random_int = (int)Math.floor(Math.random() * (4 - 1 + 1) + 1);
        Subjects[] subjects=new Subjects[5];
        subjects[0]=subjectService.getSubjects(1);
        subjects[1]=subjectService.getSubjects(2);
        subjects[2]=subjectService.getSubjects(3);
        subjects[3]=subjectService.getSubjects(4);
        subjects[4]=subjectService.getSubjects(5);
        return subjects[random_int];
    }

    public Teachers getRandomTeacher(){
       int random_int = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);
       Teachers[] teachers=new Teachers[7];
       teachers[0]=teachersService.getTeachers(1);
       teachers[1]=teachersService.getTeachers(2);
       teachers[2]=teachersService.getTeachers(3);
       teachers[3]=teachersService.getTeachers(4);
       teachers[4]=teachersService.getTeachers(5);
       teachers[5]=teachersService.getTeachers(6);
       teachers[6]=teachersService.getTeachers(7);
       return teachers[random_int];
    }

    public Hromosome[] getHromosomes(){
        Hromosome[] hromosomes=new Hromosome[20];
        for(int h=0;h<20;h++){
            Subjects subjects=getRandomSubject();
            Teachers teachers=getRandomTeacher();
            hromosomes[h]=new Hromosome(h,subjects,teachers, subjects.getR()+teachers.getR(),String.valueOf(subjects.getH())+String.valueOf(teachers.getH()));
            subjects.setR(subjects.getR()+50);
            teachers.setR(teachers.getR()+50);
            subjectService.updateSubjects(subjects);
            teachersService.updateTeachers(teachers);
        }
        return hromosomes;
    }
}
