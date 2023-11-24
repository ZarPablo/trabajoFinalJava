
package ClasesObjeto;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente implements Serializable {

    @Id
    private int cuit;
    private String razonSocial;
    private String telefono;
    private String direccion;
    @ManyToMany
    private List<Servicio> servicio;
      @OneToMany
    private List<Incidente> incidente;
}
