
package Logica;

import ModeladoObjeto.Tecnico;
import Persistencia.TecnicoDAO;
import java.util.Scanner;

public class TecnicoServicio {
    Scanner sc = new Scanner(System.in);
    private TecnicoDAO dao;
    
    public TecnicoServicio() {
        this.dao = new TecnicoDAO();        
    }
    
     public void crearTecnico () throws Exception {
        try {
            Tecnico tec = new Tecnico();
            System.out.println("Ingrese nombres del tecnico");
           tec.setNombre(sc.nextLine());
            System.out.println("Apellidos del tecnico");
           tec.setApellido(sc.nextLine());
           System.out.println("Ingrese DNI del tecnico");
           tec.setDni(sc.nextLine());
            System.out.println("Ingrese el telefono de contacto");
           tec.setTelefono(sc.next());
            System.out.println("Ingrese la especialidad");
            sc.next();
           tec.setEspecialidad(sc.nextLine());
            System.out.println("Ingrese los sistemas operativos que domina");
            tec.setSistemaOp(sc.nextLine());
           dao.guardarTecnico(tec);
        } catch (Exception e) {
            throw e;
        }
    }
}
