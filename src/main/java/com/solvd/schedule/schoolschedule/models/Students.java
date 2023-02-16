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
    private long StudentId;
    @Column
    private String StudentName;
    @Column
    private String StudentSurname;
    @JoinColumn(name = "klassId",referencedColumnName = "ClassId")
    @ManyToOne
    private Classes ClassId;

}
