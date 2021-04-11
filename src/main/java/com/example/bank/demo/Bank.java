package com.example.bank.demo;

import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "bank")
public class Bank{

    @Id
    private String accountNumber;
    private String holderName;
    


    /**
     * @return String return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return String return the holderName
     */
    public String getHolderName() {
        return holderName;
    }

    /**
     * @param holderName the holderName to set
     */
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

}