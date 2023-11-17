
package ClasesObjeto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tecnico {
    private int id;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private List<Especialidad> especialidad;
    private List<Incidente> incidentes;
    private String notificacion;
    
}
