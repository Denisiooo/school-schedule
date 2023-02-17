package com.solvd.schedule.schoolschedule.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    private int SubjectId;
    private String SubjectTitle;
    private long R;
    private long H;
}
