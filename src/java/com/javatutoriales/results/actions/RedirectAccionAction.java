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
public class RedirectAccionAction extends ActionSupport {
    
    @Override
    public String execute() throws Exception{
        return SUCCESS;
    }
   
    //Añadimos un getter para la obtención del parámetro que se define en el 
    //archivo struts.xml
    public String getLenguajeProgramación(){
        return "Java";
    }
    
}
