package com.solvd.schedule.schoolschedule.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Hromosome {
    private Subjects subjects;
    private Teachers teachers;
    private long R;
    private String H;

    public Hromosome(Subjects subjects, Teachers teachers, long r, String h) {
        this.subjects = subjects;
        this.teachers = teachers;
        R = r;
        H = h;
    }
}
