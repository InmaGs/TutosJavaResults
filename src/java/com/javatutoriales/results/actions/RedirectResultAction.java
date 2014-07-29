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
public class RedirectResultAction extends ActionSupport {
    
    //Sólo sobreescribimos el método execute, ya que no hay ningún parámetro 
    //que recibir o enviar.
    @Override
    public String execute() throws Exception{
    
        return SUCCESS;
    }
}
