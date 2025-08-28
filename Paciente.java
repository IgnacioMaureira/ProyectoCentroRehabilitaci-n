/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectosia;

/**
 *
 * @author novoy
 */
public class Paciente {
    private String rut;
    private String nombre;
    private int edad;
    private String fechaDeNacimiento;
    private Terapias terapia;
    
    public Paciente(String rut,String nombre,int edad,String fechaDeNacimiento, Terapias terapia){
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.terapia = terapia;
    }
    
     // Getters
    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    
    public Terapias getTerapia(){
        return terapia;
    }

    // Setters
    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public void setTerapia(Terapias terapia){
        this.terapia = terapia;
    }
}
