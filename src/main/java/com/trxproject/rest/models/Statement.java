package com.trxproject.rest.models;

import org.hibernate.annotations.Nationalized;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "statement")
public class Statement {
    @Id
    @Column(name = "statementId", nullable = false)
    private Long id;

    @Nationalized
    @Column(name = "number", nullable = false, length = 20)
    private String number;

    @Nationalized
    @Column(name = "period", nullable = false, length = 20)
    private String period;

    @Nationalized
    @Column(name = "description", length = 1000)
    private String description;

    public Statement() {super();}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}