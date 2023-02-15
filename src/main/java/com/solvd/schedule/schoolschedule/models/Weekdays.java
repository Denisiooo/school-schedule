package com.solvd.schedule.schoolschedule.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "Weekdays")
@Data
@NoArgsConstructor
public class Weekdays {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    private int WeekdaysId;
    @Column
    private String DayName;

}
