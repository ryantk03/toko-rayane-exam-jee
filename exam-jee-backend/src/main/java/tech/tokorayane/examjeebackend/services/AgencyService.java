package tech.tokorayane.examjeebackend.services;

import tech.tokorayane.examjeebackend.dtos.AgencyDTO;

import java.util.List;
import java.util.stream.Collectors;

public interface AgencyService {

    public List<AgencyDTO> getAgencies();

    public AgencyDTO createAgency(AgencyDTO agencyDTO);
}
