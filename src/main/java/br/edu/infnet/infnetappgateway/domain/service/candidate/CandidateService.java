package br.edu.infnet.infnetappgateway.domain.service.candidate;

import br.edu.infnet.infnetappgateway.domain.data.model.candidate.Candidate;
import br.edu.infnet.infnetappgateway.domain.repository.candidate.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;

    public CandidateService(final CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public List<Candidate> getCandidates() {
        return candidateRepository.getCandidates();
    }
}
