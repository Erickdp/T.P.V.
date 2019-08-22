/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storage.model;

import com.storage.control.MyException;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author erick
 */
public final class Client extends User implements Serializable {

    private static final Long serialVersionUID = -1L;

    private final String id;

    public Client(String id, String firstName, String lastName, String password, String email) throws MyException {
        super(firstName, lastName, password, email);
        if (id.matches("[0-9]")) {
            throw new MyException("Your ID must be numbers.");
        }
        if (id.length() != 10) {
            throw new MyException("Your ID must be 10 digits.");
        }
        this.id = id;
    }

    public Client(String id, String firstName, String lastName, String password, String email, StoreCard storeCard) throws MyException {
        super(firstName, lastName, password, email, storeCard);
        if (id.matches("[0-9]")) {
            throw new MyException("Your ID must be numbers.");
        }
        if (id.length() != 10) {
            throw new MyException("Your ID must be 10 digits.");
        }
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Client other = (Client) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public String getId() {
        return id;
    }

}
