/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.exceptionhandling;

/**
 *
 * @author shreejit
 */
public class NullPointerException {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length());
    }

    NullPointerException(String demo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
