package com.mii.poc.ledger.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author vinch
 */
@Entity
@Table
public class Ledger implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    
    @Column
    private Double debit;
    
    @Column
    private Double credit;
    
    @Column
    private Long accountId;
    
    @Column
    private String transactionDesc;
    
    @Column
    private LocalDateTime updateAt;
    
    @Column
    private LocalDateTime createdAt;
    
    public Ledger() {
        updateAt = LocalDateTime.now();
        createdAt = LocalDateTime.now();
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the debit
     */
    public Double getDebit() {
        return debit;
    }

    /**
     * @param debit the debit to set
     */
    public void setDebit(Double debit) {
        this.debit = debit;
    }

    /**
     * @return the credit
     */
    public Double getCredit() {
        return credit;
    }

    /**
     * @param credit the credit to set
     */
    public void setCredit(Double credit) {
        this.credit = credit;
    }

    /**
     * @return the accountId
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * @param accountId the accountId to set
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * @return the transactionDesc
     */
    public String getTransactionDesc() {
        return transactionDesc;
    }

    /**
     * @param transactionDesc the transactionDesc to set
     */
    public void setTransactionDesc(String transactionDesc) {
        this.transactionDesc = transactionDesc;
    }

    /**
     * @return the updateAt
     */
    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    /**
     * @param updateAt the updateAt to set
     */
    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * @return the createdAt
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    
}
