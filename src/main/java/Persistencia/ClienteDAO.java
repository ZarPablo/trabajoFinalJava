
package Persistencia;

import ModeladoObjeto.Cliente;
import java.util.ArrayList;
import java.util.Collection;


public final class ClienteDAO extends DAO {
    
    public void guardarCliente(Cliente cli) throws Exception {
        try {
            if (cli == null) {
                throw new Exception("Cliente no valido");
            }
            String sql =  "INSERT INTO Cliente (cuit, razonSocial, telefono, direccion, servicio)" + "VALUES (' "+ cli.getCuit() + " ' , ' " +cli.getRazonSocial()+ " ' , ' " +cli.getTelefono()+ " ' , ' " +cli.getDireccion()+ " ' , ' " +cli.getServicio() + " ');";
            insertarModificarEliminar(sql);
        }catch (Exception e) {
            throw e;
        }
    }  
    
    public Cliente buscarClienteCuit(String cuit) throws Exception {
        try {
            String sql =  "SELECT * FROM Cliente " + " WHERE cuit = ' " + cuit + " ' "; 
            consultarBase(sql);
            
            Cliente cli = null;
            while (resultado.next()) {
                cli = new Cliente();
                cli.setCuit(resultado.getString(2));
                cli.setRazonSocial(resultado.getString(3));
                cli.setDireccion(resultado.getString(4));
                cli.setTelefono(resultado.getString(5));
                cli.setServicio(resultado.getString(6));
            }
            desconectarBase();
            return cli;
            
        } catch (Exception e) {
            desconectarBase();
            throw e; 
        }   
    }
    
     public Collection<Cliente> listarClientesXcuit() throws Exception {
        try {
            String sql =  "SELECT id, razonSocial FROM Cliente "; 
            consultarBase(sql);
            
            Cliente cli = null;
            Collection<Cliente> clientes = new ArrayList();
            while (resultado.next()) {
                cli = new Cliente();
                cli.setId(resultado.getInt(1));
                cli.setRazonSocial(resultado.getString(2));
                 }
            desconectarBase();
            return clientes;
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema"); 
        }   
    }
}
