package tech.tokorayane.examjeebackend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import tech.tokorayane.examjeebackend.enums.VehicleStatus;

import java.util.Date;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marque;

    private String model;

    private String matricule;

    private float pricePerDay;

    private Date commissioningDate;

    private VehicleStatus status;

    @ManyToOne
    private Agency agency;
}
