package com.trxproject.rest.models;

public class AccountDTO {

    private String accountName;

    private String accountNumber;

    private String bankCode;

    public AccountDTO(Account account) {
        this.accountName = account.getName();
        this.accountNumber = account.getNumber();
        this.bankCode = account.getCode();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
}
