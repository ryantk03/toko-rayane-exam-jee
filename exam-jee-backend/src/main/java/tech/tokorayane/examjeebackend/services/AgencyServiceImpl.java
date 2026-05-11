package tech.tokorayane.examjeebackend.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.tokorayane.examjeebackend.dtos.AgencyDTO;
import tech.tokorayane.examjeebackend.entities.Agency;
import tech.tokorayane.examjeebackend.mappers.AgencyMapperImpl;
import tech.tokorayane.examjeebackend.repositories.AgencyRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AgencyServiceImpl implements AgencyService {
    private final AgencyRepository agencyRepository;
    private final AgencyMapperImpl agencyMapper;

    public List<AgencyDTO> getAgencies() {
        return agencyRepository.findAll().stream().map(agencyMapper::fromAgency).collect(Collectors.toList());
    }

    public AgencyDTO createAgency(AgencyDTO agencyDTO) {
        Agency agency = agencyMapper.fromAgencyDTO(agencyDTO);

        agencyRepository.save(agency);
        return  agencyDTO;
    }
}
