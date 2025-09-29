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
        jButton3 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(846, 397));
        setMinimumSize(new java.awt.Dimension(846, 397));
        setPreferredSize(new java.awt.Dimension(846, 397));

        jLabel1.setText("FUNCIONES PARA ADMINISTRAR TERAPEUTAS");

        jButton1.setText("Agregar Nuevo Terapeuta");
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));

        jButton2.setText("Mostrar Listado de Terapeutas");
        jButton2.addActionListener(evt -> jButton2ActionPerformed(evt));

        jButton3.setText("Modificar Datos de un Terapeuta");
        jButton3.addActionListener(evt -> jButton3ActionPerformed(evt));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(299, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(297, 297, 297))
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

    // Botón 1: Agregar Terapeuta
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String rut = JOptionPane.showInputDialog(this, "Ingrese Rut del Nuevo Terapeuta:");
        if (rut == null || rut.trim().isEmpty()) return;

        boolean existe = datos.terapeutas.stream()
                .anyMatch(t -> t.getRut().equalsIgnoreCase(rut.trim()));
        if (existe) {
            JOptionPane.showMessageDialog(this, "Terapeuta ya registrado con ese RUT.", 
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nombre = JOptionPane.showInputDialog(this, "Ingrese Nombre del Nuevo Terapeuta:");
        try {
            if (nombre == null || nombre.trim().isEmpty()){

                javax.swing.JOptionPane.showMessageDialog(this, 
                    "Porfavor inserte un Nombre Valido.", 
                    "Error de Validación", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
                return; 
                }
        }catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Nombre inválida.", 
                "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        String edadStr = JOptionPane.showInputDialog(this, "Ingrese Edad del Nuevo Terapeuta:");
        if (edadStr == null || edadStr.trim().isEmpty()) return;

        int edad;
        try {
            edad = Integer.parseInt(edadStr.trim());

            if (edad < 0) {
                JOptionPane.showMessageDialog(this, 
                    "La edad no puede ser negativa.", 
                    "Error de Validación", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Edad inválida.", 
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String fechaNacimiento = JOptionPane.showInputDialog(this, 
            "Ingrese Fecha de Nacimiento del Nuevo Terapeuta:");
        if (fechaNacimiento == null || fechaNacimiento.trim().isEmpty()) return;

        String especialidad = JOptionPane.showInputDialog(this, "Ingrese Especialidad del Nuevo Terapeuta:");
        if (especialidad == null || especialidad.trim().isEmpty()) return;

        try {
            Terapeuta terapeuta = new Terapeuta(rut.trim(), nombre.trim(), edad, 
            fechaNacimiento.trim(), especialidad.trim());
            datos.terapeutas.add(terapeuta);
            datos.guardarTerapeutas();
            JOptionPane.showMessageDialog(this, "Terapeuta agregado correctamente.");

        } catch (EdadNegativaException | NombreNullException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), 
                "Error de Validación", JOptionPane.ERROR_MESSAGE);
        }
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

    // Botón 3: Modificar Terapeuta
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws NombreNullException, EdadNegativaException {
        if (datos.terapeutas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "NO EXISTEN TERAPEUTAS REGISTRADOS EN EL SISTEMA", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String rut = JOptionPane.showInputDialog(this, "Ingrese el RUT del Terapeuta que desea modificar:");
        if (rut == null || rut.trim().isEmpty()) return;

        Terapeuta terapeuta = null;
        for (Terapeuta t : datos.terapeutas) {
            if (t.getRut().equalsIgnoreCase(rut.trim())) {
                terapeuta = t;
                break;
            }
        }

        if (terapeuta == null) {
            JOptionPane.showMessageDialog(this, "No se encontró un terapeuta con ese RUT.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String[] opciones = {"Nombre", "Edad", "Fecha de Nacimiento", "Especialidad"};
        String opcion = (String) JOptionPane.showInputDialog(
                this,
                "Seleccione el dato que desea modificar:",
                "Modificar Terapeuta",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (opcion == null) return;

        switch (opcion) {
            case "Nombre":
                String nuevoNombre = JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre:", terapeuta.getNombre());
                if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
                    terapeuta.setNombre(nuevoNombre.trim());
                }
                break;

            case "Edad":
                String nuevaEdadStr = JOptionPane.showInputDialog(this, "Ingrese la nueva edad:", terapeuta.getEdad());
                if (nuevaEdadStr != null && !nuevaEdadStr.trim().isEmpty()) {
                    try {
                        int nuevaEdad = Integer.parseInt(nuevaEdadStr.trim());
                        terapeuta.setEdad(nuevaEdad);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Edad inválida.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                break;

            case "Fecha de Nacimiento":
                String nuevaFecha = JOptionPane.showInputDialog(this, "Ingrese la nueva fecha de nacimiento:", terapeuta.getFechaDeNacimiento());
                if (nuevaFecha != null && !nuevaFecha.trim().isEmpty()) {
                    terapeuta.setFechaDeNacimiento(nuevaFecha.trim());
                }
                break;

            case "Especialidad":
                String nuevaEspecialidad = JOptionPane.showInputDialog(this, "Ingrese la nueva especialidad:", terapeuta.getEspecialidad());
                if (nuevaEspecialidad != null && !nuevaEspecialidad.trim().isEmpty()) {
                    terapeuta.setEspecialidad(nuevaEspecialidad.trim());
                }
                break;
        }

        datos.guardarTerapeutas();
        JOptionPane.showMessageDialog(this, "Datos del terapeuta actualizados correctamente.");
    }

    // Variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
}
