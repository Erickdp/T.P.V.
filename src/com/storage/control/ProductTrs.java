/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storage.control;

import com.storage.model.Product;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erick
 */
public final class ProductTrs extends DataBase<Product> implements CRUD<Product> {

    public ProductTrs() {
        super("Product");
    }

    @Override
    public String create(Product newRecord) throws MyException {
        if (listObjects.contains(newRecord)) {
            throw new MyException("The Product you are trying create, already exist.");
        }
        listObjects.add(newRecord);
        writeFile();
        return null;
    }

    @Override
    public List<Product> read() {
        try {
            readFile();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(AdminTrs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listObjects;
    }

    @Override
    public String update(Product newRecord) throws MyException {
        if (!listObjects.contains(newRecord)) {
            throw new MyException("The Product you are trying to update, don't exist.");
        }
        listObjects.set(listObjects.indexOf(newRecord), newRecord);
        writeFile();
        return null;
    }

    @Override
    public String delete(Product oldRecord) throws MyException {
        if (!listObjects.remove(oldRecord)) {
            throw new MyException("The Product you are trying to delete, don't exist.");
        }
        writeFile();
        return null;
    }

    @Override
    protected void tDefault() {
        try {
            create(new Product("Atún", 1.50));
            create(new Product("Arroz", 15.30));
            create(new Product("Queso", 1.00));
            create(new Product("Pincho", 3.25));
        } catch (MyException ex) {
            Logger.getLogger(ProductTrs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
