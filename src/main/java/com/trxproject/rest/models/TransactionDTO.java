package com.trxproject.rest.models;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class TransactionDTO implements Serializable {

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Amount amount;

    private String bankref;

    private LocalDate bookingDate;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private AccountDTO counterPartyAccount;

    private String creditDebitIndicator;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private DetailsDTO details;

    private String id;

    private String ownAccountNumber;

    private LocalDate postingDate;

    private String productBankRef;

    private String specificSymbol;

    private String statementNumber;

    private String statementPeriod;

    private String transactionId;

    private String transactionType;

    private Integer transactionTypeCode;

    private String variableSymbol;

    public TransactionDTO() {
        super();
    }

    public TransactionDTO(Transaction transaction) {
        this.amount = new Amount(transaction.getCurrency(), transaction.getAmount());
        this.bankref = transaction.getBankref();
        this.bookingDate = transaction.getBookingDate();
        this.counterPartyAccount = new AccountDTO(transaction.getCounterPartyAccount());
        this.creditDebitIndicator = transaction.getCreditDebitIndicator();
        this.details = new DetailsDTO(transaction.getDetail1());
        this.id = transaction.getId1();
        this.ownAccountNumber = transaction.getOwnAccountNumber();
        this.postingDate = transaction.getPostingDate();
        this.productBankRef = transaction.getProductBankRef();
        this.specificSymbol = transaction.getSpecificSymbol();
        this.statementNumber = transaction.getStatement().getNumber();
        this.statementPeriod = transaction.getStatement().getPeriod();
        this.transactionId = transaction.getTransactionId();
        this.transactionType = transaction.getTransactionType().getType();
        this.transactionTypeCode = transaction.getTransactionType().getCode();
        this.variableSymbol = transaction.getVariableSymbol();
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public String getBankref() {
        return bankref;
    }

    public void setBankref(String bankref) {
        this.bankref = bankref;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public AccountDTO getCounterPartyAccount() {
        return counterPartyAccount;
    }

    public void setCounterPartyAccount(AccountDTO counterPartyAccount) {
        this.counterPartyAccount = counterPartyAccount;
    }

    public String getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    public void setCreditDebitIndicator(String creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    public DetailsDTO getDetails() {
        return this.details;
    }

    public void setDetails(DetailsDTO details) {
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnAccountNumber() {
        return ownAccountNumber;
    }

    public void setOwnAccountNumber(String ownAccountNumber) {
        this.ownAccountNumber = ownAccountNumber;
    }

    public LocalDate getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(LocalDate postingDate) {
        this.postingDate = postingDate;
    }

    public String getProductBankRef() {
        return productBankRef;
    }

    public void setProductBankRef(String productBankRef) {
        this.productBankRef = productBankRef;
    }

    public String getSpecificSymbol() {
        return specificSymbol;
    }

    public void setSpecificSymbol(String specificSymbol) {
        this.specificSymbol = specificSymbol;
    }

    public String getStatementNumber() {
        return statementNumber;
    }

    public void setStatementNumber(String statementNumber) {
        this.statementNumber = statementNumber;
    }

    public String getStatementPeriod() {
        return statementPeriod;
    }

    public void setStatementPeriod(String statementPeriod) {
        this.statementPeriod = statementPeriod;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Integer getTransactionTypeCode() {
        return transactionTypeCode;
    }

    public void setTransactionTypeCode(Integer transactionTypeCode) {
        this.transactionTypeCode = transactionTypeCode;
    }

    public String getVariableSymbol() {
        return variableSymbol;
    }

    public void setVariableSymbol(String variableSymbol) {
        this.variableSymbol = variableSymbol;
    }
}



