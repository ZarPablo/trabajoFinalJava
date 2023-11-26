
package Persistencia;

import ModeladoObjeto.Tecnico;
import java.util.ArrayList;
import java.util.Collection;

public final class TecnicoDAO extends DAO {
    
    public void guardarTecnico(Tecnico tec) throws Exception {
        try {
            if (tec == null) {
                throw new Exception("Tecnico no valido");
            }
            String sql =  "INSERT INTO Tecnico (nombre, apellido, dni, telefono, especialidad, sistemaOp)" + "VALUES (' "+ tec.getNombre() + " ' , ' " +tec.getApellido()+ " ' , ' " +tec.getDni()+ " ' , ' " +tec.getTelefono()+ " ' , ' " +tec.getEspecialidad() + tec.getSistemaOp() + " ');";
            insertarModificarEliminar(sql);
        }catch (Exception e) {
            throw e;
        }
    }
    
    public Collection<Tecnico> listarTecnicosXespecialidad() throws Exception {
        try {
            String sql =  "SELECT nombre, apellido, especialidad, sistemaOp FROM Tecnico "; 
            consultarBase(sql);
            
            Tecnico tec = null;
            Collection<Tecnico> tecnicos = new ArrayList();
            while (resultado.next()) {
                tec = new Tecnico();
                tec.setNombre(resultado.getString(1));
                tec.setApellido(resultado.getString(2));
                tec.setEspecialidad(resultado.getString(3));
                tec.setSistemaOp(resultado.getString(4));
                 }
            desconectarBase();
            return tecnicos;
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema"); 
        }   
    }
    
}
