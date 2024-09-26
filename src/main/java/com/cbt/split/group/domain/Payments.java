/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.split.group.domain;

import com.cbt.split.user.domain.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author neeraj
 */
@Entity
@Table(name = "s_payments")
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "payer_id", nullable = false)
    private User payerId;

    @ManyToOne
    @JoinColumn(name = "payee_id", nullable = false)
    private User payeeId;

    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "expense_id", nullable = false)
    private Expenses expensesId;

    @Column(name = "payment_date", nullable = false)
    private LocalDateTime paymentDate;

    public Payments() {
    }

    public Payments(Long id, User payerId, User payeeId, BigDecimal amount, Expenses expensesId, LocalDateTime paymentDate) {
        this.id = id;
        this.payerId = payerId;
        this.payeeId = payeeId;
        this.amount = amount;
        this.expensesId = expensesId;
        this.paymentDate = paymentDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getPayerId() {
        return payerId;
    }

    public void setPayerId(User payerId) {
        this.payerId = payerId;
    }

    public User getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(User payeeId) {
        this.payeeId = payeeId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Expenses getExpensesId() {
        return expensesId;
    }

    public void setExpensesId(Expenses expensesId) {
        this.expensesId = expensesId;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

}
