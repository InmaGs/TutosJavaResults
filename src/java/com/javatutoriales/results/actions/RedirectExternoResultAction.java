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
public class RedirectExternoResultAction extends ActionSupport{
    
    //Sólo sobre-escribimos el método execute que regresa un valor SUCCESS, no
    //hace nada más especial.
    @Override
    public String execute() throws Exception{
        
        return SUCCESS;
    }
    
}
