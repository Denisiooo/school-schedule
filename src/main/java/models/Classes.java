package models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Classes")
@Data
public class Classes {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    private int ClassId;
    @Column
    private String ClassTitle;
}
