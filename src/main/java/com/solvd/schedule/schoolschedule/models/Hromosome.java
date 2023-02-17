package com.solvd.schedule.schoolschedule.models;

import lombok.Data;

@Data
public class Hromosome {
    private long id;
    private Subjects subjects;
    private Teachers teachers;
    private long R;
    private String H;

    public Hromosome(long id,Subjects subjects, Teachers teachers, long r, String h) {
        this.id=id;
        this.subjects = subjects;
        this.teachers = teachers;
        R = r;
        H = h;
    }
}
