package br.edu.infnet.infnetappgateway.application.controller.candidate;

import br.edu.infnet.infnetappgateway.domain.data.model.voting.CandidateResponse;
import br.edu.infnet.infnetappgateway.domain.service.candidate.CandidateService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/voting/v1/voting-api")
public class CandidateController implements CandidateApi {

    private final CandidateService candidateService;

    public CandidateController(final CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @Override
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CandidateResponse> getCandidates() {
        return candidateService.getCandidates();
    }
}
