/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storage.control;

import com.storage.model.StoreCard;
import com.storage.model.Client;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erick
 */
public final class ClientTrs extends DataBase<Client> implements CRUD<Client> {

    public ClientTrs() {
        super("Client");
    }

    public Client searchClientByID(String id) throws MyException {
        for (Client listObject : listObjects) {
            if (listObject.getId().equals(id)) {
                return listObject;
            }
        }
        throw new MyException("The ID don't exist.");
    }

    @Override
    public String create(Client newRecord) throws MyException {
        if (listObjects.contains(newRecord)) {
            throw new MyException("The Client you are trying to add, already exist.");
        }
        listObjects.add(newRecord);
        writeFile();
        return "Customer successfully added.";
    }

    @Override
    public List<Client> read() {
        try {
            readFile();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(AdminTrs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listObjects;
    }

    @Override
    public String update(Client newRecord) throws MyException {
        if (!listObjects.contains(newRecord)) {
            throw new MyException("The Client you are trying to update, don't exist.");
        }
        listObjects.set(listObjects.indexOf(newRecord), newRecord);
        writeFile();
        return "Updated client correctly.";
    }

    @Override
    public String delete(Client oldRecord) throws MyException {
        if (!listObjects.remove(oldRecord)) {
            throw new MyException("The Client you are trying to delete, don't exist.");
        }
        writeFile();
        return "Customer removed correctly.";
    }

    @Override
    protected void tDefault() {
        try {
            create(new Client("1726545260", "Enrique", "Pastaz", "0410", "eediazp1@hotmail.com", new StoreCard("0410", 100)));
        } catch (MyException ex) {
            Logger.getLogger(ClientTrs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
