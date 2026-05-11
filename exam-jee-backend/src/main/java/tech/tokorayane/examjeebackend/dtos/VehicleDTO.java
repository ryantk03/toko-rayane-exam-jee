package tech.tokorayane.examjeebackend.dtos;

import lombok.Getter;
import lombok.Setter;
import tech.tokorayane.examjeebackend.entities.Agency;
import tech.tokorayane.examjeebackend.enums.VehicleStatus;

import java.util.Date;

@Getter
@Setter
public class VehicleDTO {
    private Long id;

    private String marque;

    private String model;

    private String matricule;

    private float pricePerDay;

    private Date commissioningDate;

    private VehicleStatus status;

    private Agency agency;
}
