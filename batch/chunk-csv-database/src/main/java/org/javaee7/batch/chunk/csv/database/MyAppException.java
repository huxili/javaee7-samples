/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javaee7.batch.chunk.csv.database;

/**
 * @author Huxi LI
 */
public class MyAppException extends Exception{
    
    public MyAppException(String msg) {
        super(msg);
    }

    public MyAppException(Throwable e) {
        super(e);
    }
    
}
