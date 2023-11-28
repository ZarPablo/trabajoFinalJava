
package Logica;

import ModeladoObjeto.Cliente;
import ModeladoObjeto.Incidente;
import Persistencia.IncidenteDAO;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class IncidenteServicio {
    Scanner sc = new Scanner(System.in);
   
        private IncidenteDAO dao;   
        
       

    Incidente reclamo = new Incidente();
    
    Cliente cli = new Cliente();

    public void iniciarIncidente() throws Exception {

        reclamo.setFecha(new Date());
        System.out.println("Seleccion id del cliente");
       
        mostrarClientes();
       
    } 

    private void mostrarClientes() throws Exception {
           Collection<Cliente> clientes = listarClientes();
            if (clientes.isEmpty()) {
                throw new Exception("No existen clientes para mostrar");
            } else {
                for (Cliente c : clientes) {
                    System.out.println(c);
                }
            }
    }

    private Collection<Cliente> listarClientes() throws Exception {
     try {

            Collection<Cliente> clientes = dao.listarClientes();

            return clientes;
        } catch (Exception e) {
            throw e;
        }    
    }
    
  
     
   
    
}
