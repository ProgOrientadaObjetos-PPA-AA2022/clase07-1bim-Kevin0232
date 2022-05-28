/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;
    String idHospital;
    
    public Hospital(String n, int nC, double p){
        nombre =n;
        numeroCamas = nC;
        presupuesto = p;
    }
    public Hospital(String n, int nC, double p, String i){
        nombre =n;
        numeroCamas = nC;
        presupuesto = p;
        idHospital = i;
    }
    
    public void establecerIdentificador(String n){
        idHospital = n;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerNombre(int n){
        numeroCamas = n;
    }
    public void establecerNombre(double n){
        presupuesto = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerNumeroCamas(){
        return numeroCamas;
    }
    public double obtenerPresupuesto(){
        return presupuesto;
    }
    public String obtenerIdentificador(){
        return idHospital;
    }
    @Override
    public String toString() {
        String cadena = String.format("%s - %d-%.2f  - id: %s\n", 
                    obtenerNombre(), obtenerNumeroCamas(),
                    obtenerPresupuesto(),obtenerIdentificador());

        return cadena;
    }
    
    
    
    
}