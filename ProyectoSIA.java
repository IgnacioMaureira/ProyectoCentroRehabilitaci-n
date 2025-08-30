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
        
        //inicialización de terapias predeterminadas
        Terapias t1 = new Terapias("Fisioterapia", "Rehabilitación Física");
        Terapias t2 = new Terapias("Hidroterapia", "Ejercicios en agua");
        Terapias t3 = new Terapias("Electroterapia", "Estimulación eléctrica");
        
        terapias.put("T1",t1);
        terapias.put("T2",t2);
        terapias.put("T3",t3);
        
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
        
        Doctor doctor1 = new Doctor(nombreDoctor1,rutDoctor1,edadDoctor1,fechaDeNacimientoDoctor1);
        Doctor doctor2 = new Doctor(nombreDoctor2,rutDoctor2,edadDoctor2,fechaDeNacimientoDoctor2);
        Doctor doctor3 = new Doctor(nombreDoctor3,rutDoctor3,edadDoctor3,fechaDeNacimientoDoctor3);
        
        doctores.add(doctor1);
        doctores.add(doctor2);
        doctores.add(doctor3);
        
        //inicialización de Terapeutas
        
        
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

                        System.out.println("Ingrese Nombre del Nuevo Paciente:");
                        String nombreBuffer = sc.nextLine();

                        System.out.println("Ingrese Edad del Nuevo Paciente:");
                        int edadBuffer = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Ingrese Fecha de Nacimiento del Nuevo Paciente:");
                        String fechaBuffer = sc.nextLine();
                        
                        
                        Terapias tempTerapia;
                        while(true){
                            System.out.println("Ingrese Código de Terapia a Realizar:");
                            String identificadorBuffer = sc.nextLine();
                            
                            if(terapias.containsKey(identificadorBuffer)){
                                tempTerapia = terapias.get(identificadorBuffer);
                                System.out.println("Terapia Seleccionada: " + tempTerapia.getNombreTerapia());
                                break;
                            }
                            else{
                                System.out.println("IDENTIFICADOR NO VÁLIDO...\n");
                            }
                        }
                        
                        
                        Paciente p = new Paciente(rutBuffer,nombreBuffer,edadBuffer,fechaBuffer,tempTerapia);
                        pacientes.add(p);

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
