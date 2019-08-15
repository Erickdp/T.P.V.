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
    private String id;
    private double cash;
    private LocalDate expirationDate;

    public StoreCard(String code, double cash) throws MyException {
        if (cash <= 0 | cash <= 25) {
            throw new MyException("Please, you initial deposite for Store Card must be greater than $0 and $25");
        }
        this.code = code;
        this.cash = cash;
        this.id = Useful.idForCard();
        this.expirationDate = LocalDate.now();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public String getId() {
        return id;
    }

}
