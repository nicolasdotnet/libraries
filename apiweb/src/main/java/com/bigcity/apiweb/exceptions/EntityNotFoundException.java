/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigcity.apiweb.exceptions;

/**
 *
 * @author nicolasdotnet
 */

public class EntityNotFoundException extends LibraryException {

    public EntityNotFoundException() {
    }

    public EntityNotFoundException(String message) {

        super(message);
    }
    
}
