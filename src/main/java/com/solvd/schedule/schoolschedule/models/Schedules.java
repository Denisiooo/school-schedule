package com.solvd.schedule.schoolschedule.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Schedules")
@Data
@NoArgsConstructor
public class Schedules {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO, SEQUENCE, TABLE
    private long SchedulesId;
    @JoinColumn(name = "teacher_Id",referencedColumnName = "TeacherId")
    @ManyToOne(cascade = CascadeType.ALL)
    private Teachers TeacherId;
    @JoinColumn(name = "Lesson_Id",referencedColumnName = "LessonId")
    @ManyToOne(cascade = CascadeType.ALL)
    private Lessons LessonId;
    private long ClassroomId;
    @JoinColumn(name = "Weekday_Id",referencedColumnName = "WeekdayId")
    @ManyToOne(cascade = CascadeType.ALL)
    private Weekdays WeekdaysId;
    @JoinColumn(name = "Klass_Id",referencedColumnName = "ClassId")
    @ManyToOne(cascade = CascadeType.ALL)
    private Classes ClassId;

}
