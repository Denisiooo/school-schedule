package com.solvd.schedule.schoolschedule.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "classess")
@NoArgsConstructor
public class Classes {
    @Id
    @Column(name = "ClassId")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO, SEQUENCE, TABLE
    private long ClassId;
    @Column(name = "ClassTitle")
    private String ClassTitle;
}
