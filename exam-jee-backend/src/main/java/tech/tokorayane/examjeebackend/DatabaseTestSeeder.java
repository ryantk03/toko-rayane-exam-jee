package tech.tokorayane.examjeebackend;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tech.tokorayane.examjeebackend.entities.Agency;
import tech.tokorayane.examjeebackend.entities.Car;
import tech.tokorayane.examjeebackend.entities.Motorcycle;
import tech.tokorayane.examjeebackend.repositories.AgencyRepository;
import tech.tokorayane.examjeebackend.repositories.VehicleRepository;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DatabaseTestSeeder implements CommandLineRunner {

    private VehicleRepository vehicleRepository;
    private AgencyRepository agencyRepository;

    @Override
    public void run(String... args) {
        this.seedVehicle();
        this.seedAgency();
    }

    private void seedVehicle() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                Motorcycle motorcycle = new Motorcycle();

                vehicleRepository.save(motorcycle);
            } else {
                Car car = new Car();

                vehicleRepository.save(car);
            }
        }
    }

    private void seedAgency() {
        List<String> addressList = new ArrayList<>();
        List<String> cityList = new ArrayList<>();
        List<String> phoneNumberList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Agency agency = new Agency();

            agencyRepository.save(agency);
        }
    }
}
