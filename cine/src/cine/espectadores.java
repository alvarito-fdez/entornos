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
public class espectadores {
    private String nombre;
    private int edad;
    private double dinero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
     public boolean tieneEdadSuf(espectadores e, int edadMinima){
        if(e.getEdad()>edadMinima){
            System.out.println("Tienes la edad adecuada");
        }
        return false;
    }

    @Override
    public String toString() {
        return "Espectador: nombre= "+nombre+", edad= "+edad+", dinero= "+dinero; //To change body of generated methods, choose Tools | Templates.
    }
     
     
    
}
