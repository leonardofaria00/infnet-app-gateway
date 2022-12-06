package br.edu.infnet.infnetappgateway.domain.data.model.voting;

import java.math.BigInteger;

public class CandidateResponse {

    private String uuid;

    private BigInteger amountVote;

    private String name;

    private String politicalParty;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public BigInteger getAmountVote() {
        return amountVote;
    }

    public void setAmountVote(BigInteger amountVote) {
        this.amountVote = amountVote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        this.politicalParty = politicalParty;
    }
}
