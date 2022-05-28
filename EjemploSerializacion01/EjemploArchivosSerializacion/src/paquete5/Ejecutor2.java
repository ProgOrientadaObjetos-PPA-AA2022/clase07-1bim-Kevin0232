/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {

    public static void main(String Args[]) {

        String nombreArchivo = "Hospital.data";

        String id_buscar = "222"; // id que queiro encontrar
        Hospital hosp_buscar;
        LecturaArchivoSecuencial lectura
                = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerIdentificador(id_buscar);
        lectura.establecerHospitalBuscado();
        hosp_buscar = lectura.obtenerHospitalBuscado();
        if (hosp_buscar != null) {
            System.out.println(hosp_buscar);
        } else {
            System.out.println("Profesor no encontrado");
        }
    }
}
