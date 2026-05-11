package tech.tokorayane.examjeebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.tokorayane.examjeebackend.entities.Agency;

public interface AgencyRepository extends JpaRepository<Agency, Long> {
}
