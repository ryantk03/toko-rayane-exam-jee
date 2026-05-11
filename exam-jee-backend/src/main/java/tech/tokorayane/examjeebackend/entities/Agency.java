package tech.tokorayane.examjeebackend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    private String city;

    private String phoneNumber;

    @OneToMany(mappedBy = "agency")
    private List<Vehicle> vehicles;
}
