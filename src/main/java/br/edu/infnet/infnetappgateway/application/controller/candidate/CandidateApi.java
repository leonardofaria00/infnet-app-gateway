package br.edu.infnet.infnetappgateway.application.controller.candidate;

import br.edu.infnet.infnetappgateway.domain.data.model.candidate.CandidateResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

public interface CandidateApi {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<CandidateResponse> getCandidates();
}
