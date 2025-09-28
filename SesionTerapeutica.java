package proyectosia;

public class SesionTerapeutica{
    private String fecha;
    private String hora;
    private Terapeuta terapeuta;
    private String observaciones;
    private String tipoTerapia;

    public SesionTerapeutica(String fecha, String hora, Terapeuta terapeuta,String observaciones, String tipoTerapia){
        this.fecha= fecha;
        this.hora= hora;
        this.observaciones= observaciones;
        this.terapeuta= terapeuta;
        this.tipoTerapia= tipoTerapia;
    }
    
    //GETTERS
    
    public String getFecha(){
        return fecha;
    }
    
    public String getHora(){
        return hora;
    }
    
    public Terapeuta getTerapeuta(){
        return terapeuta;
    }
    
    public String getObservaciones(){
        return observaciones;
    }
    
    public String getTipoTerapia(){
        return tipoTerapia;
    }
    
    //SETTERS
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    
    public void setHora(String hora){
        this.hora = hora;
    }
    
    public void setTerapeuta(Terapeuta t){
        this.terapeuta = t;
    }
    
    public void setObservaciones(String observaciones){
        this.observaciones = observaciones;
    }
    
    public void setTipoTerapia(String tipoT){
        this.tipoTerapia = tipoT;
    }
    
       // Dentro de la clase SesionTerapeutica
    public void mostrarInfoSesion() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Terapeuta: " + terapeuta.getNombre());
        System.out.println("Tipo de Terapia: " + tipoTerapia);
        System.out.println("Observaciones: " + observaciones);
    }
    
}
