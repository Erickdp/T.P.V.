/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storage.model;

import com.storage.control.MyException;
import com.storage.control.Useful;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author erick
 */
public class StoreCard implements Serializable {

    private static final Long serialVersionUID = -1L;

    private String code;
    private final String id;
    private double cash;
    private final LocalDate expirationDate, openingDate;
    private User client;

    public StoreCard(String code, double cash) throws MyException {
        if (cash < 24) {
            throw new MyException("Please, you initial deposite for Store Card must be greater than $25");
        }
        this.code = code;
        this.id = Useful.idForCard();
        this.cash = cash;
        this.openingDate = LocalDate.now();
        this.expirationDate = LocalDate.of(this.openingDate.getYear() + 3,
                this.openingDate.getMonth(), this.openingDate.getDayOfMonth());
    }

    public final String transfer(double quantity, String option) throws MyException {
        switch (option) {
            case "DEPOSIT":
                if (quantity < 4) {
                    throw new MyException("Your deposit must be al least $5");
                }
                this.cash += (quantity - 0.5);
                return "Deposit made successfully, $0.5 has been discounted.\nCurrent Balance $" + getCash();
            case "RETIREMENT":
                if ((this.cash - quantity) < 1) {
                    throw new MyException("You do not have enough money to make the transfer.\n"
                            + "Current Balance $" + getCash() + " Needed $" + (quantity - this.cash) + " to effect the transfer.");
                }
                this.cash -= quantity;
                return "Transfer successful.\nCurrent Balance $" + getCash();
            default:
                return "Incorrect option, try again.";
        }
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the cash
     */
    public double getCash() {
        return cash;
    }

    /**
     * @return the expirationDate
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * @return the openingDate
     */
    public LocalDate getOpeningDate() {
        return openingDate;
    }

    /**
     * @return the client
     */
    public User getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(User client) {
        this.client = client;
    }

}
