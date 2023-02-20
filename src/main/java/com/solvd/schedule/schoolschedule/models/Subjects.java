package com.solvd.schedule.schoolschedule.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonRootName("subject")
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    @JsonProperty
    private int SubjectId;
    @JsonProperty
    private String SubjectTitle;
    @JsonProperty
    private long R;
    @JsonProperty
    private long H;
}
