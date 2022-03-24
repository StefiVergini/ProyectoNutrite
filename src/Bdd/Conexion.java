
package Bdd;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Conexion {
       // atributos
    private final String nomBdd = "jdbc:mysql://Localhost:3306/nutrite";
    private final String usu = "root";
    private final String clave = "";
    
    private final String Driver = "com.mysql.jdbc.Driver";
    Connection Con;
    
    // constructor
    public Conexion(){
        try {
            Class.forName(Driver);
            // conectarme
           Con  = DriverManager.getConnection(nomBdd, usu, clave);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el driver o Bdd" + "\n" + e);
        }
    }

    // metodos
    public Connection MeConecto(){
        return Con;
    }
    
    public void MeDesconecto(){
        System.out.println("desconectado");
    }
}
