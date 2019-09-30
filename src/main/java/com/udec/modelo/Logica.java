/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.modelo;

/**
 *Clase que se encarga de manejar la logica y el calculo del programa
 * @author Duvan Poveda
 */
public class Logica {
    private double angulo;
    private String funcion;
     /**
    *constructor principal que recibe el angulo y la funcion seleccionada
    * @param angulo
    * @param funcion
    */
    public Logica(double angulo, String funcion){
        this.angulo = angulo;
        this.funcion = funcion;
    }
    
    /**
    *metodo que evalua la funcion seleccionada y realiza la operacion requerida
    * @return resultado 
    */
    public double Calcular(){
        switch(funcion){
            case "SEN":
                return Math.sin(angulo);
            case "COS":
                return Math.cos(angulo);
            case "TAN":
                return Math.tan(angulo);
        }
        return 0.0;
    }
}
