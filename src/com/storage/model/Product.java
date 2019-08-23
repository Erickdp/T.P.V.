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
public final class Product implements Serializable {

    private static final Long serialVersionUID = -1L;

    private String code;
    private String nameProduct;
    private double price;
    private boolean stock;
    private int units = 1;

    public Product(String nameProduct, double price) throws MyException {
        if (price <= 0) {
            throw new MyException("Please, the product price must be greater than $0");
        }
        this.code = Useful.idForProduct();
        this.nameProduct = nameProduct;
        this.price = price;
        stock = true;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getCode() {
        return code;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.code);
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
        final Product other = (Product) obj;
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        return true;
    }

}
