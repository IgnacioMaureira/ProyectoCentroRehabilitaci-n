package proyectosia;

public class PageD extends javax.swing.JPanel {
    private Datos datos; // referencia a Datos

    public PageD(Datos datos) {
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

        jLabel1.setText("FUNCIONES PARA ADMINISTRAR DOCTORES");

        jButton1.setText("Agregar Nuevo Doctor");
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));

        jButton2.setText("Mostrar Listado de Doctores");
        jButton2.addActionListener(evt -> jButton2ActionPerformed(evt));

        jButton3.setText("Modificar Datos de un Doctor");
        jButton3.addActionListener(evt -> jButton3ActionPerformed(evt));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 297, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 297, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String rut = javax.swing.JOptionPane.showInputDialog(this, "Ingrese Rut del Nuevo Doctor:");
        if (rut == null || rut.trim().isEmpty()) return;

        boolean existe = datos.doctores.stream()
                .anyMatch(d -> d.getRut().equalsIgnoreCase(rut.trim()));

        if (existe) {
            javax.swing.JOptionPane.showMessageDialog(this, "Doctor ya registrado con ese RUT.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nombre = javax.swing.JOptionPane.showInputDialog(this, "Ingrese Nombre del Nuevo Doctor:");
        if (nombre == null || nombre.trim().isEmpty()) return;

        String especialidad = javax.swing.JOptionPane.showInputDialog(this, "Ingrese Especialidad Médica:");
        if (especialidad == null || especialidad.trim().isEmpty()) return;

        String edadStr = javax.swing.JOptionPane.showInputDialog(this, "Ingrese Edad del Nuevo Doctor:");
        if (edadStr == null || edadStr.trim().isEmpty()) return;

        int edad;
        try {
            edad = Integer.parseInt(edadStr.trim());
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Edad inválida.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        String fechaNacimiento = javax.swing.JOptionPane.showInputDialog(this, "Ingrese Fecha de Nacimiento (ej: 01-01-1980):");
        if (fechaNacimiento == null || fechaNacimiento.trim().isEmpty()) return;

        Doctor nuevo = new Doctor(rut.trim(), nombre.trim(), edad, fechaNacimiento.trim(), especialidad.trim());
        datos.doctores.add(nuevo);
        datos.guardarDoctores();

        javax.swing.JOptionPane.showMessageDialog(this, "Doctor agregado correctamente.");
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (datos.doctores.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "NO EXISTEN DOCTORES REGISTRADOS EN EL SISTEMA", "Información", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder sb = new StringBuilder("###### LISTADO DE DOCTORES ######\n\n");
        int contador = 1;
        for (Doctor doc : datos.doctores) {
            sb.append("Doctor n°").append(contador++).append("\n")
              .append("Nombre: ").append(doc.getNombre()).append("\n")
              .append("Rut: ").append(doc.getRut()).append("\n")
              .append("Edad: ").append(doc.getEdad()).append("\n")
              .append("Fecha de Nacimiento: ").append(doc.getFechaDeNacimiento()).append("\n")
              .append("Especialidad Médica: ").append(doc.getEspecialidadMedica()).append("\n")
              .append("-----------------------------\n");
        }

        javax.swing.JTextArea textArea = new javax.swing.JTextArea(sb.toString());
        textArea.setEditable(false);
        textArea.setColumns(40);
        textArea.setRows(20);
        javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(textArea);

        javax.swing.JOptionPane.showMessageDialog(this, scrollPane, "Listado de Doctores", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (datos.doctores.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "NO EXISTEN DOCTORES REGISTRADOS EN EL SISTEMA", "Información", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Pedir RUT del doctor a modificar
        String rut = javax.swing.JOptionPane.showInputDialog(this, "Ingrese el RUT del Doctor que desea modificar:");
        if (rut == null || rut.trim().isEmpty()) return;

        Doctor doctor = null;
        for (Doctor d : datos.doctores) {
            if (d.getRut().equalsIgnoreCase(rut.trim())) {
                doctor = d;
                break;
            }
        }

        if (doctor == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontró un doctor con ese RUT.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Menú para elegir qué modificar
        String[] opciones = {"Nombre", "Edad", "Fecha de Nacimiento", "Especialidad Médica"};
        String opcion = (String) javax.swing.JOptionPane.showInputDialog(
                this,
                "Seleccione el dato que desea modificar:",
                "Modificar Doctor",
                javax.swing.JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (opcion == null) return;

        switch (opcion) {
            case "Nombre":
                String nuevoNombre = javax.swing.JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre:", doctor.getNombre());
                if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
                    doctor.setNombre(nuevoNombre.trim());
                }
                break;

            case "Edad":
                String nuevaEdadStr = javax.swing.JOptionPane.showInputDialog(this, "Ingrese la nueva edad:", doctor.getEdad());
                if (nuevaEdadStr != null && !nuevaEdadStr.trim().isEmpty()) {
                    try {
                        int nuevaEdad = Integer.parseInt(nuevaEdadStr.trim());
                        doctor.setEdad(nuevaEdad);
                    } catch (NumberFormatException e) {
                        javax.swing.JOptionPane.showMessageDialog(this, "Edad inválida.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                break;

            case "Fecha de Nacimiento":
                String nuevaFecha = javax.swing.JOptionPane.showInputDialog(this, "Ingrese la nueva fecha de nacimiento (ej: 01-01-1980):", doctor.getFechaDeNacimiento());
                if (nuevaFecha != null && !nuevaFecha.trim().isEmpty()) {
                    doctor.setFechaDeNacimiento(nuevaFecha.trim());
                }
                break;

            case "Especialidad Médica":
                String nuevaEspecialidad = javax.swing.JOptionPane.showInputDialog(this, "Ingrese la nueva especialidad médica:", doctor.getEspecialidadMedica());
                if (nuevaEspecialidad != null && !nuevaEspecialidad.trim().isEmpty()) {
                    doctor.setEspecialidadMedica(nuevaEspecialidad.trim());
                }
                break;
        }

        // Guardar cambios en el CSV
        datos.guardarDoctores();
        javax.swing.JOptionPane.showMessageDialog(this, "Datos del doctor actualizados correctamente.");
    }     

    // Variables declaration                    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                  
}
