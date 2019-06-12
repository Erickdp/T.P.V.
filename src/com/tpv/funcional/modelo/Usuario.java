/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tpv.funcional.modelo;

import java.util.Objects;

/**
 *
 * @author Erick Díaz
 */
public class Usuario{
    
    private String userName;
    private String password;
    private String direccion;
    private Tarjeta tarjetaDePago;

    public Usuario(String userName, String password, String direccion, Tarjeta tarjetaDePago) {
        this.userName = userName;
        this.password = password;
        this.direccion = direccion;
        this.tarjetaDePago = tarjetaDePago;
    }

    public Tarjeta getTarjetaDePago() {
        return tarjetaDePago;
    }

    public void setTarjetaDePago(Tarjeta tarjetaDePago) {
        this.tarjetaDePago = tarjetaDePago;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "userName=" + userName + ", password=" + password + ", direccion=" + direccion + ", tarjetaDePago=" + tarjetaDePago + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.userName);
        hash = 97 * hash + Objects.hashCode(this.tarjetaDePago);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(this.tarjetaDePago, other.tarjetaDePago)) {
            return false;
        }
        return true;
    }
    
}
