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
public class DispatcherResultAction extends ActionSupport {
    
    //Creamos setters y getters para los elementos del formulario:
    private String nombre, lenguaje;
    
    public String getLenguaje(){
        return lenguaje;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setLenguaje(String lenguaje){
        this.lenguaje=lenguaje;
    }
    
    //Sobre-escribimos el método execute:
    @Override
    public String execute() throws Exception{
        
        //Preguntamos por la opción escogida en el select (si es distinta de
        //la opcion Java, dará error en este caso):
        if(!"Java".equals(lenguaje))
        {
            return ERROR;
        }
        
        return SUCCESS;
    }
}
