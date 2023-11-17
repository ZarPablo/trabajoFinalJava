
package ClasesObjeto;

import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Incidente {
    private int id;
    private Date fecha;
    private List<Problema> tipoProblema;
    private String descripcion;
    private Tecnico tecnico;
    private int hora;
    private int complejo;
    private boolean resuelto;
    private String observaciones;
    
}
