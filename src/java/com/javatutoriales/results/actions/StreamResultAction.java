/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.results.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author inmaculada.garcia
 */
public class StreamResultAction extends ActionSupport {
    
    //Declaramos las variables que vamos a usar:
    
    private int bytesArchivo;
    private InputStream streamImagen;
    private String nombreImagen;
    
    //Declaramos métodos getter que proporcionan los valores de las variables
    //para que luego puedan leerse en el action:
    public int getBytesArchivo(){
        return bytesArchivo;
    }
    
    public InputStream getStreamImagen(){
        return streamImagen;
    }
    
    public String getNombreImagen(){
        return nombreImagen;
    }
    
    //Sobre-escribimos método execute. Dentro se crea un objeto de tipo File que
    //apuntará al archivo de la imagen. A través de este objeto obtendremos el tamaño
    //y su nombre.
    @Override
    public String execute() throws Exception{
        
        File archivoImagen = new File("C:\\Users\\inmaculada.garcia\\Pictures\\homer.png");
        bytesArchivo = (int)archivoImagen.length();
        nombreImagen = archivoImagen.getName();
        
        //Creamos InputStream para el flujo de bytes de la imagen
        
        streamImagen = new FileInputStream(archivoImagen);
        
        return SUCCESS;
    }
}
