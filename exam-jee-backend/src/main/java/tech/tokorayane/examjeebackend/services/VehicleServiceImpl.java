package tech.tokorayane.examjeebackend.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.tokorayane.examjeebackend.dtos.VehicleDTO;
import tech.tokorayane.examjeebackend.mappers.VehicleMapperImpl;
import tech.tokorayane.examjeebackend.repositories.VehicleRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;
    private final VehicleMapperImpl vehicleMapper;

    public List<VehicleDTO> getVehicleRepository() {
        return vehicleRepository.findAll().stream().map(vehicleMapper::fromVehicle).collect(Collectors.toList());
    }
}
