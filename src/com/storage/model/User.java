/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storage.model;

import com.storage.control.MyException;
import com.storage.control.Useful;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author erick
 */
public abstract class User implements Serializable {

    private static final Long serialVersionUID = -1L;

    private final String firstName;
    private final String lastName;
    private String password;
    private String email;
    private StoreCard storeCard;

    public User(String firstName, String lastName, String password, String email) throws MyException {
        if (!Useful.checkMail(email)) {
            throw new MyException("Please, enter a valid mail.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public User(String firstName, String lastName, String password, String email, StoreCard storeCard) throws MyException {
        if (!Useful.checkMail(email)) {
            throw new MyException("Please, enter a valid mail.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.storeCard = storeCard;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    public StoreCard getStoreCard() {
        return storeCard;
    }

    public void setStoreCard(StoreCard storeCard) {
        this.storeCard = storeCard;
    }

}
