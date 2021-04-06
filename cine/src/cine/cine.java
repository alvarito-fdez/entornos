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
public class cine {
    private double precio;
    private pelicula peliculas;
    
    public cine(double precio, pelicula peliculas){
        this.precio=precio;
        this.peliculas=peliculas;
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public pelicula getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(pelicula peliculas) {
        this.peliculas = peliculas;
    }
    
    public boolean tieneDinero (espectadores e){
        return e.getDinero() > precio;
    }
    
//    public boolean tieneEdad(espectadores e){
//        return pelicula
//    }
}
