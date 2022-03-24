
package Desarrollo;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Recetario {
    //atributos
    private String TitReceta;
    private String Ingredientes;
    private String Pasos;
    private String TipoReceta; //dulce o salada
    private String PuntodelDia; //desayuno merienda cena 
    private int tipodieta;
    private String NomDieta;
    
    
    
    private String AltaReceta = "INSERT INTO recetario(TitReceta, Ingredientes, PasosReceta, TipoReceta, PuntodelDia, Dietas_TipodeDieta) VALUES (?,?,?,?,?,?);";
    Conexion obj = new Conexion();
    PreparedStatement Ps;
    ResultSet Rs;
        
    //contructor

    public Recetario(String TitReceta, String Ingredientes, String Pasos, String TipoReceta, String PuntodelDia, int tipodieta) {
        this.TitReceta = TitReceta;
        this.Ingredientes = Ingredientes;
        this.Pasos = Pasos;
        this.TipoReceta = TipoReceta;
        this.PuntodelDia = PuntodelDia;
        this.tipodieta = tipodieta;
    }

    public Recetario(String TitReceta, String Ingredientes, String Pasos, String TipoReceta, String PuntodelDia, String NomDieta) {
        this.TitReceta = TitReceta;
        this.Ingredientes = Ingredientes;
        this.Pasos = Pasos;
        this.TipoReceta = TipoReceta;
        this.PuntodelDia = PuntodelDia;
        this.NomDieta = NomDieta;
    }

    public Recetario() {
    }
    
    public String getTitReceta() {    
        return TitReceta;
    }

    public String getIngredientes() {
        return Ingredientes;
    }

    public String getPasos() {
        return Pasos;
    }

    public String getPuntodelDia() {
        return PuntodelDia;
    }

    //metodos
    public String getNomDieta() {    
        return NomDieta;
    }

    public int getTipodieta() {
        return tipodieta;
    }

    public String getTipoReceta() {
        return TipoReceta;
    }

    public void setTipoReceta(String TipoReceta) {
        this.TipoReceta = TipoReceta;
    }

    public void setTipodieta(int tipodieta) {
        this.tipodieta = tipodieta;
    }

    public void setTitReceta(String TitReceta) {
        this.TitReceta = TitReceta;
    }

    public void setIngredientes(String Ingredientes) {
        this.Ingredientes = Ingredientes;
    }

    public void setPasos(String Pasos) {
        this.Pasos = Pasos;
    }

    public void setPuntodelDia(String PuntodelDia) {
        this.PuntodelDia = PuntodelDia;
    }

    public void setNomDieta(String NomDieta) {
        this.NomDieta = NomDieta;
    }
     public void Altas(){
        try {
           Ps = obj.MeConecto().prepareStatement(AltaReceta);
           Ps.setString( 1, this.TitReceta);
           Ps.setString(2,this.Ingredientes);
           Ps.setString(3, this.Pasos);
           Ps.setString(4, this.TipoReceta);
           Ps.setString(5, this.PuntodelDia);
           Ps.setInt(6, this.tipodieta);
           int dioElAlta = Ps.executeUpdate();
            if (dioElAlta > 0) {
                JOptionPane.showMessageDialog(null, "¡Receta Agregada!");                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar una nueva receta." + "\n" + e);            
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
    
      public boolean BuscarCodDietaxNom (String NombreDieta){
          boolean exites = false;
        String BuscarCod = "select TipodeDieta from dietas where NomDieta = '"+ NombreDieta +"';";
         try {
             Ps = obj.MeConecto().prepareStatement(BuscarCod);
            Rs = Ps.executeQuery();
            if (Rs.next()) {                
                this.setTipodieta(Rs.getInt(1));
               }
            return true; 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no encuentra el tipo de dieta." + e); 
            
            return false;
        }
      }
      
      public boolean BuscarRecetaXId (int cod){
          boolean existe = false;
          String BuscarCod = "select r.TitReceta, r.Ingredientes, r.PasosReceta, r.TipoReceta, r.PuntodelDia, d.NomDieta from recetario as r inner join dietas as d on r.Dietas_TipodeDieta = d.TipodeDieta where r.idRecetario = '"+cod+"';";
         try {
          Ps = obj.MeConecto().prepareStatement(BuscarCod);
          Rs = Ps.executeQuery();
            if (Rs.next()) {
                //mandar los datos del select a los atributos por medio de los metodos set
                this.setTitReceta(Rs.getString(1));
                this.setIngredientes(Rs.getString(2));
                this.setPasos(Rs.getString(3));
                this.setTipoReceta(Rs.getString(4));
                this.setPuntodelDia(Rs.getString(5));
                this.setNomDieta(Rs.getString(6));
               existe = true;
            } else {
                existe = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error! No encuentra la receta." + "\n" + e);            
        }
        return existe;  
      }
        
      
        public DefaultListModel MostrarDietas(){
        String MuestraNom = "select NomDieta from dietas order by NomDieta;";
        DefaultListModel objLista = new DefaultListModel();
        objLista.clear();
        try {
            Ps = obj.MeConecto().prepareStatement(MuestraNom);
            Rs = Ps.executeQuery();
            while (Rs.next()) {
               objLista.addElement(Rs.getString(1)); 
               
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR LAS DIETAS.");            
        }
        return objLista;
    }  
        //falta modificar
        
        DefaultTableModel objx;        
    String [] vectit = {"Titulo", "Ingredientes", "Procedimiento", "Tipo de Receta", "Momento del Día", "Tipo de Dieta"};
    String [][] matdatos = {}; //matriz vacia y declarada.
    
    public DefaultTableModel Titulo(){
        objx = new DefaultTableModel (matdatos, vectit);
        return objx;
    }
    
    public DefaultTableModel Mostrar(String dieta){
    
        objx = new DefaultTableModel (matdatos, vectit);
        String SelectRecet = "select r.TitReceta, r.Ingredientes, r.PasosReceta, r.TipoReceta, r.PuntodelDia, d.NomDieta from recetario as r inner join dietas as d on r.Dietas_TipodeDieta = d.TipodeDieta where d.NomDieta = '"+dieta+"';";
        try {
            Ps = obj.MeConecto().prepareStatement(SelectRecet);
            Rs = Ps.executeQuery();
            while (Rs.next()) {
                this.setTitReceta(Rs.getString(1));
                this.setIngredientes(Rs.getString(2));
                this.setPasos(Rs.getString(3));
                this.setTipoReceta(Rs.getString(4));
                this.setPuntodelDia(Rs.getString(5));
                this.setNomDieta(Rs.getString(6));
                Object [] vectorfilaRecet = {this.getTitReceta(), this.getIngredientes(), this.getPasos(), this.getTipoReceta(), this.getPuntodelDia(), this.getNomDieta()};
                objx.addRow(vectorfilaRecet);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no puede mostrar la receta." + "\n" + e);            
        }
        return objx;
    }
        
    public void Bajas(int cod){
        
        String x = "DELETE FROM recetario WHERE idRecetario = '"+ cod +"';";
        
        try {
            Ps = obj.MeConecto().prepareStatement(x);
            int resultado = Ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Receta Eliminada.");                
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL QUERER ELIMINAR LA RECETA." + "\n" + e);            
        }
    }
    public void Bajas (String titreceta){
         String n = "DELETE FROM recetario WHERE TitReceta = '"+ titreceta +"';";
        
        try {
            Ps = obj.MeConecto().prepareStatement(n);
            int resultado = Ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Receta Eliminada.");                
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL QUERER ELIMINAR LA RECETA." + "\n" + e);            
        }
        
    }
       
     public void Modificar (String titreceta){
        String cambio = "UPDATE recetario SET TitReceta = '"+this.getTitReceta()+"', Ingredientes = '"+this.getIngredientes()+"', PasosReceta = '"+this.getPasos()+"', TipoReceta = '"+this.getTipoReceta()+"', PuntodelDia = '"+this.getPuntodelDia()+"', Dietas_TipodeDieta = '"+this.getTipodieta()+"' WHERE idRecetario = '"+titreceta+"';";
        try {
            Ps = obj.MeConecto().prepareStatement(cambio);
            int resultado = Ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Receta Modificada");                
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar el producto" + "\n" + e);            
        }}
}
