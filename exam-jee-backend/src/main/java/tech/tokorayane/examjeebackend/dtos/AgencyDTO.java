package tech.tokorayane.examjeebackend.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgencyDTO {
    private Long id;

    private String name;

    private String address;

    private String city;

    private String phoneNumber;
}
