package tech.tokorayane.examjeebackend;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tech.tokorayane.examjeebackend.entities.Agency;
import tech.tokorayane.examjeebackend.entities.Car;
import tech.tokorayane.examjeebackend.entities.Motorcycle;
import tech.tokorayane.examjeebackend.enums.MotorcycleType;
import tech.tokorayane.examjeebackend.enums.VehicleStatus;
import tech.tokorayane.examjeebackend.repositories.AgencyRepository;
import tech.tokorayane.examjeebackend.repositories.VehicleRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@RequiredArgsConstructor
public class DatabaseTestSeeder implements CommandLineRunner {

    private final VehicleRepository vehicleRepository;
    private final AgencyRepository agencyRepository;

    @Override
    public void run(String... args) {
        List<Agency> agencies = this.seedAgencies();
        this.seedVehicles(agencies);
    }

    private List<Agency> seedAgencies() {
        List<Agency> saved = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Agency agency = new Agency();
            agency.setAddress("Address " + i);
            agency.setCity("City " + i);
            agency.setPhoneNumber("060000000" + i);
            agencyRepository.save(agency);
            saved.add(agencyRepository.save(agency));
        }

        return saved;
    }

    private void seedVehicles(List<Agency> agencies) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                Motorcycle motorcycle = new Motorcycle();
                motorcycle.setMarque("Yamaha");
                motorcycle.setModel("MT-07");
                motorcycle.setMatricule("MC-" + i);
                motorcycle.setPricePerDay(200);
                motorcycle.setStatus(VehicleStatus.AVAILABLE);
                motorcycle.setAgency(agencies.get(i % agencies.size()));
                motorcycle.setCylinder(600);
                motorcycle.setType(MotorcycleType.SPORT);
                motorcycle.setHelmetIncluded(true);
                vehicleRepository.save(motorcycle);
            } else {
                Car car = new Car();
                car.setMarque("Renault");
                car.setModel("Clio");
                car.setMatricule("CAR-" + i);
                car.setPricePerDay(300);
                car.setStatus(VehicleStatus.AVAILABLE);
                car.setAgency(agencies.get(i % agencies.size()));
                vehicleRepository.save(car);
            }
        }
    }
}
