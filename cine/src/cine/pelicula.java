/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *
 * @author Diurno
 */
public class pelicula {
    private String titulo;
    private String director;
    private int duracion;

    public pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public boolean tieneEdadSuf(espectadores e){
        int edadMinima=14;
        if(e.getEdad()>edadMinima){
            System.out.println("Tienes la edad adecuada");
        }
        return false;
    }
    
    
}
