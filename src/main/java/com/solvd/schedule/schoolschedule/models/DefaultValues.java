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
        for(int i=0;i<teachers.size();i++)
            teachers.get(i).setR((long) Math.floor(Math.random() * (40 - 1 + 2) + 2));
        for (int i=0;i<teachers.size();i++)
        teachersService.updateTeachers(teachers.get(i));
    }

    public void setStaticSubject(){
        List<Subjects> subjects=subjectService.getAll();
        for(int i=0;i<subjects.size();i++)
            subjects.get(i).setR((long) Math.floor(Math.random() * (40-1+2)+2));

        for (int i=0;i<subjects.size();i++)
            subjectService.updateSubjects(subjects.get(i));
    }

}
