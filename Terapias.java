/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectosia;

/**
 *
 * @author novoy
 */
public class Terapias {
    private String nombreTerapia;
    private int cantidadSesiones;
    
    public Terapias(String nombre, int sesiones){
        nombreTerapia = nombre;
        cantidadSesiones = sesiones;
    }
    
    // Getters
    public String getNombreTerapia() {
        return nombreTerapia;
    }

    public int getCantidadSesiones() {
        return cantidadSesiones;
    }

    // Setters
    public void setNombreTerapia(String nombreTerapia) {
        this.nombreTerapia = nombreTerapia;
    }

    public void setCantidadSesiones(int cantidadSesiones) {
        this.cantidadSesiones = cantidadSesiones;
    }
    

    
}
