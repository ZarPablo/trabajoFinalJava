
package ModeladoObjeto;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Incidente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
   // @Temporal(TemporalType.DATE)
   // private Date fecha;
    //@OneToMany(fetch=FetchType.LAZY)
    //private Set<Problema> tipoProblema;
    private String descripcion;
    @OneToOne(fetch=FetchType.LAZY)
    private Tecnico tecnico;
    private int tiempo;
    private int complejo;
    private String resuelto;
    private String observaciones;
    
}
