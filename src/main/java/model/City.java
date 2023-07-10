package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString

@Entity
@Table (name = "city")
public class City {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "city_id")
    private Integer id;
    @Column (name = "city_name")
    private String cityName;

    public City() {
    }
}