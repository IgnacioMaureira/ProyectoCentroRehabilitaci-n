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
    public void cargarPacientes() {
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

    public void cargarDoctores() {
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

    public void cargarTerapeutas() {
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
        try (BufferedReader br = new BufferedReader(new FileReader(rutaSesiones))) {
            String linea;
            sesiones.clear();
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(";");
                String rutPaciente = campos[0];
                String rutTerapeuta = campos[1];
                String fecha = campos[2];
                String hora = campos[3];
                String tipoTerapia = campos[4];
                String observaciones = campos[5];

                Terapeuta terapeuta = terapeutas.stream()
                        .filter(t -> t.getRut().equals(rutTerapeuta))
                        .findFirst()
                        .orElse(null);

                Paciente paciente = pacientes.stream()
                        .filter(p -> p.getRut().equals(rutPaciente))
                        .findFirst()
                        .orElse(null);

                if (terapeuta != null && paciente != null) {
                    SesionTerapeutica sesion = new SesionTerapeutica(fecha, hora, terapeuta, observaciones, tipoTerapia);
                    sesiones.add(sesion);
                }
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
            pw.println("rutPaciente;rutTerapeuta;fecha;hora;tipoTerapia;observaciones");
            for (SesionTerapeutica s : sesiones) {
                String rutPaciente = pacientes.stream()
                        .filter(p -> sesiones.contains(s))
                        .map(Paciente::getRut)
                        .findFirst()
                        .orElse("desconocido");
                pw.println(rutPaciente + ";" + s.getTerapeuta().getRut() + ";" +
                        s.getFecha() + ";" + s.getHora() + ";" +
                        s.getTipoTerapia() + ";" + s.getObservaciones());
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
    public void cargarTodo() {
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
}
