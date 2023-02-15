package com.solvd.schedule.schoolschedule.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Lessons")
@Data
@NoArgsConstructor
public class Lessons {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    private int LessonId;
    @Column
    private int LessonNumber;
    @Column
    private LocalDateTime StartTime;
    @Column
    private LocalDateTime EndTime;
}
