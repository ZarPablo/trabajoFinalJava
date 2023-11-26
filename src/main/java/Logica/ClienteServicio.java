
package Logica;

import ModeladoObjeto.Cliente;
import Persistencia.ClienteDAO;
import java.util.Scanner;


public class ClienteServicio {
    Scanner sc = new Scanner(System.in);
    private ClienteDAO dao;
    
    public ClienteServicio() {
        this.dao = new ClienteDAO();        
    }
    
    public void crearCliente () throws Exception {
        try {
            Cliente cli = new Cliente();
            System.out.println("Ingrese cuit");
           cli.setCuit(sc.next());
            System.out.println("Ingrese la razon social");
            sc.next();
           cli.setRazonSocial(sc.nextLine());
           System.out.println("Ingrese la dirección del cliente");
           cli.setDireccion(sc.nextLine());
            System.out.println("Ingrese el telefono de contacto");
           cli.setTelefono(sc.next());
            System.out.println("Ingrese el servicio contratado ( SAP, Tango, otro) ");
            sc.next();
           cli.setServicio(sc.nextLine());
            System.out.println("Ingrese el sistema Operativo que utiliza");
            cli.setSistemaOp(sc.nextLine());
           
           dao.guardarCliente(cli);
        } catch (Exception e) {
            throw e;
        }
    }
}
