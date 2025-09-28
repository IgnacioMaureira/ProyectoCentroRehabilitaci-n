package proyectosia;

import javax.swing.*;
import java.awt.event.*;
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

        setMaximumSize(new java.awt.Dimension(846, 397));
        setMinimumSize(new java.awt.Dimension(846, 397));

        jLabel1.setText("FUNCIONES PARA ADMINISTRAR TERAPIAS");

        jButton1.setText("Agregar Nueva Terapia");

        jButton2.setText("Mostrar Listado de Terapias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(303, 303, 303))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
    }

    private void initListeners() {
        // Botón 1 → Agregar terapia
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = JOptionPane.showInputDialog(PageTerapias.this, "Ingrese Identificador de la Nueva Terapia:");
                if (id == null || id.trim().isEmpty()) return;

                if (datos.terapias.containsKey(id)) {
                    JOptionPane.showMessageDialog(PageTerapias.this, "Ya existe este identificador asociado a una terapia.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String nombre = JOptionPane.showInputDialog(PageTerapias.this, "Ingrese Nombre de la Nueva Terapia:");
                if (nombre == null || nombre.trim().isEmpty()) return;

                String tipo = JOptionPane.showInputDialog(PageTerapias.this, "Ingrese Tipo de Terapia:");
                if (tipo == null || tipo.trim().isEmpty()) return;

                Terapias nueva = new Terapias(nombre, tipo);
                datos.terapias.put(id, nueva);
                datos.guardarTerapias();

                JOptionPane.showMessageDialog(PageTerapias.this, "Terapia agregada correctamente.");
            }
        });

        // Botón 2 → Mostrar listado
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (datos.terapias.isEmpty()) {
                    JOptionPane.showMessageDialog(PageTerapias.this, "No existen terapias registradas.");
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

                JOptionPane.showMessageDialog(PageTerapias.this, scrollPane, "Listado de Terapias", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    // Variables declaration 
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration
}
