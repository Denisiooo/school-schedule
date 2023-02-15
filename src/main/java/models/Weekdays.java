package models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "Weekdays")
@Data
public class Weekdays {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO, SEQUENCE, TABLE
    private int WeekdaysId;
    @Column
    private String DayName;

}
