/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author LENOVO
 */
public class Carrera {
    
    private String nomCarrera;
    private String descripcionCarrera;
    private String tituloOtorga;
    private int duracion;
    /* Constructor*/
    public Carrera(String nomCarrera, String descripcionCarrera, String tituloOtorga, int duracion) {
        this.nomCarrera = nomCarrera;
        this.descripcionCarrera = descripcionCarrera;
        this.tituloOtorga = tituloOtorga;
        this.duracion = duracion;
    }
    

    
    public Carrera(String nomCarrera, String tituloOtorga, int duracion) {
        this.nomCarrera = nomCarrera;
        this.tituloOtorga = tituloOtorga;
        this.duracion = duracion;
    }
    
    
    /* metdos set y getter*/
    public String getNomCarrera() {
        return nomCarrera;
    }

    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }

    public String getDescripcionCarrera() {
        return descripcionCarrera;
    }

    public void setDescripcionCarrera(String descripcionCarrera) {
        this.descripcionCarrera = descripcionCarrera;
    }

    public String getTituloOtorga() {
        return tituloOtorga;
    }

    public void setTituloOtorga(String tituloOtorga) {
        this.tituloOtorga = tituloOtorga;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    @Override
    public String toString() {
        return "Nombre de la carrera:" + nomCarrera + " Titulo Otorgado:" + tituloOtorga + " Duracion:" + duracion;
    }
}
