package com.solvd.schedule.schoolschedule.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@JsonRootName("teacher")
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    @JsonProperty
    private int TeacherId;
    @JsonProperty
    private String TeacherName;
    @Column(name = "TeachersSurname")
    @JsonProperty
    private String TeacherSurname;
    @JsonProperty
    private int TeacherExperience;
    @JsonProperty
    private long R;
    @JsonProperty
    private long H;
}
