package com.solvd.schedule.schoolschedule.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    private int TeacherId;
    private String TeacherName;
    @Column(name = "TeachersSurname")
    private String TeacherSurname;
    private int TeacherExperience;
    private long R;
    private long H;
}
