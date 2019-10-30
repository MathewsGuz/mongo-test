/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyect.parking.entity;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;
/**
 *
 * @author Guzman
 */
public class User {
    
    @Id
    public String nombre ;
    public String apellido;
    public String correo;
    public Integer telefono;
    public String placaCarro;

    public User() {
    }

    public User(String nombre, String apellido, String correo, Integer telefono, String placaCarro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.placaCarro = placaCarro;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }
    
    
    
    
}
