/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author LENOVO
 */
public class Universidad {
    private String nomUniversidad;
    private String categoria ;
    private int numCarreraOfertadas;
    
    /* Constructor*/

    public Universidad(String nomUniversidad, String categoria, int numCarreraOfertadas) {
        this.nomUniversidad = nomUniversidad;
        this.categoria = categoria;
        this.numCarreraOfertadas = numCarreraOfertadas;
    }
    
    
    /* metdos set y getter*/
    public String getNomUniversidad() {
        return nomUniversidad;
    }

    public void setNomUniversidad(String nomUniversidad) {
        this.nomUniversidad = nomUniversidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getnumCarreraOfertadas() {
        return numCarreraOfertadas;
    }

    public void setnumCarreraOfertadas(int numFacultades) {
        this.numCarreraOfertadas = numFacultades;
    }
   
    @Override
    public String toString() {
        return "Nombre de la Universidad:" + nomUniversidad + " Categoria: " + categoria + " Cantidad de Carreras Ofertadas:" + numCarreraOfertadas;
    }
    
}
