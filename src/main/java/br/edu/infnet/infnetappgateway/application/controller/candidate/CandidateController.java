package br.edu.infnet.infnetappgateway.application.controller.candidate;

import br.edu.infnet.infnetappgateway.domain.data.model.candidate.Candidate;
import br.edu.infnet.infnetappgateway.domain.data.model.candidate.CandidateResponse;
import br.edu.infnet.infnetappgateway.domain.mapper.candidate.CandidateMapper;
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
    private final CandidateMapper candidateMapper;

    public CandidateController(final CandidateService candidateService, final CandidateMapper candidateMapper) {
        this.candidateService = candidateService;
        this.candidateMapper = candidateMapper;
    }

    @Override
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CandidateResponse> getCandidates() {
        final List<Candidate> candidates = candidateService.getCandidates();
        return candidateMapper.toCandidatesResponse(candidates);
    }
}
