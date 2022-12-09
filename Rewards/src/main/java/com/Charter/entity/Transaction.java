package com.Charter.entity;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
public class Transaction
{
    @Id
    @Column(name="transaction_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionId;

    @Column(name="transaction_date")
    private Date transactionDate;

    @Column(name="purchase_total")
    private float purchaseTotal;
    public Transaction() {}
    public Transaction(Date transactionDate, float purchaseTotal) {
        this.transactionDate = transactionDate;
        this.purchaseTotal = purchaseTotal;
    }
    public Integer getTransactionId() {return transactionId;}
    public void setTransactionId(Integer transactionId) {this.transactionId = transactionId;}
    public Date getTransactionDate() {return transactionDate;}
    public void setTransactionDate(Date transactionDate) {this.transactionDate = transactionDate;}
    public float getPurchaseTotal() {return purchaseTotal;}
    public void setPurchaseTotal(float purchaseTotal) {this.purchaseTotal = purchaseTotal;}

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", transactionDate=" + transactionDate +
                ", purchaseTotal=" + purchaseTotal +
                '}';
    }
}