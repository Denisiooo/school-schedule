package models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Classrooms")
@Data
public class Classrooms {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    private int ClassroomId;
    @Column
    private int ClassroomNumber;
}
