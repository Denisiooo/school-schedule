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
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO, SEQUENCE, TABLE
    private long ClassId;
    private String ClassTitle;
}
