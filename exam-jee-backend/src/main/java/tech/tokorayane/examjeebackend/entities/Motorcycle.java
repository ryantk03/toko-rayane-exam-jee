package tech.tokorayane.examjeebackend.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import tech.tokorayane.examjeebackend.enums.MotorcycleType;

@Entity
@Getter
@Setter
public class Motorcycle extends Vehicle {
    private int cylinder;

    private MotorcycleType type;

    private boolean helmetIncluded;
}
