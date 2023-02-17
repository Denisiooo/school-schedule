package com.solvd.schedule.schoolschedule.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Teachers")
@Data
@NoArgsConstructor
public class Teachers {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    private int TeacherId;
    @Column(name = "TeacherName")
    private String TeacherName;
    @Column(name = "TeachersSurname")
    private String TeacherSurname;
    @Column(name = "TeacherExperience")
    private int TeacherExperience;
    @Column
    private long R;
    @Column
    private long H;
}
