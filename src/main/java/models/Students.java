package models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Students")
@Data
public class Students {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    private int StudentId;
    @Column
    private String StudentName;
    @Column
    private String StudentSurname;
    @Column (name = "KlassId")
    private int ClassId;

}
