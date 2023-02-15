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
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    private int SchedulesId;
    @JoinColumn(name = "teacherId",referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL)
    private int TeacherId;
    @JoinColumn(name = "lessonId",referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL)
    private int LessonId;
    @JoinColumn(name = "classroomId",referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL)
    private int ClassroomId;
    @JoinColumn(name = "weekdaysId",referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL)
    private int WeekdaysId;
    @JoinColumn(name = "classId",referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL)
    private int ClassId;

}
