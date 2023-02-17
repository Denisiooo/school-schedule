package com.solvd.schedule.schoolschedule.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Classrooms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ClassroomId", nullable = false)
    private Long id;
    private int ClassroomNumber;

}
