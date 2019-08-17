/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storage.control;

import com.storage.model.Admin;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erick
 */
public final class AdminTrs extends DataBase<Admin> implements CRUD<Admin> {

    public AdminTrs() {
        super("Admin");
    }

    @Override
    public String create(Admin newRecord) throws MyException {
        if (listObjects.contains(newRecord)) {
            throw new MyException("The Admin you are trying to add, already exist.");
        }
        listObjects.add(newRecord);
        writeFile();
        return "Administrator successfully added.";
    }

    @Override
    public List<Admin> read() {
        try {
            readFile();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(AdminTrs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listObjects;
    }

    @Override
    public String update(Admin newRecord) throws MyException {
        if (!listObjects.contains(newRecord)) {
            throw new MyException("The Admin you are trying to update, don't exist.");
        }
        listObjects.set(listObjects.indexOf(newRecord), newRecord);
        writeFile();
        return "Updated Administrator correctly.";
    }

    @Override
    public String delete(Admin oldRecord) throws MyException {
        if (!listObjects.remove(oldRecord)) {
            throw new MyException("The Admin you are trying to delete, don't exist.");
        }
        writeFile();
        return "Administrator removed correctly.";
    }

    @Override
    protected void tDefault() {
        try {
            create(new Admin("CEO", "Erick", "Díaz", "0410", "erickdp@hotmail.com"));
        } catch (MyException ex) {
            Logger.getLogger(AdminTrs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
