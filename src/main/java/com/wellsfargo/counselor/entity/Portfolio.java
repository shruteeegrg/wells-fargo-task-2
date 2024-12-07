package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

public class Portfolio {

    @Id
    @GeneratedValue()
    private Long portfolioId;

    @ManyToOne
    @JoinColumn(name="clientId", nullable = false)
    private Client client;

    @Column(nullable = false)
    private Date creationDate;

    protected Portfolio() {

    }
    public Portfolio(Client client, Date creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }
    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public Date getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

}

