/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storage.model;

import com.storage.control.MyException;
import java.io.Serializable;

/**
 *
 * @author erick
 */
public final class Client extends User implements Serializable {

    private static final Long serialVersionUID = -1L;

    public Client(String firstName, String lastName, String password, String email, StoreCard storeCard) throws MyException {
        super(firstName, lastName, password, email, storeCard);
    }

}
