package tech.tokorayane.examjeebackend.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import tech.tokorayane.examjeebackend.enums.CarFuelType;
import tech.tokorayane.examjeebackend.enums.CarGearBox;

@Entity
@Getter
@Setter
public class Car extends Vehicle {
    private int nbrDoor;

    private CarFuelType fuelType;

    private CarGearBox gearBox;
}
