package proyectosia;

public class Doctor extends Persona {
    private String especialidadMedica;

    public Doctor(String rut, String nombre, int edad, String fechaDeNacimiento, String especialidadMedica) throws EdadNegativaException,NombreNullException {
        super(rut, nombre, edad, fechaDeNacimiento);
        this.especialidadMedica = especialidadMedica;
    }

    // Getter y Setter propios
    public String getEspecialidadMedica() {
        return especialidadMedica;
    }

    public void setEspecialidadMedica(String especialidadMedica) {
        this.especialidadMedica = especialidadMedica;
    }

    // Métodos
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Rut: " + getRut());
        System.out.println("Edad: " + getEdad());
        System.out.println("Fecha de Nacimiento: " + getFechaDeNacimiento());
        System.out.println("Especialidad Médica: " + especialidadMedica);
    }
}
