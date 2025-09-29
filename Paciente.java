package proyectosia;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {
    private boolean estado;
    private List<SesionTerapeutica> sesiones; // Lista interna de sesiones

    public Paciente(String rut, String nombre, int edad, String fechaDeNacimiento) throws EdadNegativaException,NombreNullException {
        super(rut, nombre, edad, fechaDeNacimiento);
        this.sesiones = new ArrayList<>();
        this.estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    // Agregar sesión a este paciente
    public void agregarSesion(String fecha, String hora, Terapeuta terapeuta, String observaciones, String tipoTerapia) {
        SesionTerapeutica sesion = new SesionTerapeutica(fecha, hora, terapeuta, observaciones, tipoTerapia, this.getRut());
        sesiones.add(sesion);
    }

    // Exportar sesiones (para guardado en CSV)
    public List<SesionTerapeutica> exportarSesiones() {
        return new ArrayList<>(sesiones); // Devuelve copia
    }

    // Mostrar todas las sesiones
    public void mostrarSesiones() {
        if (sesiones.isEmpty()) {
            System.out.println("No hay sesiones registradas para este paciente.");
            return;
        }
        for (SesionTerapeutica s : sesiones) {
            s.mostrarInfoSesion();
            System.out.println("----------------------------");
        }
    }
    

    public boolean eliminarUltimaSesion() {
        if (sesiones == null || sesiones.isEmpty()) {
            return false; // No hay sesiones que eliminar
        }
        sesiones.remove(sesiones.size() - 1);
        return true; // Eliminación exitosa
    }


}
