package proyectosia;

public class ProyectoSIA {
    public static Datos datos = new Datos();

    public static void main(String[] args) {
        datos.cargarTodo();

        javax.swing.SwingUtilities.invokeLater(() -> {
            VentanaPrincipalSIA ventana = new VentanaPrincipalSIA(datos);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        });

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            datos.guardarTodo();
        }));
    }
}

