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
    
    // Agregar sesion pasando un objeto SesionTerapeutica ya creado
    public void agregarSesion(SesionTerapeutica sesion) {
        this.sesiones.add(sesion);
    }

    // Agregar sesion creando el objeto dentro y a partir de los datos basicos
    public void agregarSesion(String fecha, String hora, Terapeuta terapeuta, String observaciones, String tipoTerapia) {
        SesionTerapeutica sesion = new SesionTerapeutica(fecha, hora, terapeuta, observaciones, tipoTerapia);
        this.sesiones.add(sesion);
    }
    
    public int getCantidadSesiones() {
        return sesiones.size();
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
    
    public List<SesionTerapeutica> getSesionesCopia() {
        return new ArrayList<>(sesiones);
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
    
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }
}
