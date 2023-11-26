
package ModeladoObjeto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private int id;
    private String cuit;
    private String razonSocial;
    private String telefono;
    private String direccion;
    private String servicio;
    private String sistemaOp;
}
