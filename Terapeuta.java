package proyectosia;

public class Terapeuta extends Persona {
    private String especialidad;

    public Terapeuta(String rut, String nombre, int edad, String fechaDeNacimiento, String especialidad) {
        super(rut, nombre, edad, fechaDeNacimiento);
        this.especialidad = especialidad;
    }

    // Getter y Setter propios
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    // Sobrecarga: mostrar datos con distinto nivel de detalle
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre() + " | Especialidad: " + especialidad);
    }

    public void mostrarDatos(boolean detalleCompleto) {
        if (detalleCompleto) {
            System.out.println("Nombre: " + getNombre());
            System.out.println("Rut: " + getRut());
            System.out.println("Edad: " + getEdad());
            System.out.println("Fecha Nac.: " + getFechaDeNacimiento());
            System.out.println("Especialidad: " + especialidad);
        } else {
            mostrarDatos();
        }
    }
}
