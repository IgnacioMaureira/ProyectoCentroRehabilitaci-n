package proyectosia;

import java.util.*;

public class Paciente extends Persona {
    private List<SesionTerapeutica> sesiones;
    private boolean estado;

    public Paciente(String rut, String nombre, int edad, String fechaDeNacimiento) {
        super(rut, nombre, edad, fechaDeNacimiento);
        this.sesiones = new ArrayList<>();
        this.estado = false;
    }

    // Agregar sesión pasando un objeto SesionTerapeutica ya creado
    public void agregarSesion(SesionTerapeutica sesion) {
        this.sesiones.add(sesion);
    }

    // Agregar sesión creando el objeto dentro y a partir de los datos básicos
    public void agregarSesion(String fecha, String hora, Terapeuta terapeuta, String observaciones, String tipoTerapia) {
        SesionTerapeutica sesion = new SesionTerapeutica(fecha, hora, terapeuta, observaciones, tipoTerapia);
        this.sesiones.add(sesion);
    }

    public void mostrarSesiones() {
        if (sesiones.isEmpty()) {
            System.out.println("No hay sesiones registradas para " + getNombre());
            return;
        }
        for (int i = 0; i < sesiones.size(); i++) {
            System.out.println("---- Sesión " + (i + 1) + " ----");
            sesiones.get(i).mostrarInfoSesion();
        }
    }

    public int getCantidadSesiones() {
        return sesiones.size();
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
