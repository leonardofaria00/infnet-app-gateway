package br.edu.infnet.infnetappgateway.infrastructure.repository.candidate;

import br.edu.infnet.infnetappgateway.domain.data.model.candidate.Candidate;
import br.edu.infnet.infnetappgateway.domain.mapper.candidate.CandidateMapper;
import br.edu.infnet.infnetappgateway.domain.repository.candidate.CandidateRepository;
import br.edu.infnet.infnetappgateway.infrastructure.data.model.candidate.CandidateDocumentResponse;
import br.edu.infnet.infnetappgateway.infrastructure.integration.candidate.CandidateClient;
import feign.FeignException;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CandidateRepositoryImpl implements CandidateRepository {

    private final CandidateClient candidateClient;
    private final Logger logger;

    private final CandidateMapper candidateMapper;

    public CandidateRepositoryImpl(
            final CandidateClient candidateClient,
            final Logger logger,
            final CandidateMapper candidateMapper) {
        this.candidateClient = candidateClient;
        this.logger = logger;
        this.candidateMapper = candidateMapper;
    }

    @Override
    public List<Candidate> getCandidates() {
        try {
            final List<CandidateDocumentResponse> candidates = candidateClient.getCandidates();
            return candidateMapper.toCandidates(candidates);
        } catch (final FeignException feignException) {
            logger.error("Error to find candidates. Exception: {}", feignException.toString());
            throw feignException;
        }
    }
}
