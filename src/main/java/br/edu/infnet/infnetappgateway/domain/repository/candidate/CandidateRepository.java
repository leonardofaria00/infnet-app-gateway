package br.edu.infnet.infnetappgateway.domain.repository.candidate;

import br.edu.infnet.infnetappgateway.domain.data.model.voting.CandidateResponse;

import java.util.List;

public interface CandidateRepository {

    List<CandidateResponse> getCandidates();
}
