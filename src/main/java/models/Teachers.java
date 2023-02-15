package models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Teachers")
@Data
public class Teachers {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    private int TeacherId;
    @Column
    private String TeacherName;
    @Column
    private String TeacherSurname;
    @Column
    private int TeacherExperience;
}
