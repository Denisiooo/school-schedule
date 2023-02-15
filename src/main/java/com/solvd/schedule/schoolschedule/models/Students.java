package com.solvd.schedule.schoolschedule.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Students")
@Data
@NoArgsConstructor
public class Students {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    private int StudentId;
    @Column
    private String StudentName;
    @Column
    private String StudentSurname;
    @JoinColumn(name = "classId",referencedColumnName = "id")
    @ManyToOne
    private int ClassId;

}
