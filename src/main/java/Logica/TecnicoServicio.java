
package Logica;

import ModeladoObjeto.Tecnico;
import Persistencia.TecnicoDAO;
import java.util.Collection;
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
           sc.skip("\n");
            System.out.println("Ingrese la especialidad");
           tec.setEspecialidad(sc.nextLine());
            System.out.println("Ingrese los sistemas operativos que domina");
            tec.setSistemaOp(sc.nextLine());
           dao.guardarTecnico(tec);
        } catch (Exception e) {
            throw e;
        }
    }
     
      public Collection<Tecnico> listarTecnicos() throws Exception {

        try {

            Collection<Tecnico> tecnicos = dao.listarTecnicos();

            return tecnicos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirTecnicos() throws Exception {
        try {
            Collection<Tecnico> tecnicos = listarTecnicos();
            if (tecnicos.isEmpty()) {
                throw new Exception("No existen tecnicos para mostrar");
            } else {
                for (Tecnico t : tecnicos) {
                    System.out.print(t.getNombre());
                    System.out.print(" ");
                      System.out.print(t.getApellido());
                       System.out.print(" ");
                       System.out.print(t.getEspecialidad());
                        System.out.print(" ");
                        System.out.println(t.getSistemaOp());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
