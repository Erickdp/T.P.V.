/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tpv.funcional.modelo;

import java.time.LocalDate;

/**
 *
 * @author Erick Díaz
 */
public class Factura {
    
    private short idFactura;
    private LocalDate fechaPago;
    private String direccionEnvio;
    private double montoTotal;
    private byte numeroProductos;

    public Factura(short idFactura, LocalDate fechaPago, String direccionEnvio, double montoTotal, byte numeroProductos) {
        this.idFactura = idFactura;
        this.fechaPago = fechaPago;
        this.direccionEnvio = direccionEnvio;
        this.montoTotal = montoTotal;
        this.numeroProductos = numeroProductos;
    }

    public byte getNumeroProductos() {
        return numeroProductos;
    }

    public void setNumeroProductos(byte numeroProductos) {
        this.numeroProductos = numeroProductos;
    }

    public short getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(short idFactura) {
        this.idFactura = idFactura;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", fechaPago=" + fechaPago + ", direccionEnvio=" + direccionEnvio + ", montoTotal=" + montoTotal + ", numeroProductos=" + numeroProductos + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idFactura;
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
        final Factura other = (Factura) obj;
        if (this.idFactura != other.idFactura) {
            return false;
        }
        return true;
    }
}
