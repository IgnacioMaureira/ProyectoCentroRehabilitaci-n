package proyectosia;


public class Paciente {
    private String rut;
    private String nombre;
    private int edad;
    private String fechaDeNacimiento;
    private Terapias terapia;
    private boolean estado;
    
    public Paciente(String rut,String nombre,int edad,String fechaDeNacimiento, Terapias terapia){
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.terapia = terapia;
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
    
    public Terapias getTerapia(){
        return terapia;
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
    
    public void setTerapia(Terapias terapia){
        this.terapia = terapia;
    }
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }
}
