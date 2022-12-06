package br.edu.infnet.infnetappgateway.infrastructure.repository.candidate;

import br.edu.infnet.infnetappgateway.domain.data.model.voting.CandidateResponse;
import br.edu.infnet.infnetappgateway.domain.repository.candidate.CandidateRepository;
import br.edu.infnet.infnetappgateway.infrastructure.integration.candidate.CandidateClient;
import feign.FeignException;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CandidateRepositoryImpl implements CandidateRepository {

    private final CandidateClient candidateClient;
    private final Logger logger;

    public CandidateRepositoryImpl(final CandidateClient candidateClient, final Logger logger) {
        this.candidateClient = candidateClient;
        this.logger = logger;
    }

    @Override
    public List<CandidateResponse> getCandidates() {
        try {
            return candidateClient.getCandidates();
        } catch (final FeignException feignException) {
            logger.error("Error to find candidates. Exception: {}", feignException.toString());
            throw feignException;
        }
    }
}
