/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tpv.funcional.control.util;

import java.util.Scanner;

/**
 * Clase que representa las operaciones utilitarias de lectura
 * @author Erick Díaz
 */
public class UtilLectura {
    
    private static Scanner leer;
    /**
     * Método que lee desde teclado
     */
    public static String leerTeclado() {
        String valorALeer = null;
        leer = new Scanner(System.in);
        return valorALeer = leer.next();
    }
    
}
