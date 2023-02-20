package com.solvd.schedule.schoolschedule.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonRootName(value = "hromosome")
public class Hromosome {
    @JsonProperty
    private Subjects subjects;
    @JsonProperty
    private Teachers teachers;
    @JsonProperty
    private long R;
    @JsonProperty
    private String H;

    public Hromosome(Subjects subjects, Teachers teachers, long r, String h) {
        this.subjects = subjects;
        this.teachers = teachers;
        R = r;
        H = h;
    }
}
