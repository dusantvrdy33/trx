package com.trxproject.rest.models;

import org.hibernate.annotations.Nationalized;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "transactionType")
public class TransactionType {
    @Id
    @Column(name = "trxTypeId", nullable = false)
    private Long id;

    @Nationalized
    @Column(name = "type", nullable = false, length = 20)
    private String type;

    @Column(name = "code", nullable = false)
    private Integer code;

    public TransactionType() {super();}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}