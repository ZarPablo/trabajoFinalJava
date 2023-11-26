
package Persistencia;


import java.sql.ResultSet;
import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.Statement;


public abstract class DAO {
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER = "root";
    private final String PASSWORD = "Ranger@2014";
    private final String DATABASE = "javafinal";
    private final String DRIVER = "org.mariadb.jdbc.Driver";
    
    protected void conectarBase() {
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mariadb://localhost:3306/javafinal";
        } catch (Exception e) {
            
        }
    }
}
