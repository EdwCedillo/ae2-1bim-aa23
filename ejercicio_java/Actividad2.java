/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad2;

/**
 *
 * @author LENOVO
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Universidad miUniversidad = new Universidad("UTPL","A", 5);
        System.out.println(miUniversidad.toString());
        
        
        Carrera miCarrera = new Carrera("Economia", "Economista", 4);
        System.out.println(miCarrera.toString());
        
    }
    
}
