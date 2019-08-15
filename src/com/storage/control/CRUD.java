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
     * @throws MyException
     */
    void create(T newRecord) throws MyException;

    /**
     *
     * @return
     */
    List<T> read();

    /**
     *
     * @param newRecord
     * @throws MyException
     */
    void update(T newRecord) throws MyException;

    /**
     *
     * @param oldRecord
     * @throws MyException
     */
    void delete(T oldRecord) throws MyException;

}
