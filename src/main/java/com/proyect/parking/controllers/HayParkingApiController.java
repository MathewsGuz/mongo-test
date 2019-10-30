/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyect.parking.controllers;

import com.proyect.parking.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Guzman
 */
@RestController
@RequestMapping(value = "/register")
@Service
public class HayParkingApiController {
    
    @Autowired
    UserServices app;
    
    /*No se se se deba cambiar el request body por json o manejar dtos*/
    @RequestMapping(method = RequestMethod.POST)	
    public ResponseEntity<?> registerUser(@RequestBody String text){
        try {
            //curl -i -X POST -HContent-Type:application/json -HAccept:application/json http://localhost:8080/register -d '{"orderAmountsMap":{"HAMBURGER":2,"PIZAA":3,"BEER":2},"tableNumber":2}'
                //registrar dato
                //curl -i -X POST -HContent-Type:application/json -HAccept:application/json http://localhost:8080/register -d 'hola diana'
                app.registrarUsuario(text);
                return new ResponseEntity<>("Insercion a db",HttpStatus.CREATED);
        } catch (Exception ex) {
                //Logger.getLogger(ChainServices.class.getName()).log(Level.SEVERE, null, ex);
                return new ResponseEntity<>("Error texto no puede ser Registrado ",HttpStatus.FORBIDDEN);            
        }     
    }
    
}
