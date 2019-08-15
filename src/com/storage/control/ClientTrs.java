/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storage.control;

import com.storage.model.Client;
import com.storage.model.StoreCard;
import com.storage.model.User;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erick
 */
public final class ClientTrs extends DataBase<User> implements CRUD<User> {

    public ClientTrs(String nameFile) {
        super("Client");
    }

    @Override
    public void create(User newRecord) throws MyException {
        if (listObjects.contains(newRecord)) {
            throw new MyException("The Client you are trying to add, already exist.");
        }
        listObjects.add(newRecord);
        writeFile();
    }

    @Override
    public List<User> read() {
        try {
            readFile();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(AdminTrs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listObjects;
    }

    @Override
    public void update(User newRecord) throws MyException {
        if (!listObjects.contains(newRecord)) {
            throw new MyException("The Client you are trying to update, don't exist.");
        }
        listObjects.set(listObjects.indexOf(newRecord), newRecord);
        writeFile();
    }

    @Override
    public void delete(User oldRecord) throws MyException {
        if (!listObjects.remove(oldRecord)) {
            throw new MyException("The Client you are trying to delete, don't exist.");
        }
        writeFile();
    }

    @Override
    protected void tDefault() {
        try {
            create(new Client("Pedro", "Smith", "abc123", "pedro@hotmail.com", new StoreCard("apv", 50.50)));
        } catch (MyException ex) {
            Logger.getLogger(ClientTrs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
