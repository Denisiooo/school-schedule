package com.solvd.schedule.schoolschedule.models;

import com.solvd.schedule.schoolschedule.services.SubjectService;
import com.solvd.schedule.schoolschedule.services.TeachersService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultValues {

    private TeachersService teachersService;
    private SubjectService subjectService;

    public DefaultValues(TeachersService teachersService, SubjectService subjectService) {
        this.teachersService = teachersService;
        this.subjectService = subjectService;
    }

    public void setStaticTeacher(){
        List<Teachers> teachers=teachersService.getAll();
        teachers.get(0).setR(15);
        teachers.get(1).setR(2);
        teachers.get(2).setR(8);
        teachers.get(3).setR(12);
        teachers.get(4).setR(4);
        teachers.get(5).setR(6);
        teachers.get(6).setR(13);
        for (int i=0;i<teachers.size();i++)
        teachersService.updateTeachers(teachers.get(i));
    }

    public void setStaticSubject(){
        List<Subjects> subjects=subjectService.getAll();
        subjects.get(0).setR(5);
        subjects.get(1).setR(9);
        subjects.get(2).setR(3);
        subjects.get(3).setR(12);
        subjects.get(4).setR(6);
        for (int i=0;i<subjects.size();i++)
            subjectService.updateSubjects(subjects.get(i));
    }

}
