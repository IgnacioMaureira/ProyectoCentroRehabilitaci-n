package proyectosia;

public class Persona {
    private String rut;
    private String nombre;
    private int edad;
    private String fechaDeNacimiento;

    public Persona(String rut, String nombre, int edad, String fechaDeNacimiento)
            throws EdadNegativaException, NombreNullException {
        if (edad < 0) {
            throw new EdadNegativaException("La edad no puede ser menor que 0: " + edad);
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new NombreNullException("El nombre no puede estar vacío.");
        }

        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    // Setters
    public void setNombre(String nombre) throws NombreNullException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new NombreNullException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setEdad(int edad) throws EdadNegativaException {
        if (edad < 0) {
            throw new EdadNegativaException("La edad no puede ser menor que 0: " + edad);
        }
        this.edad = edad;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
