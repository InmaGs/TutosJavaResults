/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.results.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.PreResultListener;

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
        //Añadimos el 'listener'
        ActionInvocation actionInvocation = ActionContext.getContext().getActionInvocation();
        
        actionInvocation.addPreResultListener(new PreResultListener()
        {
            //Agregamos la lógica que se ejecuta antes del procesamiento del result.
            public void beforeResult(ActionInvocation ai, String resultCode)
            {
                //Con esto, siempre seremos redirigidos a la página de éxito sin 
                //importar el leguaje escogido en el select.
                ai.setResultCode(SUCCESS);
                //nombre = " colega " + nombre;
            }
        });
        
        //Comportamiento normal de la página:
        if(!"Java".equals(lenguaje))
        {
            return ERROR;
        }
        return SUCCESS;
    }
    
}
