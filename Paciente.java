package proyectosia;

import java.util.*;

public class Paciente {
    private String rut;
    private String nombre;
    private int edad;
    private String fechaDeNacimiento;
    private List<SesionTerapeutica> sesiones;
    private boolean estado;
    
    public Paciente(String rut,String nombre,int edad,String fechaDeNacimiento){
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sesiones = new ArrayList<>();
        estado = false;
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
    
    public List<SesionTerapeutica> getSesiones() {
        return sesiones;
    }
    
    public boolean getEstado(){
        return estado;
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
    
    public void setSesiones(List<SesionTerapeutica> sesiones) {
        this.sesiones = sesiones;
    }
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }
}               
