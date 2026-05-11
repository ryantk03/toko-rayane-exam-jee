package tech.tokorayane.examjeebackend.web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.tokorayane.examjeebackend.dtos.VehicleDTO;
import tech.tokorayane.examjeebackend.services.VehicleService;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
@RequiredArgsConstructor
public class VehicleController {

    private final VehicleService vehicleService;

    @GetMapping
    public ResponseEntity<List<VehicleDTO>> getVehicles() {
        return ResponseEntity.ok(vehicleService.getVehicleRepository());
    }
}