package tech.tokorayane.examjeebackend.services;

import tech.tokorayane.examjeebackend.dtos.VehicleDTO;

import java.util.List;
import java.util.stream.Collectors;

public interface VehicleService {

    public List<VehicleDTO> getVehicleRepository();
}
