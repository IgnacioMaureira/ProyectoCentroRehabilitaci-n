package proyectosia;

import java.io.*;
import java.util.*;

public class Datos {
    public List<Paciente> pacientes = new ArrayList<>();
    public List<Doctor> doctores = new ArrayList<>();
    public List<Terapeuta> terapeutas = new ArrayList<>();
    public Map<String, Terapias> terapias = new HashMap<>();
    public List<SesionTerapeutica> sesiones = new ArrayList<>();
    public List<Tratamiento> tratamientos = new ArrayList<>();

    // Rutas ajustadas a la carpeta 'data' dentro del proyecto
    private final String rutaPacientes = "data/pacientes.csv";
    private final String rutaDoctores = "data/doctores.csv";
    private final String rutaTerapeutas = "data/terapeutas.csv";
    private final String rutaTerapias = "data/terapias.csv";
    private final String rutaSesiones = "data/sesiones.csv";
    private final String rutaTratamientos = "data/tratamientos.csv";

    // ─── CARGAR ───────────────────────────────
    public void cargarPacientes() throws EdadNegativaException, NombreNullException {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaPacientes))) {
            String linea;
            pacientes.clear();
            br.readLine(); // Saltar encabezado
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(";");
                String rut = campos[0];
                String nombre = campos[1];
                int edad = Integer.parseInt(campos[2]);
                String fechaNacimiento = campos[3];
                boolean estado = Boolean.parseBoolean(campos[4]);
                Paciente p = new Paciente(rut, nombre, edad, fechaNacimiento);
                p.setEstado(estado);
                pacientes.add(p);
            }
        } catch (IOException e) {
            System.out.println("Error cargando pacientes: " + e.getMessage());
        }
    }

    public void cargarDoctores() throws EdadNegativaException, NombreNullException {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaDoctores))) {
            String linea;
            doctores.clear();
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(";");
                String rut = campos[0];
                String nombre = campos[1];
                int edad = Integer.parseInt(campos[2]);
                String fechaNacimiento = campos[3];
                String especialidad = campos[4];
                doctores.add(new Doctor(rut, nombre, edad, fechaNacimiento, especialidad));
            }
        } catch (IOException e) {
            System.out.println("Error cargando doctores: " + e.getMessage());
        }
    }

    public void cargarTerapeutas() throws EdadNegativaException, NombreNullException {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaTerapeutas))) {
            String linea;
            terapeutas.clear();
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(";");
                String rut = campos[0];
                String nombre = campos[1];
                int edad = Integer.parseInt(campos[2]);
                String fechaNacimiento = campos[3];
                String especialidad = campos[4];
                terapeutas.add(new Terapeuta(rut, nombre, edad, fechaNacimiento, especialidad));
            }
        } catch (IOException e) {
            System.out.println("Error cargando terapeutas: " + e.getMessage());
        }
    }

    public void cargarTerapias() {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaTerapias))) {
            String linea;
            terapias.clear();
            br.readLine(); // Saltar encabezado
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(";");
                String identificador = campos[0];
                String nombre = campos[1];
                String tipo = campos[2];
                terapias.put(identificador, new Terapias(nombre, tipo));
            }
        } catch (IOException e) {
            System.out.println("Error cargando terapias: " + e.getMessage());
        }
    }

    public void cargarSesiones() {
        File file = new File(rutaSesiones);
        if (!file.exists()) {
            System.out.println("No existe archivo de sesiones para cargar.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(rutaSesiones))) {
            String linea;
            sesiones.clear();
            br.readLine(); // Saltar encabezado

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);

                if (partes.length < 7) continue;

                String fecha = partes[0];
                String hora = partes[1];
                String rutTerapeuta = partes[2];
                String nombreTerapeuta = partes[3];
                String tipoTerapia = partes[4];
                String observaciones = partes[5];
                String rutPaciente = partes[6];

                // Buscar terapeuta existente
                Terapeuta terapeuta = terapeutas.stream()
                        .filter(t -> t.getRut().equals(rutTerapeuta))
                        .findFirst()
                        .orElse(null);

                if (terapeuta == null) {
                    System.out.println("Sesión ignorada: terapeuta con rut '" + rutTerapeuta + "' no existe.");
                    continue; // Ignorar sesión si terapeuta no existe
                }

                // Crear sesión
                SesionTerapeutica sesion = new SesionTerapeutica(fecha, hora, terapeuta, observaciones, tipoTerapia, rutPaciente);

                // Asociar sesión al paciente
                Paciente paciente = pacientes.stream()
                        .filter(p -> p.getRut().equals(rutPaciente))
                        .findFirst()
                        .orElse(null);
                if (paciente != null) {
                    paciente.agregarSesion(fecha, hora, terapeuta, observaciones, tipoTerapia);
                } else {
                    System.out.println("Sesión ignorada: paciente con rut '" + rutPaciente + "' no existe.");
                    continue;
                }

                sesiones.add(sesion);
            }
        } catch (IOException e) {
            System.out.println("Error cargando sesiones: " + e.getMessage());
        }
    }



    public void cargarTratamientos() {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaTratamientos))) {
            String linea;
            tratamientos.clear();
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(";");
                String descripcion = campos[0];
                String duracion = campos[1];
                String rutDoctor = campos[2];

                Doctor doctor = doctores.stream()
                        .filter(d -> d.getRut().equals(rutDoctor))
                        .findFirst()
                        .orElse(null);

                if (doctor != null) {
                    tratamientos.add(new Tratamiento(descripcion, duracion, doctor));
                }
            }
        } catch (IOException e) {
            System.out.println("Error cargando tratamientos: " + e.getMessage());
        }
    }

    // ─── GUARDAR ───────────────────────────────
    public void guardarPacientes() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaPacientes))) {
            pw.println("rut;nombre;edad;fechaNacimiento;estado");
            for (Paciente p : pacientes) {
                pw.println(p.getRut() + ";" + p.getNombre() + ";" + p.getEdad() + ";" +
                        p.getFechaDeNacimiento() + ";" + p.getEstado());
            }
        } catch (IOException e) {
            System.out.println("Error guardando pacientes: " + e.getMessage());
        }
    }

    public void guardarDoctores() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaDoctores))) {
            pw.println("rut;nombre;edad;fechaNacimiento;especialidad");
            for (Doctor d : doctores) {
                pw.println(d.getRut() + ";" + d.getNombre() + ";" + d.getEdad() + ";" +
                        d.getFechaDeNacimiento() + ";" + d.getEspecialidadMedica());
            }
        } catch (IOException e) {
            System.out.println("Error guardando doctores: " + e.getMessage());
        }
    }

    public void guardarTerapeutas() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaTerapeutas))) {
            pw.println("rut;nombre;edad;fechaNacimiento;especialidad");
            for (Terapeuta t : terapeutas) {
                pw.println(t.getRut() + ";" + t.getNombre() + ";" + t.getEdad() + ";" +
                        t.getFechaDeNacimiento() + ";" + t.getEspecialidad());
            }
        } catch (IOException e) {
            System.out.println("Error guardando terapeutas: " + e.getMessage());
        }
    }

    public void guardarTerapias() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaTerapias))) {
            pw.println("identificador;nombreTerapia;tipoDeTerapia");
            for (Map.Entry<String, Terapias> entry : terapias.entrySet()) {
                String identificador = entry.getKey();
                Terapias t = entry.getValue();
                pw.println(identificador + ";" + t.getNombreTerapia() + ";" + t.getTipoTerapia());
            }
        } catch (IOException e) {
            System.out.println("Error guardando terapias: " + e.getMessage());
        }
    }

    public void guardarSesiones() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaSesiones))) {
            pw.println("fecha;hora;rutTerapeuta;nombreTerapeuta;tipoTerapia;observaciones;rutPaciente");

            for (SesionTerapeutica s : sesiones) {
                if (s.getTerapeuta() != null) {
                    pw.println(s.getFecha() + ";" +
                               s.getHora() + ";" +
                               s.getTerapeuta().getRut() + ";" +
                               s.getTerapeuta().getNombre() + ";" +
                               s.getTipoTerapia() + ";" +
                               s.getObservaciones() + ";" +
                               s.getRutPaciente());
                }
            }
        } catch (IOException e) {
            System.out.println("Error guardando sesiones: " + e.getMessage());
        }
    }



    public void guardarTratamientos() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaTratamientos))) {
            pw.println("descripcion;duracion;rutDoctor");
            for (Tratamiento t : tratamientos) {
                pw.println(t.getDescripcion() + ";" + t.getDuracion() + ";" +
                        t.getDoctorAsignado().getRut());
            }
        } catch (IOException e) {
            System.out.println("Error guardando tratamientos: " + e.getMessage());
        }
    }

    // ─── CARGAR Y GUARDAR TODO ───────────────────────────────
    public void cargarTodo() throws EdadNegativaException, NombreNullException {
        cargarDoctores();
        cargarTerapeutas();
        cargarTerapias();
        cargarPacientes();
        cargarSesiones();
        cargarTratamientos();
    }

    public void guardarTodo() {
        guardarPacientes();
        guardarDoctores();
        guardarTerapeutas();
        guardarTerapias();
        guardarSesiones();
        guardarTratamientos();
    }
    
    public void mostrarEstadisticasPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados en el sistema.");
            return;
        }

        int totalPacientes = pacientes.size();
        int pacientesTerminados = 0;
        int pacientesNoTerminados = 0;

        // Recorremos y contamos según el estado
        for (Paciente p : pacientes) {
            if (p.getEstado()) { 
                // true = ha terminado (según tu definición actual)
                pacientesTerminados++;
            } else {
                pacientesNoTerminados++;
            }
        }

        // Calcular porcentajes
        double porcentajeTerminados = ((double) pacientesTerminados / totalPacientes) * 100;
        double porcentajeNoTerminados = ((double) pacientesNoTerminados / totalPacientes) * 100;

        // Mostrar estadísticas
        System.out.println("===============================================");
        System.out.println("        ESTADÍSTICAS DE PACIENTES");
        System.out.println("===============================================");
        System.out.println("Total de pacientes registrados: " + totalPacientes);
        System.out.println();
        System.out.printf("Pacientes que TERMINARON terapia: %d (%.1f%%)\n", 
                          pacientesTerminados, porcentajeTerminados);
        System.out.printf("Pacientes que NO han terminado terapia: %d (%.1f%%)\n", 
                          pacientesNoTerminados, porcentajeNoTerminados);
        System.out.println("===============================================");
    }
    
    public boolean eliminarPacientePorRut(String rut) {
        boolean encontrado = false;

        // 1. Eliminar paciente de la lista
        Iterator<Paciente> iterPaciente = pacientes.iterator();
        while (iterPaciente.hasNext()) {
            Paciente p = iterPaciente.next();
            if (p.getRut().equalsIgnoreCase(rut)) {
                iterPaciente.remove();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Paciente con rut " + rut + " no encontrado.");
            return false;
        }

        // 2. Eliminar sesiones asociadas al paciente
        Iterator<SesionTerapeutica> iterSesiones = sesiones.iterator();
        while (iterSesiones.hasNext()) {
            SesionTerapeutica s = iterSesiones.next();
            if (s.getRutPaciente().equalsIgnoreCase(rut)) {
                iterSesiones.remove();
            }
        }

        // 3. Guardar cambios en archivos
        guardarPacientes();
        guardarSesiones();

        System.out.println("Paciente con rut " + rut + " y sus sesiones han sido eliminados correctamente.");
        return true;
    }
    
    public void generarReportePacientesTxt(String rutaReporte) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaReporte))) {
            pw.println("========== REPORTE DE PACIENTES ==========");
            for (Paciente p : pacientes) {
                pw.println("RUT: " + p.getRut() 
                    + " | Nombre: " + p.getNombre() 
                    + " | Edad: " + p.getEdad() 
                    + " | Estado: " + (p.getEstado() ? "TERMINO" : "EN CURSO"));
            }
            pw.println("==========================================");
            System.out.println("Reporte generado en " + rutaReporte);
        } catch (IOException e) {
            System.out.println("Error al generar reporte: " + e.getMessage());
        }
    }

}
