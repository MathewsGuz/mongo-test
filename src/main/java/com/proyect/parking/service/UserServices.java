/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyect.parking.service;

import com.proyect.parking.entity.UserRepository;
import com.proyect.parking.entity.User
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/**
 *
 * @author Guzman
 */
@Service
public class UserServices implements CommandLineRunner {
    
    @Autowired
     private UserRepository repo;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Coneccion a la base de datos");
    }
    
    //manejad dto u objeto directamente o json
    public void registrarUsuario(String text){
        repo.save(new User());
    }
}
