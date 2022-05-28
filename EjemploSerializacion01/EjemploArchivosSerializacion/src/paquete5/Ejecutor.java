/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String Args[]) {

        String nombreArchivo = "Hospital.data";

        Hospital h1 = new Hospital("San Jose", 90, 1400.34, "111");
        Hospital h2 = new Hospital("Oveja", 150, 1900.34, "222");
        Hospital h3 = new Hospital("San Benito", 300, 6150.34, "333");
        Hospital h4 = new Hospital("Mozart", 40, 1000.34,"333");

        EscrituraArchivoSecuencial esc = new EscrituraArchivoSecuencial(nombreArchivo);

        Hospital[] hosp = {h1, h2, h3, h4};

        for (int i = 0; i < hosp.length; i++) {
            esc.establecerRegistro(hosp[i]);

            esc.establecerSalida();
        }

        esc.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaHospitales();
        System.out.println(lectura);

    }
}
