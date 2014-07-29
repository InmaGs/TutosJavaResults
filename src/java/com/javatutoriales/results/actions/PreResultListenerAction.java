/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.results.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author inmaculada.garcia
 */
public class PreResultListenerAction extends ActionSupport {
 
    //Preparamos las variables que vamos a obtener del formulario, con sus getters y setters
    
    private String nombre, lenguaje;
    
    public String getNombre(){
        return nombre;
    }
    
    public String getLenguaje(){
        return lenguaje;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setLenguaje(String lenguaje){
        this.lenguaje=lenguaje;
    }
    
    //Método execute, que devolverá error si la opción del selct no es java.
    @Override
    public String execute() throws Exception{
        if(!"Java".equals(lenguaje))
        {
            return ERROR;
        }
        return SUCCESS;
    }
    
}
