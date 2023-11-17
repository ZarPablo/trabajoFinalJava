
package ClasesObjeto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    private int cuit;
    private String razonSocial;
    private String telefono;
    private String direccion;
    private List<Servicio> servicio;
    private List<Incidente> incidente;
}
