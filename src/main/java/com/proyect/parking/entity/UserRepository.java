/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyect.parking.entity;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Guzman
 */
public interface UserRepository extends MongoRepository<User,String>{
    
    
}
