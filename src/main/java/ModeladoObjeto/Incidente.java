
package ModeladoObjeto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Incidente  {
   
    private int id;
   private Date fecha;
   private Cliente cliente;
    private String descripcion;
    private Tecnico tecnico;
    private int tiempo;
    private String complejo;
    private String resuelto;
    private String observaciones;
    
}
