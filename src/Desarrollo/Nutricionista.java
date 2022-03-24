
package Desarrollo;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Nutricionista {
    
    //atributos
    private int MatriNro;
    private String Email;
    private String Psw;
    private String Nom;
    private String Ape;
    private String Dni;
    private String Cel;
    
    private String AltaNutricionista = "INSERT INTO nutricionista (MatriculaNro,Email,Password,Nom,Ape,Dni,Celular) VALUES(?,?,?,?,?,?,?);";
    Conexion obj = new Conexion();
    PreparedStatement Ps;
    ResultSet Rs;
        
    //constructor

    public Nutricionista(int MatriNro, String Email, String Psw, String Nom, String Ape, String Dni, String Cel) {
        this.MatriNro = MatriNro;
        this.Email = Email;
        this.Psw = Psw;
        this.Nom = Nom;
        this.Ape = Ape;
        this.Dni = Dni;
        this.Cel = Cel;
       }

    public Nutricionista() {
    }
   
    public int getMatriNro() {
        return MatriNro;
    }

    public String getPsw() {
        return Psw;
    }

    public String getNom() {
        return Nom;
    }

    public void setMatriNro(int MatriNro) {
        this.MatriNro = MatriNro;
    }

    public void setPsw(String Psw) {
        this.Psw = Psw;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }   
    //metodos
    public boolean Login(){
        String SQLLogin = "SELECT Nom, MatriculaNro, Password FROM nutricionista where MatriculaNro = '"+this.getMatriNro() +"' and Password = '"+ this.getPsw()+"';";
        try {
            Ps = obj.MeConecto().prepareStatement(SQLLogin);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                this.setNom(Rs.getString(1));
                return true;               
            }
            else{
                return false;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Número de Matrícula o Contraseña Incorrectas" + "\n" + e); 
            return false;
        }
    }
    
    public void Altas(){
        try {
           Ps = obj.MeConecto().prepareStatement(AltaNutricionista);
           Ps.setInt( 1, this.MatriNro);
           Ps.setString(2,this.Email);
           Ps.setString(3, this.Psw);
           Ps.setString(4, this.Nom);
           Ps.setString(5, this.Ape);
           Ps.setString(6, this.Dni);
           Ps.setString(7, this.Cel);
           int dioElAlta = Ps.executeUpdate();
            if (dioElAlta > 0) {
                JOptionPane.showMessageDialog(null, "¡Registro exitoso!");                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar un registro en Nutricionista" + "\n" + e);            
        }
        
    }
    
    
    
    public void Modificaciones (){
        
    }
    
    public void Bajas (){
        
    }
    
    public void Buscar(){
        
    }
    
}
