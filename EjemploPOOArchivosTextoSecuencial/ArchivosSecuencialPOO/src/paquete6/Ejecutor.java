/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "Hospital2.txt";
        
        Hospital h1 = new Hospital("San Benito", 140, 1503.4);
        Hospital h2 = new Hospital("Isidro Ayora", 120, 1223.6);
        Hospital h3 = new Hospital("Benjamin Carrion", 180, 1809.1);
        Hospital h4 = new Hospital("San Pablo Torres", 100, 1405.9);
        

        ArchivoEscritura escritura = new ArchivoEscritura(nombreArchivo);
        
        ArrayList <Hospital> hosp = new ArrayList();
        hosp.add(h1);
        hosp.add(h2);
        hosp.add(h3);
        hosp.add(h4);
        
        for (int i = 0; i < hosp.size(); i++) {
            // establecer el valor del atributo registro
            escritura.establecerRegistro(hosp.get(i));
        // estabalecer en el archivo el atributo del registro
            escritura.establecerSalida(); 
        }
        
        
        // proceso para lectura del archivo
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        // System.out.println(lectura.toString());
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
