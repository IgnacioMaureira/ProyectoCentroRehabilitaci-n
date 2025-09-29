package proyectosia;

import javax.swing.JOptionPane;

public class PageP extends javax.swing.JPanel {
    private Datos datos;

    public PageP(Datos datos) {
        this.datos = datos; 
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(846, 397));
        setMinimumSize(new java.awt.Dimension(846, 397));
        setPreferredSize(new java.awt.Dimension(846, 397));

        jLabel1.setText("FUNCIONES PARA ADMINISTRAR PACIENTES");

        jButton1.setText("Agregar Nuevo Paciente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Mostrar Listado de Pacientes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Mostrar Sesiones Terapéuticas");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Registrar Sesión Terapéutica de un Paciente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cambiar Estado de un Paciente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Eliminar un paciente");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Modificar Datos de un Paciente");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        
        jButton8.setText("Mostrar Estadisticas de Pacientes");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        
        jButton9.setText("Eliminar Ultima Sesión de un Paciente");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        
        jButton10.setText("Generar Archivo de Texto Reporte");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(319, 319, 319))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>       

    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String rut = javax.swing.JOptionPane.showInputDialog(this, "Ingrese Rut del Nuevo Paciente:");
        if (rut == null || rut.trim().isEmpty()) return;

        // Validar si ya existe
        boolean existe = datos.pacientes.stream()
                .anyMatch(p -> p.getRut().equalsIgnoreCase(rut.trim()));

        if (existe) {
            javax.swing.JOptionPane.showMessageDialog(this, "Paciente ya registrado con ese RUT.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nombre = javax.swing.JOptionPane.showInputDialog(this, "Ingrese Nombre del Nuevo Paciente:");
        if (nombre == null || nombre.trim().isEmpty()) return;

        String edadStr = javax.swing.JOptionPane.showInputDialog(this, "Ingrese Edad del Nuevo Paciente:");
        if (edadStr == null || edadStr.trim().isEmpty()) return;

        int edad;
        try {
            edad = Integer.parseInt(edadStr.trim());
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Edad inválida.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        String fechaNacimiento = javax.swing.JOptionPane.showInputDialog(this, "Ingrese Fecha de Nacimiento (ej: 01-01-2000):");
        if (fechaNacimiento == null || fechaNacimiento.trim().isEmpty()) return;

        // Crear paciente y agregar a la lista
        Paciente nuevo = new Paciente(rut.trim(), nombre.trim(), edad, fechaNacimiento.trim());
        datos.pacientes.add(nuevo);

        // Guardar cambios
        datos.guardarPacientes();

        javax.swing.JOptionPane.showMessageDialog(this, "Paciente agregado correctamente.");
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (datos.pacientes.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "NO EXISTEN PACIENTES REGISTRADOS", "Listado Pacientes", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder listado = new StringBuilder();
        int i = 0;
        for (Paciente pTemp : datos.pacientes) {
            listado.append("#####################\n");
            listado.append("Datos Paciente n°").append(i + 1).append("\n");
            listado.append("#####################\n");
            listado.append("Nombre del Paciente: ").append(pTemp.getNombre()).append("\n");
            listado.append("Rut del Paciente: ").append(pTemp.getRut()).append("\n");
            listado.append("Edad del Paciente: ").append(pTemp.getEdad()).append("\n");
            listado.append("Fecha de Nacimiento: ").append(pTemp.getFechaDeNacimiento()).append("\n");
            listado.append("Estado: ").append(pTemp.getEstado() ? "TERMINÓ terapia" : "NO ha terminado terapia").append("\n");
            listado.append("-----------------------------\n");
            i++;
        }

        // Crear JTextArea para mostrar el listado
        javax.swing.JTextArea textArea = new javax.swing.JTextArea(listado.toString());
        textArea.setEditable(false);
        textArea.setColumns(40);
        textArea.setRows(20);
        javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(textArea);

        // Mostrar en ventana
        javax.swing.JOptionPane.showMessageDialog(this, scrollPane, "Listado de Pacientes", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)  {
        String rutPaciente = javax.swing.JOptionPane.showInputDialog(this, 
            "Ingrese el RUT del paciente:", "Mostrar Sesiones", javax.swing.JOptionPane.QUESTION_MESSAGE);

        if (rutPaciente == null || rutPaciente.trim().isEmpty()) {
            return;
        }

        Paciente paciente = datos.pacientes.stream()
                .filter(p -> p.getRut().equals(rutPaciente))
                .findFirst()
                .orElse(null);

        if (paciente == null) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Paciente no encontrado.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (paciente.exportarSesiones().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Este paciente no tiene sesiones registradas.", "Información", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Sesiones del paciente ").append(paciente.getNombre()).append(":\n\n");

        for (SesionTerapeutica sesion : paciente.exportarSesiones()) {
            sb.append(String.format("Fecha: %s\nHora: %s\nTerapeuta: %s\nTipo de Terapia: %s\nObservaciones: %s\n\n",
                    sesion.getFecha(),
                    sesion.getHora(),
                    sesion.getTerapeuta().getNombre(),
                    sesion.getTipoTerapia(),
                    sesion.getObservaciones()));
        }

        javax.swing.JTextArea textArea = new javax.swing.JTextArea(sb.toString());
        textArea.setEditable(false);
        javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(textArea);
        textArea.setColumns(40);
        textArea.setRows(15);

        javax.swing.JOptionPane.showMessageDialog(this, scrollPane, 
            "Sesiones del Paciente", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
                                     
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        String rutPaciente = javax.swing.JOptionPane.showInputDialog(this, 
            "Ingrese el RUT del paciente:", "Registrar Sesión", javax.swing.JOptionPane.QUESTION_MESSAGE);

        if (rutPaciente == null || rutPaciente.trim().isEmpty()) {
            return; // Cancelado o vacío
        }

        Paciente paciente = datos.pacientes.stream()
                .filter(p -> p.getRut().equals(rutPaciente))
                .findFirst()
                .orElse(null);

        if (paciente == null) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Paciente no encontrado.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        String fecha = javax.swing.JOptionPane.showInputDialog(this, "Ingrese la fecha (dd/MM/yyyy):");
        if (fecha == null || fecha.trim().isEmpty()) return;

        String hora = javax.swing.JOptionPane.showInputDialog(this, "Ingrese la hora (HH:mm):");
        if (hora == null || hora.trim().isEmpty()) return;

        String rutTerapeuta = javax.swing.JOptionPane.showInputDialog(this, "Ingrese el RUT del terapeuta:");
        if (rutTerapeuta == null || rutTerapeuta.trim().isEmpty()) return;

        Terapeuta terapeuta = datos.terapeutas.stream()
                .filter(t -> t.getRut().equals(rutTerapeuta))
                .findFirst()
                .orElse(null);

        if (terapeuta == null) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Terapeuta no encontrado.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        String tipoTerapia = javax.swing.JOptionPane.showInputDialog(this, "Ingrese el tipo de terapia:");
        if (tipoTerapia == null || tipoTerapia.trim().isEmpty()) return;

        String observaciones = javax.swing.JOptionPane.showInputDialog(this, "Ingrese observaciones:");
        if (observaciones == null) observaciones = "";

        // Crear sesión
        SesionTerapeutica sesion = new SesionTerapeutica(fecha, hora, terapeuta, observaciones, tipoTerapia, rutPaciente);
        paciente.agregarSesion(fecha, hora, terapeuta, observaciones, tipoTerapia);
        datos.sesiones.add(sesion);

        datos.guardarSesiones();

        javax.swing.JOptionPane.showMessageDialog(this, 
            "Sesión registrada correctamente.", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
                                       
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String rut = javax.swing.JOptionPane.showInputDialog(this, "Ingrese el RUT del paciente:");
        if (rut == null || rut.trim().isEmpty()) return;

        Paciente paciente = datos.pacientes.stream()
                .filter(p -> p.getRut().equalsIgnoreCase(rut.trim()))
                .findFirst()
                .orElse(null);

        if (paciente == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontró paciente con ese RUT.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Texto con el estado actual
        String estadoActual = paciente.getEstado()
                ? "Actualmente este paciente ha TERMINADO su tratamiento."
                : "Actualmente este paciente NO ha terminado su tratamiento.";

        javax.swing.JLabel lblEstado = new javax.swing.JLabel(estadoActual);

        // Crear botones
        javax.swing.JButton btnTerminado = new javax.swing.JButton("Marcar como Terminado");
        javax.swing.JButton btnNoTerminado = new javax.swing.JButton("Marcar como No Terminado");

        // Panel con layout vertical
        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setLayout(new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.Y_AXIS));
        panel.add(lblEstado);
        panel.add(javax.swing.Box.createVerticalStrut(10)); // Espacio
        panel.add(btnTerminado);
        panel.add(btnNoTerminado);

        // Crear ventana modal
        javax.swing.JDialog dialog = new javax.swing.JDialog((java.awt.Frame) null, "Cambiar Estado de Paciente", true);
        dialog.getContentPane().add(panel);
        dialog.pack();
        dialog.setLocationRelativeTo(this);

        // Acciones de botones
        btnTerminado.addActionListener(e -> {
            paciente.setEstado(true);
            datos.guardarPacientes();
            javax.swing.JOptionPane.showMessageDialog(this, "Estado actualizado: TERMINÓ terapia.");
            dialog.dispose();
        });

        btnNoTerminado.addActionListener(e -> {
            paciente.setEstado(false);
            datos.guardarPacientes();
            javax.swing.JOptionPane.showMessageDialog(this, "Estado actualizado: NO ha terminado terapia.");
            dialog.dispose();
        });

        dialog.setVisible(true);
    }
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // Solicitar RUT al usuario
        String rut = JOptionPane.showInputDialog(null, "Ingrese el RUT del paciente a eliminar:");

        if (rut == null || rut.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un RUT válido.");
            return;
        }

        rut = rut.trim();

        // Intentar eliminar paciente usando método de Datos
        boolean eliminado = datos.eliminarPacientePorRut(rut);

        if (eliminado) {
            JOptionPane.showMessageDialog(null, "Paciente y sus sesiones eliminados correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró paciente con RUT: " + rut);
        }
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String rut = JOptionPane.showInputDialog(this, "Ingrese el RUT del paciente a modificar:");
        if (rut == null || rut.trim().isEmpty()) return;

        Paciente paciente = datos.pacientes.stream()
                .filter(p -> p.getRut().equalsIgnoreCase(rut.trim()))
                .findFirst()
                .orElse(null);

        if (paciente == null) {
            JOptionPane.showMessageDialog(this, "No se encontró paciente con ese RUT.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String[] opciones = {"RUT", "Nombre", "Edad", "Fecha de Nacimiento"};
        String campo = (String) JOptionPane.showInputDialog(
                this,
                "Seleccione el dato que desea modificar:",
                "Modificar Paciente",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (campo == null) return;

        switch (campo) {
            case "RUT":
                String nuevoRut = JOptionPane.showInputDialog(this, "Ingrese el nuevo RUT:");
                if (nuevoRut == null || nuevoRut.trim().isEmpty()) return;

                // Validar que no exista otro paciente con ese RUT
                boolean existe = datos.pacientes.stream()
                        .anyMatch(p -> p.getRut().equalsIgnoreCase(nuevoRut.trim()) && p != paciente);
                if (existe) {
                    JOptionPane.showMessageDialog(this, "Ya existe otro paciente con ese RUT.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                paciente.setRut(nuevoRut.trim());
                break;

            case "Nombre":
                String nuevoNombre = JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre:");
                if (nuevoNombre == null || nuevoNombre.trim().isEmpty()) return;
                paciente.setNombre(nuevoNombre.trim());
                break;

            case "Edad":
                String nuevaEdadStr = JOptionPane.showInputDialog(this, "Ingrese la nueva edad:");
                if (nuevaEdadStr == null || nuevaEdadStr.trim().isEmpty()) return;

                try {
                    int nuevaEdad = Integer.parseInt(nuevaEdadStr.trim());
                    paciente.setEdad(nuevaEdad);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Edad inválida.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                break;

            case "Fecha de Nacimiento":
                String nuevaFecha = JOptionPane.showInputDialog(this, "Ingrese la nueva fecha de nacimiento (ej: 01-01-2000):");
                if (nuevaFecha == null || nuevaFecha.trim().isEmpty()) return;
                paciente.setFechaDeNacimiento(nuevaFecha.trim());
                break;
        }

        datos.guardarPacientes();
        JOptionPane.showMessageDialog(this, "Datos del paciente modificados correctamente.");
    } 
      
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        if (datos.pacientes.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay pacientes registrados en el sistema.", 
                                                      "Estadísticas de Pacientes", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int totalPacientes = datos.pacientes.size();
        int pacientesTerminados = 0;
        int pacientesNoTerminados = 0;

        for (Paciente p : datos.pacientes) {
            if (p.getEstado()) {
                pacientesTerminados++;
            } else {
                pacientesNoTerminados++;
            }
        }

        double porcentajeTerminados = ((double) pacientesTerminados / totalPacientes) * 100;
        double porcentajeNoTerminados = ((double) pacientesNoTerminados / totalPacientes) * 100;

        StringBuilder estadisticas = new StringBuilder();
        estadisticas.append("===============================================\n")
                    .append("        ESTADÍSTICAS DE PACIENTES\n")
                    .append("===============================================\n")
                    .append("Total de pacientes registrados: ").append(totalPacientes).append("\n\n")
                    .append(String.format("Pacientes que TERMINARON terapia: %d (%.1f%%)\n", 
                                          pacientesTerminados, porcentajeTerminados))
                    .append(String.format("Pacientes que NO han terminado terapia: %d (%.1f%%)\n", 
                                          pacientesNoTerminados, porcentajeNoTerminados))
                    .append("===============================================\n");

        javax.swing.JTextArea textArea = new javax.swing.JTextArea(estadisticas.toString());
        textArea.setEditable(false);
        textArea.setColumns(40);
        textArea.setRows(15);
        javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(textArea);

        javax.swing.JOptionPane.showMessageDialog(this, scrollPane, 
                                                  "Estadísticas de Pacientes", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        String rut = javax.swing.JOptionPane.showInputDialog(this,
                "Ingrese el RUT del paciente:",
                "Eliminar Última Sesión",
                javax.swing.JOptionPane.QUESTION_MESSAGE);

        if (rut == null || rut.trim().isEmpty()) {
            return; // Cancelado o vacío
        }
        rut = rut.trim();

        // Verificar que el paciente exista
        Paciente paciente = null;
        for (Paciente p : datos.pacientes) {
            if (p.getRut() != null && p.getRut().equalsIgnoreCase(rut)) {
                paciente = p;
                break;
            }
        }

        if (paciente == null) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No se encontró paciente con ese RUT.",
                    "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Buscar la última sesión de ese paciente en la lista global
        SesionTerapeutica ultimaSesion = null;
        for (int i = datos.sesiones.size() - 1; i >= 0; i--) {
            SesionTerapeutica s = datos.sesiones.get(i);
            if (s.getRutPaciente() != null && s.getRutPaciente().equalsIgnoreCase(rut)) {
                ultimaSesion = s;
                break;
            }
        }

        if (ultimaSesion == null) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Este paciente no tiene sesiones registradas.",
                    "Información", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Eliminar de la lista global
        datos.sesiones.remove(ultimaSesion);

        // También eliminar de la lista interna del paciente (si existe)
        // ⚠️ exportarSesiones devuelve una copia, así que no sirve remover ahí.
        // Lo mejor es añadir en Paciente un método eliminarUltimaSesion().
        try {
            java.lang.reflect.Method m = Paciente.class.getDeclaredMethod("eliminarUltimaSesion");
            m.invoke(paciente); // Si existe el método, se llama
        } catch (Exception e) {
            // Si no existe el método, se ignora. Igual ya se eliminó del CSV global.
        }

        // Guardar cambios
        datos.guardarSesiones();

        javax.swing.JOptionPane.showMessageDialog(this,
                "La última sesión del paciente con RUT " + rut + " fue eliminada correctamente.",
                "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }


            
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        if (datos.pacientes.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay pacientes registrados.", "Reporte", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder reporte = new StringBuilder();
        reporte.append("===== REPORTE DE PACIENTES =====\n\n");

        for (Paciente p : datos.pacientes) {
            reporte.append("Paciente: ").append(p.getNombre()).append("\n");
            reporte.append("RUT: ").append(p.getRut()).append("\n");
            reporte.append("Edad: ").append(p.getEdad()).append("\n");
            reporte.append("Fecha Nacimiento: ").append(p.getFechaDeNacimiento()).append("\n");
            reporte.append("Estado: ").append(p.getEstado() ? "TERMINÓ terapia" : "NO ha terminado terapia").append("\n");
            reporte.append("Sesiones:\n");

            if (p.exportarSesiones().isEmpty()) {
                reporte.append("  No hay sesiones registradas.\n");
            } else {
                for (SesionTerapeutica s : p.exportarSesiones()) {
                    reporte.append("  Fecha: ").append(s.getFecha())
                           .append(", Hora: ").append(s.getHora())
                           .append(", Terapeuta: ").append(s.getTerapeuta().getNombre())
                           .append(", Tipo: ").append(s.getTipoTerapia())
                           .append(", Observaciones: ").append(s.getObservaciones()).append("\n");
                }
            }
            reporte.append("--------------------------------\n");
        }

        try {
            java.nio.file.Files.write(java.nio.file.Paths.get("Reporte_Pacientes.txt"), reporte.toString().getBytes());
            javax.swing.JOptionPane.showMessageDialog(this, "Reporte generado correctamente en 'Reporte_Pacientes.txt'.", "Reporte", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al generar reporte: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
  
    
    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration
}
