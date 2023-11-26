package com.mycompany.trabajointegrador;

import Logica.ClienteServicio;
import ModeladoObjeto.Cliente;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TrabajoIntegrador {
    
    public static EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory ("javaTrabajoFinalPU");
        EntityManager manager = factory.createEntityManager();
        return manager;
        
    }

    public static void main(String[] args) throws Exception {
        ClienteServicio cliSer = new ClienteServicio();
          Scanner scanner = new Scanner(System.in);
         Cliente cli = new Cliente();
       
         
          int opcion;
        //long nroCliente;
        do {
            System.out.println("Menú Principal");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Registrar Técnico");
            System.out.println("3. Mostrar Clientes");
            System.out.println("4. Mostrar Técnicos");
            System.out.println("5. Registrar Especialidad");
            System.out.println("6. Registrar Incidente");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cliSer.crearCliente();
                    break;                                     
         /*       case 2:
                   // pc.agregarTecnico(scanner);
                    break;
                case 3:
                 //   pc.mostrarClientes();
                    break;
                case 4:
                   // mostrarTecnicos();
                    break;
                case 5:
                   // ec.agregarEspecialidad();
                    break;
                case 6:
                  /*  pc.mostrarClientes();
                    System.out.println("Ingrese el numero del cliente");
                    nroCliente = scanner.nextLong();
                    ic.agregarIncidente(
                            pc.buscarClienteId(nroCliente)
                    );
                    break;
                case 7:
                    control.agregarServicio(scanner);
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break; */
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    
    }
}
