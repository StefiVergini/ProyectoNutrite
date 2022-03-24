
package Desarrollo;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Dietas {
    
    private int NroDieta;
    private String NomDieta;
    
    private String AltaDieta = "INSERT INTO dietas (NomDieta) VALUES (?);";
    Conexion obj = new Conexion();
    PreparedStatement Ps;
    ResultSet Rs;
    DefaultTableModel objx; 
    String [] vectit = {"Codigo","Tipo de Dieta"};
    String [][] matdatos = {};

    public Dietas() {
    }

    public Dietas(String NomDieta) {
        this.NomDieta = NomDieta;
    }

    public int getNroDieta() {
        return NroDieta;
    }

    public String getNomDieta() {
        return NomDieta;
    }

    public void setNroDieta(int NroDieta) {
        this.NroDieta = NroDieta;
    }

    public void setNomDieta(String NomDieta) {
        this.NomDieta = NomDieta;
    }
    
    
        
    public void Altas() {
        try {
           Ps = obj.MeConecto().prepareStatement(AltaDieta);
           Ps.setString(1, this.NomDieta);
           int dioElAlta = Ps.executeUpdate();
            if (dioElAlta > 0) {
                JOptionPane.showMessageDialog(null, "Tipo de Dieta agregada.");                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no pudo cargar el tipo de dieta." + e);            
        }
    }
    
    public DefaultComboBoxModel MostrarTipoDieta(){
        String MuestraNom = "select distinct NomDieta from dietas order by NomDieta;"; 
        DefaultComboBoxModel objLista = new DefaultComboBoxModel();
        try {
            Ps = obj.MeConecto().prepareStatement(MuestraNom);
            Rs = Ps.executeQuery();
            while (Rs.next()) {
               objLista.addElement(Rs.getString(1)); 
            }
                  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar el tipo de dieta!");            
        }
        return objLista;
    }
    public DefaultTableModel Titulos(){
        
        objx = new DefaultTableModel (matdatos, vectit);
        return objx;
    }
    public DefaultTableModel MostrarDietas(){
    
     String MostrarSql = "SELECT TipodeDieta, NomDieta FROM dietas order by NomDieta;";
        try {
            Ps = obj.MeConecto().prepareStatement(MostrarSql);
            Rs = Ps.executeQuery();
            while (Rs.next()) {
                this.setNroDieta(Rs.getInt(1));
                this.setNomDieta(Rs.getString(2));
                Object [] vectorfila = {this.getNroDieta(), this.getNomDieta()};
                objx.addRow(vectorfila);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no puede mostrar los datos" + e);            
        }
        return objx;
    }
    
   /* public void Bajas(){
      String bajasSqlcod = "delete from dietas where TipodeDieta = '"+this.getNroDieta()+"';";
       String bajasSqlNom = "delete from dietas where NomDieta = '"+this.getNomDieta()+"';";
       try {
           Ps = obj.MeConecto().prepareStatement(bajasSqlcod);
           int x = Ps.executeUpdate();
           Ps = obj.MeConecto().prepareStatement(bajasSqlNom);
           int x2 = Ps.executeUpdate();
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error en baja del tipo de dieta." + "\n" + e);           
       }
   }
      
}*/
}
