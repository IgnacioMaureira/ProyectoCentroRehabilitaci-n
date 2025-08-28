/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectosia;

import java.util.*;

/**
 *
 * @author novoy
 */
public class ProyectoSIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Paciente> pacientes = new ArrayList<>();
        //List<Terapias> terapias = new ArrayList<>();
        Hashtable<String,Terapias> terapias = new Hashtable<>();
        Scanner sc = new Scanner(System.in);
        int verificar;
        
        do{
            int opcion, opcion2;
            System.out.println("#####MENÚ GENERAL#####");
            System.out.println("1. Agregar Nuevo Paciente.");
            System.out.println("2. Mostrar Pacientes.");
            System.out.println("3. Agregar Nueva Terapia.");
            System.out.println("4. Mostrar Terapias.");
            System.out.print("Selección: ");
            
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch(opcion){
                case 1:
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
                            System.out.println("#####################\n");
                            i++;
                        }
                    }
                    break;
                case 3:
                    do{
                        System.out.println("Ingrese Identificador de la Nueva Terapia:");
                        String identificadorBuffer = sc.nextLine();
                        
                        if(terapias.containsKey(identificadorBuffer)){
                            System.out.println("YA EXISTE ESTE IDENTIFICADOR ASOCIADO A UNA TERAPIA");
                        }
                        else{
                            System.out.println("Ingrese Nombre de la Nueva Terapia:");
                            String nombreBuffer = sc.nextLine();

                            System.out.println("Ingrese Cantidad Total de Sesiones:");
                            int sesionesBuffer = sc.nextInt();
                            sc.nextLine();

                            Terapias t = new Terapias(nombreBuffer,sesionesBuffer);
                            terapias.put(identificadorBuffer,t);
                        }
                        System.out.println("Deseas agregar otra terapia? (1.Sí / 2.No)");
                        opcion2 = sc.nextInt();
                        sc.nextLine();

                    } while(opcion2 == 1);
                    break;
                case 4:
                    if (terapias.isEmpty()){
                        System.out.println("NO EXISTEN TERAPIAS REGISTRADAS");
                    }
                    else{
                        
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
