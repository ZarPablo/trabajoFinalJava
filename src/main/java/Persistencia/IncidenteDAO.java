
package Persistencia;

import ModeladoObjeto.Cliente;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class IncidenteDAO extends DAO{
    
   Scanner sc = new Scanner(System.in);
        

    public Collection<Cliente> listarClientes() throws Exception {
        try {
            String sql = "SELECT * FROM Cliente ";

            consultarBase(sql);

            Cliente cli = null;
            Collection<Cliente> clientes = new ArrayList();
            while (resultado.next()) {
                cli = new Cliente();
                cli.setId(resultado.getInt(1));
                cli.setCuit(resultado.getNString(2));
                cli.setRazonSocial(resultado.getNString(3));
                cli.setTelefono(resultado.getString(4));
                cli.setDireccion(resultado.getString(5));
                cli.setServicio(resultado.getNString(6));
                cli.setSistemaOp(resultado.getNString(7));
                clientes.add(cli);            }
            desconectarBase();
            return clientes;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
}
