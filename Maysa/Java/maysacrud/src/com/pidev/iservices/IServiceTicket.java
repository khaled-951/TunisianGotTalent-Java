/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pidev.iservices;

import java.sql.SQLException;
import java.util.List;




import com.pidev.entities.evenement;
import com.pidev.entities.ticket;

import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author maysa1998
 */
public interface IServiceTicket<T> {
    
        void ajouter(T t) throws SQLException;
    boolean delete(T t) throws SQLException;
    List<T> readAll() throws SQLException;
    public ticket findById(int idTicket) throws SQLException;
    
}
