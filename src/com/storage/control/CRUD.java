/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storage.control;

import java.util.List;

/**
 *
 * @author erick
 */
public interface CRUD<T> {

    /**
     * 
     * @param newRecord
     * @return
     * @throws MyException 
     */
    String create(T newRecord) throws MyException;

    /**
     *
     * @return
     */
    List<T> read();

    /**
     * 
     * @param newRecord
     * @return
     * @throws MyException 
     */
    String update(T newRecord) throws MyException;

    /**
     * 
     * @param oldRecord
     * @return
     * @throws MyException 
     */
    String delete(T oldRecord) throws MyException;

}
