package tech.tokorayane.examjeebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.tokorayane.examjeebackend.entities.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
