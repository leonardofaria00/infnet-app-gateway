package br.edu.infnet.infnetappgateway.infrastructure.integration.candidate;

import br.edu.infnet.infnetappgateway.domain.data.model.voting.CandidateResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "voting-api")
public interface CandidateClient {

    @GetMapping(
            path = "/voting/v1/candidate",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    List<CandidateResponse> getCandidates();
}
