package br.edu.infnet.infnetappgateway.domain.mapper.candidate;

import br.edu.infnet.infnetappgateway.domain.data.model.candidate.Candidate;
import br.edu.infnet.infnetappgateway.domain.data.model.candidate.CandidateResponse;
import br.edu.infnet.infnetappgateway.infrastructure.data.model.candidate.CandidateDocumentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CandidateMapper {

    List<Candidate> toCandidates(List<CandidateDocumentResponse> candidates);

    List<CandidateResponse> toCandidatesResponse(List<Candidate> candidates);
}
