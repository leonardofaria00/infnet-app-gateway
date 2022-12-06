package br.edu.infnet.infnetappgateway.domain.repository.candidate;

import br.edu.infnet.infnetappgateway.domain.data.model.candidate.Candidate;

import java.util.List;

public interface CandidateRepository {

    List<Candidate> getCandidates();
}
