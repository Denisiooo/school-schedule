package com.solvd.schedule.schoolschedule.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Classes")
@Data
@NoArgsConstructor
public class Classes {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    private int ClassId;
    @Column
    private String ClassTitle;
}
