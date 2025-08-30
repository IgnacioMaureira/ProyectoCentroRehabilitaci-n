package proyectosia;

public class Tratamiento {
    private String descripcion;
    private String duracion;
    private Doctor doctorAsignado;


        public Tratamiento(String descripcion, String duracion, Doctor doctorAsignado) {
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.doctorAsignado = doctorAsignado;
    }

    //Getters
    public String getDescripcion() {
        return descripcion;
    }

    public String getDuracion() {
        return duracion;
    }

    public Doctor getDoctorAsignado() {
        return doctorAsignado;
    }

    //Setters
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setDoctorAsignado(Doctor doctorAsignado) {
        this.doctorAsignado = doctorAsignado;
    }

}