package tech.tokorayane.examjeebackend.mappers;

import org.springframework.stereotype.Component;
import tech.tokorayane.examjeebackend.dtos.AgencyDTO;
import tech.tokorayane.examjeebackend.entities.Agency;

@Component
public class AgencyMapperImpl {

    public AgencyDTO fromAgency(Agency agency) {
        AgencyDTO agencyDTO = new AgencyDTO();

        agencyDTO.setId(agency.getId());
        agencyDTO.setName(agency.getName());
        agencyDTO.setCity(agency.getCity());
        agencyDTO.setAddress(agency.getAddress());
        agencyDTO.setPhoneNumber(agency.getPhoneNumber());

        return agencyDTO;
    }

    public Agency fromAgencyDTO(AgencyDTO agencyDTO) {
        Agency agency = new Agency();

        agency.setName(agencyDTO.getName());
        agency.setAddress(agencyDTO.getAddress());
        agency.setCity(agencyDTO.getCity());
        agency.setPhoneNumber(agencyDTO.getPhoneNumber());

        return agency;
    }
}
