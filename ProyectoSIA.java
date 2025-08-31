package proyectosia;

import java.util.*;

public class ProyectoSIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creación de lista Pacientes
        List<Paciente> pacientes = new ArrayList<>();
        //Creación del HashMap de Terapias
        HashMap<String,Terapias> terapias = new HashMap<>();
        //Creación de lista Doctores
        List<Doctor> doctores = new ArrayList<>();
        //Creación de lista Terapeutas
        List<Terapeuta> terapeutas = new ArrayList<>();
        
        
        Scanner sc = new Scanner(System.in);
        int verificar;
        
        // Inicialización de terapias predeterminadas
        Terapias t1 = new Terapias("Fisioterapia", "Rehabilitación Física");
        Terapias t2 = new Terapias("Hidroterapia", "Ejercicios en agua");
        Terapias t3 = new Terapias("Electroterapia", "Estimulación eléctrica");
        Terapias t4 = new Terapias("Terapia Ocupacional", "Mejora de autonomía en actividades diarias");
        Terapias t5 = new Terapias("Kinesioterapia Respiratoria", "Tratamiento de problemas respiratorios");
        Terapias t6 = new Terapias("Terapia Manual", "Manipulación y movilización articular");
        Terapias t7 = new Terapias("Masoterapia", "Masajes terapéuticos para recuperación muscular");
        Terapias t8 = new Terapias("Terapia de Reeducación Postural", "Corrección de posturas y alineación corporal");
        Terapias t9 = new Terapias("Crioterapia", "Aplicación de frío para reducir inflamación");
        Terapias t10 = new Terapias("Termoterapia", "Aplicación de calor para relajación muscular");
        Terapias t11 = new Terapias("Rehabilitación Neurológica", "Tratamiento para pacientes con lesiones neurológicas");
        Terapias t12 = new Terapias("Terapia con Ultrasonido", "Estimulación de tejidos profundos con ultrasonido");
        Terapias t13 = new Terapias("Terapia de Ejercicio Funcional", "Fortalecimiento para actividades cotidianas");

        // Insertar en el HashMap
        terapias.put("T1", t1);
        terapias.put("T2", t2);
        terapias.put("T3", t3);
        terapias.put("T4", t4);
        terapias.put("T5", t5);
        terapias.put("T6", t6);
        terapias.put("T7", t7);
        terapias.put("T8", t8);
        terapias.put("T9", t9);
        terapias.put("T10", t10);
        terapias.put("T11", t11);
        terapias.put("T12", t12);
        terapias.put("T13", t13);
        
        //inicialización de doctores
        String nombreDoctor1 = "Ignacio Maureira Torres";
        String rutDoctor1 = "21.820.039-7";
        int edadDoctor1 = 20;
        String fechaDeNacimientoDoctor1 = "16/04/2005";
        
        String nombreDoctor2 = "Victor Cordova Leiva";
        String rutDoctor2 = "21.935.791-5";
        int edadDoctor2 = 19;
        String fechaDeNacimientoDoctor2 = "21/09/2005";
        
        String nombreDoctor3 = "Pablo Lara Garrido";
        String rutDoctor3 = "21.858.766-6";
        int edadDoctor3 = 20;
        String fechaDeNacimientoDoctor3 = "06/06/2005";
        
        String nombreDoctor4 = "Camila Fernández Soto";
        String rutDoctor4 = "20.456.789-3";
        int edadDoctor4 = 32;
        String fechaDeNacimientoDoctor4 = "12/03/1993";

        String nombreDoctor5 = "Matías Rojas Fuentes";
        String rutDoctor5 = "19.874.321-0";
        int edadDoctor5 = 41;
        String fechaDeNacimientoDoctor5 = "27/07/1984";

        String nombreDoctor6 = "Constanza Pérez Aguilera";
        String rutDoctor6 = "22.135.678-2";
        int edadDoctor6 = 28;
        String fechaDeNacimientoDoctor6 = "05/01/1997";

        String nombreDoctor7 = "Felipe Morales Gutiérrez";
        String rutDoctor7 = "18.543.210-5";
        int edadDoctor7 = 46;
        String fechaDeNacimientoDoctor7 = "09/09/1979";

        String nombreDoctor8 = "Valentina Ramírez Castro";
        String rutDoctor8 = "21.234.567-1";
        int edadDoctor8 = 30;
        String fechaDeNacimientoDoctor8 = "22/11/1995";

        String nombreDoctor9 = "Sebastián Herrera Vargas";
        String rutDoctor9 = "20.987.654-9";
        int edadDoctor9 = 34;
        String fechaDeNacimientoDoctor9 = "15/05/1991";

        String nombreDoctor10 = "Francisca Torres Loyola";
        String rutDoctor10 = "19.765.432-8";
        int edadDoctor10 = 39;
        String fechaDeNacimientoDoctor10 = "03/12/1986";

        String nombreDoctor11 = "Diego Castillo Navarro";
        String rutDoctor11 = "18.987.654-4";
        int edadDoctor11 = 45;
        String fechaDeNacimientoDoctor11 = "18/02/1980";

        String nombreDoctor12 = "Catalina Silva Muñoz";
        String rutDoctor12 = "22.345.678-6";
        int edadDoctor12 = 27;
        String fechaDeNacimientoDoctor12 = "07/08/1998";

        String nombreDoctor13 = "Tomás Peña Cornejo";
        String rutDoctor13 = "21.678.901-2";
        int edadDoctor13 = 31;
        String fechaDeNacimientoDoctor13 = "29/04/1994";
        
        Doctor doctor1 = new Doctor(nombreDoctor1,rutDoctor1,edadDoctor1,fechaDeNacimientoDoctor1);
        Doctor doctor2 = new Doctor(nombreDoctor2,rutDoctor2,edadDoctor2,fechaDeNacimientoDoctor2);
        Doctor doctor3 = new Doctor(nombreDoctor3,rutDoctor3,edadDoctor3,fechaDeNacimientoDoctor3);
        Doctor doctor4 = new Doctor(nombreDoctor4,rutDoctor4,edadDoctor4,fechaDeNacimientoDoctor4);
        Doctor doctor5 = new Doctor(nombreDoctor5,rutDoctor5,edadDoctor5,fechaDeNacimientoDoctor5);
        Doctor doctor6 = new Doctor(nombreDoctor6,rutDoctor6,edadDoctor6,fechaDeNacimientoDoctor6);
        Doctor doctor7 = new Doctor(nombreDoctor7,rutDoctor7,edadDoctor7,fechaDeNacimientoDoctor7);
        Doctor doctor8 = new Doctor(nombreDoctor8,rutDoctor8,edadDoctor8,fechaDeNacimientoDoctor8);
        Doctor doctor9 = new Doctor(nombreDoctor9,rutDoctor9,edadDoctor9,fechaDeNacimientoDoctor9);
        Doctor doctor10 = new Doctor(nombreDoctor10,rutDoctor10,edadDoctor10,fechaDeNacimientoDoctor10);
        Doctor doctor11 = new Doctor(nombreDoctor11,rutDoctor11,edadDoctor11,fechaDeNacimientoDoctor11);
        Doctor doctor12 = new Doctor(nombreDoctor12,rutDoctor12,edadDoctor12,fechaDeNacimientoDoctor12);
        Doctor doctor13 = new Doctor(nombreDoctor13,rutDoctor13,edadDoctor13,fechaDeNacimientoDoctor13);

        
        doctores.add(doctor1);
        doctores.add(doctor2);
        doctores.add(doctor3);
        doctores.add(doctor4);
        doctores.add(doctor5);
        doctores.add(doctor6);
        doctores.add(doctor7);
        doctores.add(doctor8);
        doctores.add(doctor9);
        doctores.add(doctor10);
        doctores.add(doctor11);
        doctores.add(doctor12);
        doctores.add(doctor13);
        
        // Inicialización de terapeutas
        Terapeuta terapeuta1 = new Terapeuta("17.654.321-9", "María José Alarcón", 38, "10/07/1987", "Fisioterapia");
        Terapeuta terapeuta2 = new Terapeuta("18.112.233-4", "Andrés Muñoz Rivera", 42, "22/03/1983", "Hidroterapia");
        Terapeuta terapeuta3 = new Terapeuta("19.223.344-5", "Paula González Vega", 35, "14/09/1990", "Electroterapia");
        Terapeuta terapeuta4 = new Terapeuta("20.334.455-6", "Rodrigo Cáceres Morales", 29, "05/12/1995", "Terapia Ocupacional");
        Terapeuta terapeuta5 = new Terapeuta("21.445.566-7", "Fernanda López Riquelme", 33, "18/01/1992", "Kinesioterapia Respiratoria");
        Terapeuta terapeuta6 = new Terapeuta("22.556.677-8", "Cristóbal Salinas Pardo", 31, "30/06/1994", "Masoterapia");
        Terapeuta terapeuta7 = new Terapeuta("23.667.788-9", "Isidora Contreras Figueroa", 27, "08/11/1997", "Reeducación Postural");
        Terapeuta terapeuta8 = new Terapeuta("24.778.899-0", "Mauricio Castillo Bravo", 40, "25/08/1984", "Crioterapia");
        Terapeuta terapeuta9 = new Terapeuta("25.889.900-1", "Daniela Fuentes Sepúlveda", 36, "12/04/1989", "Rehabilitación Neurológica");
        Terapeuta terapeuta10 = new Terapeuta("26.990.011-2", "Alejandro Araya Campos", 34, "03/02/1991", "Terapia con Ultrasonido");

        // Agregarlos a la lista de terapeutas
        terapeutas.add(terapeuta1);
        terapeutas.add(terapeuta2);
        terapeutas.add(terapeuta3);
        terapeutas.add(terapeuta4);
        terapeutas.add(terapeuta5);
        terapeutas.add(terapeuta6);
        terapeutas.add(terapeuta7);
        terapeutas.add(terapeuta8);
        terapeutas.add(terapeuta9);
        terapeutas.add(terapeuta10);
        
        // Inicialización de pacientes
        Paciente paciente1 = new Paciente("15.123.456-7", "Gabriela Núñez Arriagada", 29, "04/05/1996");
        Paciente paciente2 = new Paciente("16.234.567-8", "Claudio Barraza Molina", 41, "12/11/1983");
        Paciente paciente3 = new Paciente("17.345.678-9", "Marcela Vergara Pino", 36, "23/02/1989");
        Paciente paciente4 = new Paciente("18.456.789-0", "Jorge Alvarado Quiroz", 50, "30/07/1974");
        Paciente paciente5 = new Paciente("19.567.890-1", "Carolina Espinoza Duarte", 27, "19/09/1997");
        Paciente paciente6 = new Paciente("20.678.901-2", "Héctor Sáez Castillo", 33, "15/01/1992");
        Paciente paciente7 = new Paciente("21.789.012-3", "Rocío Valdés Henríquez", 39, "02/08/1985");
        Paciente paciente8 = new Paciente("22.890.123-4", "Felipe Álvarez Bustos", 31, "25/06/1993");
        Paciente paciente9 = new Paciente("23.901.234-5", "Natalia Carrasco Poblete", 44, "11/10/1980");
        Paciente paciente10 = new Paciente("24.012.345-6", "Mauricio Vera Sanhueza", 28, "07/04/1996");

        // Agregar a la lista de pacientes
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);
        pacientes.add(paciente5);
        pacientes.add(paciente6);
        pacientes.add(paciente7);
        pacientes.add(paciente8);
        pacientes.add(paciente9);
        pacientes.add(paciente10);
        
        // Paciente 1: Gabriela Núñez → 2 sesiones
        paciente1.getSesiones().add(new SesionTerapeutica("10/08/2025", "10:30", terapeuta1, "Primera sesión, leve rigidez en pierna derecha.", t1.getNombreTerapia()));
        paciente1.getSesiones().add(new SesionTerapeutica("12/08/2025", "11:00", terapeuta3, "Segunda sesión, mejora movilidad lumbar.", t3.getNombreTerapia()));

        // Paciente 2: Claudio Barraza → 1 sesión
        paciente2.getSesiones().add(new SesionTerapeutica("11/08/2025", "11:00", terapeuta2, "Ejercicios en piscina, buena tolerancia.", t2.getNombreTerapia()));

        // Paciente 3: Marcela Vergara → 3 sesiones
        paciente3.getSesiones().add(new SesionTerapeutica("12/08/2025", "09:00", terapeuta3, "Aplicación de electroterapia en zona lumbar.", t3.getNombreTerapia()));
        paciente3.getSesiones().add(new SesionTerapeutica("14/08/2025", "10:00", terapeuta1, "Fisioterapia adicional para hombro.", t1.getNombreTerapia()));
        paciente3.getSesiones().add(new SesionTerapeutica("16/08/2025", "12:30", terapeuta5, "Ejercicios respiratorios y relajación.", t5.getNombreTerapia()));

        // Paciente 4: Jorge Alvarado → 1 sesión
        paciente4.getSesiones().add(new SesionTerapeutica("13/08/2025", "15:00", terapeuta4, "Motricidad fina y actividades diarias.", t4.getNombreTerapia()));

        // Paciente 5: Carolina Espinoza → 2 sesiones
        paciente5.getSesiones().add(new SesionTerapeutica("14/08/2025", "16:30", terapeuta5, "Sesión de ejercicios respiratorios asistidos.", t5.getNombreTerapia()));
        paciente5.getSesiones().add(new SesionTerapeutica("18/08/2025", "10:30", terapeuta6, "Masoterapia en espalda baja.", t7.getNombreTerapia()));

        // Paciente 6: Héctor Sáez → 1 sesión
        paciente6.getSesiones().add(new SesionTerapeutica("15/08/2025", "12:00", terapeuta6, "Masaje terapéutico en hombro izquierdo, reducción de dolor.", t7.getNombreTerapia()));

        // Paciente 7: Rocío Valdés → 3 sesiones
        paciente7.getSesiones().add(new SesionTerapeutica("16/08/2025", "09:30", terapeuta7, "Corrección postural básica, mejora en la alineación.", t8.getNombreTerapia()));
        paciente7.getSesiones().add(new SesionTerapeutica("18/08/2025", "11:00", terapeuta8, "Aplicación de crioterapia en cuello.", t9.getNombreTerapia()));
        paciente7.getSesiones().add(new SesionTerapeutica("20/08/2025", "13:00", terapeuta1, "Fisioterapia general.", t1.getNombreTerapia()));

        // Paciente 8: Felipe Álvarez → 1 sesión
        paciente8.getSesiones().add(new SesionTerapeutica("17/08/2025", "10:00", terapeuta8, "Aplicación de crioterapia en rodilla derecha.", t9.getNombreTerapia()));

        // Paciente 9: Natalia Carrasco → 2 sesiones
        paciente9.getSesiones().add(new SesionTerapeutica("18/08/2025", "14:00", terapeuta9, "Ejercicios neurológicos básicos para coordinación motora.", t11.getNombreTerapia()));
        paciente9.getSesiones().add(new SesionTerapeutica("20/08/2025", "15:30", terapeuta10, "Ultrasonido en zona lumbar.", t12.getNombreTerapia()));

        // Paciente 10: Mauricio Vera → 1 sesión
        paciente10.getSesiones().add(new SesionTerapeutica("19/08/2025", "15:30", terapeuta10, "Aplicación de ultrasonido en la zona lumbar.", t12.getNombreTerapia()));
        
        
        //INICIO MENÚ
        do{
            int opcion, opcion2;
            System.out.println("#####MENÚ GENERAL#####");
            System.out.println("1. Agregar Nuevo Paciente.");
            System.out.println("2. Mostrar Pacientes.");
            
            System.out.println("3. Agregar Nueva Terapia.");
            System.out.println("4. Mostrar Terapias.");
            
            System.out.println("5. Agregar Nuevo Terapeuta.");
            System.out.println("6. Mostrar Terapeutas.");
            
            System.out.println("7. Agregar Nuevo Doctor.");
            System.out.println("8. Mostrar Doctores.");
            
            System.out.println("9. Mostrar Información de Sesiones de Paciente.");
            System.out.println("10. Registrar Sesión Terapeutica de Paciente.");
            
            System.out.println("11. Cambiar Estado de Paciente.");
            
            System.out.print("Selección: ");
            
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch(opcion){
                case 1:
                    //AGREGAR NUEVO PACIENTE
                    do{
                        System.out.println("Ingrese Rut del Nuevo Paciente:");
                        String rutBuffer = sc.nextLine();
                        
                        boolean existe = false;
                        for (Paciente pac : pacientes) {
                            if (pac.getRut().equalsIgnoreCase(rutBuffer)) {
                                existe = true;
                                break;
                            }
                        }
                        if(existe){
                            System.out.println("Paciente ya registrado.");
                        }
                        else{
                            System.out.println("Ingrese Nombre del Nuevo Paciente:");
                            String nombreBuffer = sc.nextLine();

                            System.out.println("Ingrese Edad del Nuevo Paciente:");
                            int edadBuffer = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Ingrese Fecha de Nacimiento del Nuevo Paciente:");
                            String fechaBuffer = sc.nextLine();

                            Paciente p = new Paciente(rutBuffer,nombreBuffer,edadBuffer,fechaBuffer);
                            pacientes.add(p);
                        }
                        System.out.println("Deseas agregar otra persona? (1.Sí / 2.No)");
                        opcion2 = sc.nextInt();
                        sc.nextLine();

                    } while(opcion2 == 1);
                    break;
                    
                case 2:
                    //MOSTRAR PACIENTES
                    if (pacientes.isEmpty()){
                        System.out.println("NO EXISTEN PACIENTES REGISTRADOS");
                    }
                    else{
                        int i = 0;
                        while(i < pacientes.size()){
                            Paciente pTemp = pacientes.get(i);
                            System.out.println("#####################");
                            System.out.println("Datos Paciente n°" + (i+1));
                            System.out.println("#####################");
                            System.out.println("Nombre del Paciente: " + pTemp.getNombre());
                            System.out.println("Rut del Paciente: " + pTemp.getRut());
                            System.out.println("Edad del Paciente: " + pTemp.getEdad());
                            System.out.println("Fecha de Nacimiento del Paciente: " + pTemp.getFechaDeNacimiento());
                            boolean estado = pTemp.getEstado();
                            if (estado == true ){
                                System.out.println("El Paciente ha Terminado su Terapia");
                            }
                            else{
                                System.out.println("El Paciente NO ha Terminado su Terapia");
                            }
                            System.out.println("-----------------------------");
                            i++;
                        }
                    }
                    break;
                case 3:
                    //AGREGAR TERAPIA
                    do{
                        System.out.println("Ingrese Identificador de la Nueva Terapia:");
                        String identificadorBuffer = sc.nextLine();
                        
                        if(terapias.containsKey(identificadorBuffer)){
                            System.out.println("YA EXISTE ESTE IDENTIFICADOR ASOCIADO A UNA TERAPIA");
                        }
                        else{
                            System.out.println("Ingrese Nombre de la Nueva Terapia:");
                            String nombreBuffer = sc.nextLine();

                            System.out.println("Ingrese Tipo de Terapia:");
                            String tipoBuffer = sc.nextLine();
                            
                            Terapias t = new Terapias(nombreBuffer,tipoBuffer);
                            terapias.put(identificadorBuffer,t);
                        }
                        System.out.println("Deseas agregar otra terapia? (1.Sí / 2.No)");
                        opcion2 = sc.nextInt();
                        sc.nextLine();

                    } while(opcion2 == 1);
                    break;
                case 4:
                    //MOSTRAR HASHMAP TERAPIAS
                    if (terapias.isEmpty()){
                        System.out.println("NO EXISTEN TERAPIAS REGISTRADAS");
                    }
                    else{
                        System.out.println("###### TERAPIAS REGISTRADAS ######");
                        for (Map.Entry<String, Terapias> entry : terapias.entrySet()) {
                        String clave = entry.getKey();
                        Terapias t = entry.getValue();

                        System.out.println("Identificador: " + clave);
                        System.out.println("Nombre Terapia: " + t.getNombreTerapia());
                        System.out.println("Tipo de Terapia: " + t.getTipoTerapia());
                        System.out.println("-----------------------------");
                        }
                    }
                    break;
                //AGREGAR NUEVO TERAPEUTA
                case 5:
                    do{
                        System.out.println("Ingrese Rut del Nuevo Terapeuta:");
                        String rutBuffer = sc.nextLine();

                        System.out.println("Ingrese Nombre del Nuevo Terapeuta:");
                        String nombreBuffer = sc.nextLine();

                        System.out.println("Ingrese Edad del Nuevo Terapeuta:");
                        int edadBuffer = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Ingrese Fecha de Nacimiento del Nuevo Terapeuta:");
                        String fechaBuffer = sc.nextLine();

                        System.out.println("Ingrese Especialidad del Nuevo Terapeuta:");
                        String especialidadBuffer = sc.nextLine();

                        Terapeuta tera = new Terapeuta(rutBuffer,nombreBuffer,edadBuffer,fechaBuffer,especialidadBuffer); 
                        terapeutas.add(tera);

                        System.out.println("Deseas agregar otro terapeuta? (1.Sí / 2.No)");
                        opcion2 = sc.nextInt();
                        sc.nextLine();
                    }while(opcion2 == 1);
                    break;
                //MOSTRAR TERAPEUTAS
                case 6:
                    if(terapeutas.isEmpty()){
                        System.out.println("NO EXISTEN TERAPEUTAS REGISTRADOS EN EL SISTEMA");
                    }
                    
                    else{
                        int i = 0, tam = terapeutas.size();
                        System.out.println("###### Terapeutas ######");
                        while(i < tam){
                            System.out.println("Terapeuta n°" + (i+1));
                            terapeutas.get(i).mostrarDatos();
                            System.out.println("-----------------------------");
                            i++;
                        }
                        
                    }
                    break;
                //AGREGAR NUEVO DOCTOR
                case 7:
                    do{
                        System.out.println("Ingrese Rut del Nuevo Doctor:");
                        String rutBuffer = sc.nextLine();

                        System.out.println("Ingrese Nombre del Nuevo Doctor:");
                        String nombreBuffer = sc.nextLine();

                        System.out.println("Ingrese Edad del Nuevo Doctor:");
                        int edadBuffer = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Ingrese Fecha de Nacimiento del Nuevo Doctor:");
                        String fechaBuffer = sc.nextLine();
                        
                        Doctor doctor = new Doctor(nombreBuffer,rutBuffer,edadBuffer,fechaBuffer);
                        doctores.add(doctor);
                        
                        System.out.println("Deseas agregar otra terapia? (1.Sí / 2.No)");
                        opcion2 = sc.nextInt();
                        sc.nextLine();
                    }while(opcion2 == 1);
                    break;
                //MOSTRAR DOCTORES
                case 8:
                    if(doctores.isEmpty()){
                        System.out.println("NO EXISTEN DOCTORES REGISTRADOS EN EL SISTEMA");
                    }
                    
                    else{
                        int i = 0, tam = doctores.size();
                        System.out.println("###### Doctores ######");
                        while(i < tam){
                            System.out.println("Doctor n°" + (i+1));
                            doctores.get(i).mostrarDatos();
                            System.out.println("-----------------------------");
                            i++;
                        }
                        
                    }
                    break;
                case 9:
                    System.out.println("Ingrese el RUT del paciente para mostrar sus sesiones:");
                    String rutBusqueda = sc.nextLine();
                    boolean encontrado = false;

                    for (Paciente p : pacientes) {
                        if (p.getRut().equalsIgnoreCase(rutBusqueda)) {
                            encontrado = true;
                            if (p.getSesiones().isEmpty()) {
                                System.out.println("El paciente no tiene sesiones registradas.");
                            } else {
                                System.out.println("###### SESIONES DEL PACIENTE " + p.getNombre() + " ######");
                                for (SesionTerapeutica sesion : p.getSesiones()) {
                                    sesion.mostrarInfoSesion();
                                }
                            }
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró ningún paciente con ese RUT.");
                    }
                    break;
                case 10:
                    System.out.println("Ingrese el RUT del paciente para agregar una sesión:");
                    String rutPaciente = sc.nextLine();
                    Paciente pacienteSeleccionado = null;

                    // Buscar paciente
                    for (Paciente p : pacientes) {
                        if (p.getRut().equalsIgnoreCase(rutPaciente)) {
                            pacienteSeleccionado = p;
                            break;
                        }
                    }

                    if (pacienteSeleccionado == null) {
                        System.out.println("No se encontró un paciente con este RUT.");
                        break;
                    }

                    // Verificar si el paciente ya terminó su tratamiento
                    if (pacienteSeleccionado.getEstado()) {
                        System.out.println("El paciente ya terminó su tratamiento. No se puede agregar una nueva sesión.");
                        break;
                    }

                    // Pide fecha, hora y observaciones
                    System.out.println("Ingrese la fecha de la sesión (dd/mm/aaaa):");
                    String fechaSesion = sc.nextLine();

                    System.out.println("Ingrese la hora de la sesión (hh:mm):");
                    String horaSesion = sc.nextLine();

                    System.out.println("Ingrese las observaciones de la sesión:");
                    String observacionesSesion = sc.nextLine();

                    System.out.println("Ingrese el nombre de la terapia:");
                    String tipoTerapia = sc.nextLine();

                    // Pide RUT del terapeuta y busca
                    System.out.println("Ingrese el RUT del terapeuta:");
                    String rutTerapeuta = sc.nextLine();
                    Terapeuta terapeutaSeleccionado = null;

                    for (Terapeuta t : terapeutas) {
                        if (t.getRut().equalsIgnoreCase(rutTerapeuta)) {
                            terapeutaSeleccionado = t;
                            break;
                        }
                    }

                    if (terapeutaSeleccionado == null) {
                        System.out.println("El RUT ingresado no está registrado como terapeuta en el sistema.");
                        break;
                    }

                    // Crear y agregar la sesión
                    pacienteSeleccionado.agregarSesion(fechaSesion, horaSesion, terapeutaSeleccionado, observacionesSesion, tipoTerapia);
                    System.out.println("Sesión agregada exitosamente al paciente " + pacienteSeleccionado.getNombre());
                    break;
                case 11:
                    // CAMBIAR ESTADO DE PACIENTE
                    System.out.println("Ingrese el RUT del paciente para cambiar su estado:");
                    String rutCambiar = sc.nextLine();
                    Paciente pacienteCambiar = null;

                    // Buscar paciente
                    for (Paciente p : pacientes) {
                        if (p.getRut().equalsIgnoreCase(rutCambiar)) {
                            pacienteCambiar = p;
                            break;
                        }
                    }

                    if (pacienteCambiar == null) {
                        System.out.println("No se encontró un paciente con este RUT.");
                        break;
                    }

                    // Mostrar estado actual
                    if (pacienteCambiar.getEstado()) {
                        System.out.println("El paciente actualmente está marcado como que YA TERMINÓ su tratamiento.");
                    } else {
                        System.out.println("El paciente actualmente está marcado como que NO ha terminado su tratamiento.");
                    }

                    // Preguntar si desea cambiar
                    System.out.println("¿Desea cambiar el estado de este paciente? (1.Sí / 2.No)");
                    int cambiar = sc.nextInt();
                    sc.nextLine();

                    if (cambiar == 1) {
                        pacienteCambiar.setEstado(!pacienteCambiar.getEstado());
                        if (pacienteCambiar.getEstado()) {
                            System.out.println("Ahora el paciente está marcado como que YA TERMINÓ su tratamiento.");
                        } else {
                            System.out.println("Ahora el paciente está marcado como que NO ha terminado su tratamiento.");
                        }
                    } else {
                        System.out.println("El estado del paciente no fue modificado.");
                    }
                    break;
                default:
                    System.out.println("OPCIÓN INVALIDA TRATE NUEVAMENTE");
            }
            System.out.println("\nDeseas realizar otra acción? (1.Sí / 2.No)");
            verificar = sc.nextInt();
            sc.nextLine();
            System.out.println();
        }while(verificar == 1);
    }  
}
