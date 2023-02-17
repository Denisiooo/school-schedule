package com.solvd.schedule.schoolschedule.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Lessons {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    private int LessonId;
    private int LessonNumber;
    private LocalDateTime StartTime;
    private LocalDateTime EndTime;
}
