package proyectosia;

import javax.swing.*;

public class PageT extends javax.swing.JPanel {

    private Datos datos; // referencia a Datos

    public PageT(Datos datos) {
        this.datos = datos;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(846, 397));
        setMinimumSize(new java.awt.Dimension(846, 397));
        setPreferredSize(new java.awt.Dimension(846, 397));

        jLabel1.setText("FUNCIONES PARA ADMINISTRAR TERAPEUTAS");

        jButton1.setText("Agregar Nuevo Terapeuta");
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));

        jButton2.setText("Mostrar Listado de Terapeutas");
        jButton2.addActionListener(evt -> jButton2ActionPerformed(evt));

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
                    .addGap(297, 297, 297))
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

    // Botón 1: Agregar Terapeuta
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String rut = JOptionPane.showInputDialog(this, "Ingrese Rut del Nuevo Terapeuta:");
        if (rut == null || rut.trim().isEmpty()) return;

        boolean existe = datos.terapeutas.stream()
                .anyMatch(t -> t.getRut().equalsIgnoreCase(rut.trim()));

        if (existe) {
            JOptionPane.showMessageDialog(this, "Terapeuta ya registrado con ese RUT.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nombre = JOptionPane.showInputDialog(this, "Ingrese Nombre del Nuevo Terapeuta:");
        if (nombre == null || nombre.trim().isEmpty()) return;

        String edadStr = JOptionPane.showInputDialog(this, "Ingrese Edad del Nuevo Terapeuta:");
        if (edadStr == null || edadStr.trim().isEmpty()) return;

        int edad;
        try {
            edad = Integer.parseInt(edadStr.trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Edad inválida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String fechaNacimiento = JOptionPane.showInputDialog(this, "Ingrese Fecha de Nacimiento del Nuevo Terapeuta:");
        if (fechaNacimiento == null || fechaNacimiento.trim().isEmpty()) return;

        String especialidad = JOptionPane.showInputDialog(this, "Ingrese Especialidad del Nuevo Terapeuta:");
        if (especialidad == null || especialidad.trim().isEmpty()) return;

        Terapeuta terapeuta = new Terapeuta(rut.trim(), nombre.trim(), edad, fechaNacimiento.trim(), especialidad.trim());
        datos.terapeutas.add(terapeuta);
        datos.guardarTerapeutas();

        JOptionPane.showMessageDialog(this, "Terapeuta agregado correctamente.");
    }

    // Botón 2: Mostrar Terapeutas
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (datos.terapeutas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "NO EXISTEN TERAPEUTAS REGISTRADOS EN EL SISTEMA", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder sb = new StringBuilder("###### LISTADO DE TERAPEUTAS ######\n\n");
        int contador = 1;
        for (Terapeuta t : datos.terapeutas) {
            sb.append("Terapeuta n°").append(contador++).append("\n")
              .append("Nombre: ").append(t.getNombre()).append("\n")
              .append("Rut: ").append(t.getRut()).append("\n")
              .append("Edad: ").append(t.getEdad()).append("\n")
              .append("Fecha de Nacimiento: ").append(t.getFechaDeNacimiento()).append("\n")
              .append("Especialidad: ").append(t.getEspecialidad()).append("\n")
              .append("-----------------------------\n");
        }

        JTextArea textArea = new JTextArea(sb.toString());
        textArea.setEditable(false);
        textArea.setColumns(40);
        textArea.setRows(20);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JOptionPane.showMessageDialog(this, scrollPane, "Listado de Terapeutas", JOptionPane.INFORMATION_MESSAGE);
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
}
