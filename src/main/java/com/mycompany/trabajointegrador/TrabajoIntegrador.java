package com.mycompany.trabajointegrador;

import Logica.ClienteServicio;
import Logica.TecnicoServicio;
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
        TecnicoServicio tecSer = new TecnicoServicio();
          Scanner scanner = new Scanner(System.in);
         
       
         
          int opcion;
        //long nroCliente;
        do {
            System.out.println("Menú Principal");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Registrar Técnico");
            System.out.println("3. Mostrar Clientes");
            System.out.println("4. Mostrar Técnicos por especialidad");
            System.out.println("5. Ingresar Incidente Nuevo");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cliSer.crearCliente();
                    break;                                     
                case 2:
                   tecSer.crearTecnico();
                    break;
                case 3:
                  cliSer.imprimirClientes();
                    break;
                case 4:
                   tecSer.imprimirTecnicos();
                    break;
                case 5:
                   // ec.agregarEspecialidad();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break; 
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    
    }
}
