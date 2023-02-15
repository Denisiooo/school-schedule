package models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Subjects")
@Data
public class Subjects {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    private int SubjectId;
    @Column
    private String SubjectTitle;
}
