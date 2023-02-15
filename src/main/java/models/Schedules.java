package models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Schedules")
@Data
public class Schedules {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    private int SchedulesId;
    @Column
    private int TeacherId;
    @Column
    private int LessonId;
    @Column
    private int ClassroomId;
    @Column
    private int WeekdaysId;
    @Column (name="KlassId")
    private int ClassId;

}
