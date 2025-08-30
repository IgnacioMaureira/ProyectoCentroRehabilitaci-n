package proyectosia;

public class Terapeuta{
    private String rut;
    private String nombre;
    private int edad;
    private String fechaDeNacimiento;
    private String especialidad;

    public Terapeuta(String rut, String nombre, int edad, String fechaDeNacimiento, String especialidad){
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaDeNacimiento= fechaDeNacimiento;
        this.especialidad = especialidad;
    }

    //Getters
    
    public String getRut(){
        return rut;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    public String getfechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    
    //Setters
    public void setRut(String rut){
        this.rut = rut;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setfechaDeNacimiento(String fechaDeNacimiento){
        this.fechaDeNacimiento= fechaDeNacimiento;
}
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Especialidad: " + especialidad);
    }
}
