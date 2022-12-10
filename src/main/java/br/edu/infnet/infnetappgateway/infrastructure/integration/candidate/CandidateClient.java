package br.edu.infnet.infnetappgateway.infrastructure.integration.candidate;

import br.edu.infnet.infnetappgateway.infrastructure.data.model.candidate.CandidateDocumentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "${integration.api.voting.name}")
public interface CandidateClient {

    @GetMapping(
            path = "${integration.api.voting.get-candidates}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    List<CandidateDocumentResponse> getCandidates();
}
