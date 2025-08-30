package proyectosia;

public class Doctor {
    private String nombre;
    private String rut;
    private int edad;
    private String fechaDeNacimiento; 

    public Doctor(String nombre, String rut, int edad, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    //Getters
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

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    //METODOS
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
