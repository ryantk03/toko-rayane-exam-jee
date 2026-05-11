package tech.tokorayane.examjeebackend.web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.tokorayane.examjeebackend.dtos.AgencyDTO;
import tech.tokorayane.examjeebackend.services.AgencyService;

import java.util.List;

@RestController
@RequestMapping("/api/agencies")
@RequiredArgsConstructor
public class AgencyController {

    private final AgencyService agencyService;

    @GetMapping
    public ResponseEntity<List<AgencyDTO>> getAgencies() {
        return ResponseEntity.ok(agencyService.getAgencies());
    }

    @PostMapping
    public ResponseEntity<AgencyDTO> createAgency(@RequestBody AgencyDTO agencyDTO) {
        return ResponseEntity.ok(agencyService.createAgency(agencyDTO));
    }
}
