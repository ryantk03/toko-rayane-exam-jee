package tech.tokorayane.examjeebackend.mappers;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import tech.tokorayane.examjeebackend.dtos.VehicleDTO;
import tech.tokorayane.examjeebackend.entities.Vehicle;

@Component
public class VehicleMapperImpl {

    public VehicleDTO fromVehicle(Vehicle vehicle) {
        VehicleDTO vehicleDTO = new VehicleDTO();

        BeanUtils.copyProperties(vehicle, vehicleDTO);

        return vehicleDTO;
    }
}
