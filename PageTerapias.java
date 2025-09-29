package proyectosia;

import javax.swing.*;
import java.util.Map;

public class PageTerapias extends javax.swing.JPanel {

    private Datos datos; // referencia a la clase Datos

    public PageTerapias(Datos datos) {
        this.datos = datos;
        initComponents();
        initListeners();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(846, 397));
        setMinimumSize(new java.awt.Dimension(846, 397));

        jLabel1.setText("FUNCIONES PARA ADMINISTRAR TERAPIAS");

        jButton1.setText("Agregar Nueva Terapia");
        jButton2.setText("Mostrar Listado de Terapias");
        jButton3.setText("Modificar Datos de una Terapia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(303, 303, 303))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }

    private void initListeners() {
        // Botón 1 → Agregar terapia
        jButton1.addActionListener(e -> {
            String id = JOptionPane.showInputDialog(this, "Ingrese Identificador de la Nueva Terapia:");
            if (id == null || id.trim().isEmpty()) return;

            if (datos.terapias.containsKey(id.trim())) {
                JOptionPane.showMessageDialog(this, "Ya existe este identificador asociado a una terapia.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String nombre = JOptionPane.showInputDialog(this, "Ingrese Nombre de la Nueva Terapia:");
            if (nombre == null || nombre.trim().isEmpty()) return;

            String tipo = JOptionPane.showInputDialog(this, "Ingrese Tipo de Terapia:");
            if (tipo == null || tipo.trim().isEmpty()) return;

            Terapias nueva = new Terapias(nombre.trim(), tipo.trim());
            datos.terapias.put(id.trim(), nueva);
            datos.guardarTerapias();

            JOptionPane.showMessageDialog(this, "Terapia agregada correctamente.");
        });

        // Botón 2 → Mostrar listado
        jButton2.addActionListener(e -> {
            if (datos.terapias.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No existen terapias registradas.");
                return;
            }

            StringBuilder sb = new StringBuilder("###### TERAPIAS REGISTRADAS ######\n\n");
            for (Map.Entry<String, Terapias> entry : datos.terapias.entrySet()) {
                sb.append("Identificador: ").append(entry.getKey()).append("\n");
                sb.append("Nombre: ").append(entry.getValue().getNombreTerapia()).append("\n");
                sb.append("Tipo: ").append(entry.getValue().getTipoTerapia()).append("\n");
                sb.append("-----------------------------\n");
            }

            JTextArea textArea = new JTextArea(sb.toString());
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setPreferredSize(new java.awt.Dimension(500, 300));

            JOptionPane.showMessageDialog(this, scrollPane, "Listado de Terapias", JOptionPane.INFORMATION_MESSAGE);
        });

        // Botón 3 → Modificar terapia
        jButton3.addActionListener(e -> {
            if (datos.terapias.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No existen terapias registradas.");
                return;
            }

            String id = JOptionPane.showInputDialog(this, "Ingrese el Identificador de la Terapia a modificar:");
            if (id == null || id.trim().isEmpty()) return;

            Terapias terapia = datos.terapias.get(id.trim());
            if (terapia == null) {
                JOptionPane.showMessageDialog(this, "No se encontró una terapia con ese identificador.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String[] opciones = {"Nombre", "Tipo"};
            String opcion = (String) JOptionPane.showInputDialog(
                    this,
                    "Seleccione el dato que desea modificar:",
                    "Modificar Terapia",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (opcion == null) return;

            switch (opcion) {
                case "Nombre":
                    String nuevoNombre = JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre:", terapia.getNombreTerapia());
                    if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
                        terapia.setNombreTerapia(nuevoNombre.trim());
                    }
                    break;

                case "Tipo":
                    String nuevoTipo = JOptionPane.showInputDialog(this, "Ingrese el nuevo tipo:", terapia.getTipoTerapia());
                    if (nuevoTipo != null && !nuevoTipo.trim().isEmpty()) {
                        terapia.setTipoTerapia(nuevoTipo.trim());
                    }
                    break;
            }

            datos.guardarTerapias();
            JOptionPane.showMessageDialog(this, "Datos de la terapia actualizados correctamente.");
        });
    }

    // Variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
}
