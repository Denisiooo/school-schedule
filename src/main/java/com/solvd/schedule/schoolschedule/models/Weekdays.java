package com.solvd.schedule.schoolschedule.models;


import com.solvd.schedule.schoolschedule.services.WeekdaysService;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "Weekdays")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Weekdays {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    private long WeekdayId;
    @Column
    private String DayName;

}
