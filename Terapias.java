package proyectosia;

public class Terapias {
    private String nombreTerapia;
    private String tipoDeTerapia;
    
    public Terapias(String nombre, String tipo){
        nombreTerapia = nombre;
        tipoDeTerapia = tipo;
    }
    
    // Getters
    public String getNombreTerapia() {
        return nombreTerapia;
    }

    public String getTipoTerapia() {
        return tipoDeTerapia;
    }

    // Setters
    public void setNombreTerapia(String nombreTerapia) {
        this.nombreTerapia = nombreTerapia;
    }

    public void setTipoTerapia(String tipo) {
        this.tipoDeTerapia = tipo;
    }
    

    
}
