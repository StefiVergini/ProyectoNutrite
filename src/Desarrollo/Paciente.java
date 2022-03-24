
package Desarrollo;
import java.sql.Date;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Paciente {
    
    //atributos
    
    private String Email;
    private String Psw;
    private String Nombre;
    private String Apellido;
    private String Dni;
    private String Celular;
    private String Domicilio;
    private Date FechaNac;
    private String NroAfiliado;
    private String Prepaga;
    private double Estatura;
    private double Peso;
    private boolean Entrena;
    private String AcFisica;
    private String Enfermedades;
    private String Alergias;
    private String Observaciones;
    private int matriculanutri;
    private int tipodieta;
    private String NomDieta;
    
    private String AltaPaciente = "INSERT INTO paciente (Email,Password,Nombre,Apellido,Dni,Celular,Domicilio,FechaNac,NroAfiliado,Prepaga,Estatura,Peso,Entrena,Acfisica,Enfermedades,Alergias,Observaciones,Nutricionista_MatriculaNro,Dietas_TipodeDieta) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
    Conexion obj = new Conexion();
    PreparedStatement Ps;
    ResultSet Rs;
    DefaultTableModel objx; 

    String [] vectit = {"Apellido","Nombre","Email", "DNI","Celular","Prepaga" ,"Observaciones"};
    String [][] matdatos = {};
    
    //constructor
    public Paciente(String Email, String Psw, String Nombre, String Apellido, String Dni, String Celular, String Domicilio, Date FechaNac, String NroAfiliado, String Prepaga, double Estatura, double Peso, boolean Entrena, String AcFisica, String Enfermedades, String Alergias, String Observaciones, int matriculanutri, int tipodieta) {
        this.Email = Email;
        this.Psw = Psw;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Dni = Dni;
        this.Celular = Celular;
        this.Domicilio = Domicilio;
        this.FechaNac = FechaNac;
        this.NroAfiliado = NroAfiliado;
        this.Prepaga = Prepaga;
        this.Estatura = Estatura;
        this.Peso = Peso; 
        this.Entrena = Entrena;
        this.AcFisica = AcFisica;
        this.Enfermedades = Enfermedades;
        this.Alergias = Alergias;
        this.Observaciones = Observaciones;
        this.matriculanutri = matriculanutri;
        this.tipodieta = tipodieta;
    }
     public Paciente(String Email, String Psw, String Nombre, String Apellido, String Dni, String Celular, String Domicilio, Date FechaNac, String NroAfiliado, String Prepaga, double Estatura, double Peso, String AcFisica, String Enfermedades, String Alergias, String Observaciones, int matriculanutri, int tipodieta) {
        this.Email = Email;
        this.Psw = Psw;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Dni = Dni;
        this.Celular = Celular;
        this.Domicilio = Domicilio;
        this.FechaNac = FechaNac;
        this.NroAfiliado = NroAfiliado;
        this.Prepaga = Prepaga;
        this.Estatura = Estatura;
        this.Peso = Peso; 
        this.AcFisica = AcFisica;
        this.Enfermedades = Enfermedades;
        this.Alergias = Alergias;
        this.Observaciones = Observaciones;
        this.matriculanutri = matriculanutri;
        this.tipodieta = tipodieta;
    }
     public Paciente (String Observaciones){
         this.Observaciones = Observaciones; 
     }

    public Paciente() {
    }
    //metodos
    public String getEmail() {
        return Email;
    }

    public String getDni() {
        return Dni;
    }

    public String getPsw() {
        return Psw;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCelular() {
        return Celular;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public Date getFechaNac() {
        return FechaNac;
    }

    public String getNroAfiliado() {
        return NroAfiliado;
    }

    public String getPrepaga() {
        return Prepaga;
    }

    public double getEstatura() {
        return Estatura;
    }

    public double getPeso() {
        return Peso;
    }

    public String getAcFisica() {
        return AcFisica;
    }

    public String getEnfermedades() {
        return Enfermedades;
    }

    public String getAlergias() {
        return Alergias;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public int getMatriculanutri() {
        return matriculanutri;
    }

    public boolean isEntrena() {
        return Entrena;
    }

    public int getTipodieta() {
        return tipodieta;
    }

    public String getNomDieta() {
        return NomDieta;
    }
    
    

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public void setPsw(String Psw) {
        this.Psw = Psw;
    }

    public void setEntrena(boolean Entrena) {
        this.Entrena = Entrena;
    }

    public void setTipodieta(int tipodieta) {
        this.tipodieta = tipodieta;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }

    public void setNroAfiliado(String NroAfiliado) {
        this.NroAfiliado = NroAfiliado;
    }

    public void setPrepaga(String Prepaga) {
        this.Prepaga = Prepaga;
    }

    public void setEstatura(double Estatura) {
        this.Estatura = Estatura;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public void setAcFisica(String AcFisica) {
        this.AcFisica = AcFisica;
    }

    public void setEnfermedades(String Enfermedades) {
        this.Enfermedades = Enfermedades;
    }

    public void setAlergias(String Alergias) {
        this.Alergias = Alergias;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public void setMatriculanutri(int matriculanutri) {
        this.matriculanutri = matriculanutri;
    }   

    public void setNomDieta(String NomDieta) {
        this.NomDieta = NomDieta;
    }
    
    
    public boolean Login(){
        String SqlLogin = "select Nombre, Email, Password FROM paciente where Email = '"+this.getEmail()+"' and Password = '"+this.getPsw()+"';";
        try {
            Ps = obj.MeConecto().prepareStatement(SqlLogin);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                this.setNombre(Rs.getString(1));
                return true;               
            }
            else{
                return false;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Email o DNI Incorrecto" + "\n" + e); 
            return false;
        }
    }
    
    public void Altas(){
        try {
           Ps = obj.MeConecto().prepareStatement(AltaPaciente);
           Ps.setString( 1, this.Email);
           Ps.setString(2,this.Psw);
           Ps.setString(3, this.Nombre);
           Ps.setString(4, this.Apellido);
           Ps.setString(5, this.Dni);
           Ps.setString(6, this.Celular);
           Ps.setString(7, this.Domicilio);
           Ps.setDate(8, this.FechaNac);
           Ps.setString(9, this.NroAfiliado);
           Ps.setString(10, this.Prepaga);
           Ps.setDouble(11, this.Estatura);
           Ps.setDouble(12, this.Peso);
           Ps.setBoolean(13, this.Entrena);
           Ps.setString(14, this.AcFisica);
           Ps.setString(15, this.Enfermedades);
           Ps.setString(16, this.Alergias);
           Ps.setString(17, this.Observaciones);
           Ps.setInt(18, this.matriculanutri);
           Ps.setInt(19, this.tipodieta);
           int dioElAlta = Ps.executeUpdate();
            if (dioElAlta > 0) {
                JOptionPane.showMessageDialog(null, "Paciente Guardado."); 
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en los registros del paciente" + "\n" + e);            
        }
        
    }
    
    public DefaultComboBoxModel MostrarNomDieta(){
        String MuestraNom = "select distinct NomDieta from dietas order by NomDieta;"; 
        //este select sirve para mostrar los nombres que ccontienen otra tabla cuando la relación que tienen es por el código 
        DefaultComboBoxModel objCombo = new DefaultComboBoxModel();
       
        try {
            Ps = obj.MeConecto().prepareStatement(MuestraNom);
            Rs = Ps.executeQuery();
            while (Rs.next()) {
               objCombo.addElement(Rs.getString(1)); 
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR LOS ARTICULOS");            
        }
        return objCombo;
    }
    
     public boolean BuscarCodDietaxNom (String NombreDieta){
        String BuscarCod = "select TipodeDieta from dietas where NomDieta = '"+ NombreDieta +"';";
         try {
             Ps = obj.MeConecto().prepareStatement(BuscarCod);
            Rs = Ps.executeQuery();
            if (Rs.next()) {                
                this.setTipodieta(Rs.getInt(1));
               }
            return true; 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no encuentra el código." + e); 
            
            return false;
        }
    }
    public void Mostrar(){
        
    }
    
    public boolean Buscar(String dni){
        boolean existe = false;
        String buscarSql = "SELECT p.Email,p.Nombre,p.Apellido,p.Dni,p.Celular,p.Domicilio,p.FechaNac,p.NroAfiliado,p.Prepaga,p.Estatura,p.Peso,p.Acfisica,p.Enfermedades,p.Alergias,p.Observaciones,p.Nutricionista_MatriculaNro, d.NomDieta FROM paciente as p inner join nutricionista as a on p.Nutricionista_MatriculaNro = a.MatriculaNro inner join dietas as d on p.Dietas_TipodeDieta  = d.TipodeDieta where p.Dni = '"+dni+"';";
        try {
          Ps = obj.MeConecto().prepareStatement(buscarSql);
          Rs = Ps.executeQuery();
         
            if (Rs.next()) {
           this.setEmail(Rs.getString(1));
           this.setNombre(Rs.getString(2));
           this.setApellido(Rs.getString(3));
           this.setDni(Rs.getString(4));
           this.setCelular(Rs.getString(5));
           this.setDomicilio(Rs.getString(6));
           this.setFechaNac(Rs.getDate(7));
           this.setNroAfiliado(Rs.getString(8));
           this.setPrepaga(Rs.getString(9));
           this.setEstatura(Rs.getDouble(10));
           this.setPeso(Rs.getDouble(11));
           this.setAcFisica(Rs.getString(12));
           this.setEnfermedades(Rs.getString(13));
           this.setAlergias(Rs.getString(14));
           this.setObservaciones(Rs.getString(15));
           this.setMatriculanutri(Rs.getInt(16));
           this.setNomDieta(Rs.getString(17));
               existe = true;
            } else {
                existe = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!No encuentra al Paciente." + "\n" + e);            
        }
        return existe;  
    }
       public boolean BuscarXApe(String ape){
        boolean existe = false;
        String buscarSql = "SELECT p.Apellido, p.Nombre, p.Email,p.Dni,p.Celular,p.Prepaga,p.Observaciones FROM paciente as p inner join nutricionista as a on p.Nutricionista_MatriculaNro = a.MatriculaNro inner join dietas as d on p.Dietas_TipodeDieta  = d.TipodeDieta where p.Apellido = '"+ape+"';";
        try {
          Ps = obj.MeConecto().prepareStatement(buscarSql);
          Rs = Ps.executeQuery();
            if (Rs.next()) {
           this.setApellido(Rs.getString(1));
           this.setNombre(Rs.getString(2));
           this.setEmail(Rs.getString(3));
           this.setDni(Rs.getString(4));
           this.setCelular(Rs.getString(5));
           this.setPrepaga(Rs.getString(6));
           this.setObservaciones(Rs.getString(7));
               existe = true;
            } else {
                existe = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!! No encuentra al Paciente." + "\n" + e);            
        }
        return existe;  
    }
       
      public DefaultTableModel Titulos(){
        
        objx = new DefaultTableModel (matdatos, vectit);
        return objx;
    }
      public DefaultTableModel MostrarPaciente(String ape){
     String MostrarSql = "SELECT p.Apellido, p.Nombre, p.Email,p.Dni,p.Celular,p.Prepaga,p.Observaciones FROM paciente as p inner join nutricionista as a on p.Nutricionista_MatriculaNro = a.MatriculaNro inner join dietas as d on p.Dietas_TipodeDieta  = d.TipodeDieta where p.Apellido = '"+ape+"';";
        try {
            Ps = obj.MeConecto().prepareStatement(MostrarSql);
            Rs = Ps.executeQuery();
            while (Rs.next()) {
             this.setApellido(Rs.getString(1));
           this.setNombre(Rs.getString(2));
           this.setEmail(Rs.getString(3));
           this.setDni(Rs.getString(4));
           this.setCelular(Rs.getString(5));
           this.setPrepaga(Rs.getString(6));
           this.setObservaciones(Rs.getString(7));
                Object [] vectorfila = {this.getApellido(), this.getNombre(),this.getEmail(),this.getDni(),this.getCelular(), this.getPrepaga(),this.getObservaciones()};
                objx.addRow(vectorfila);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no puede mostrar los datos" + e);            
        }
        return objx;
    }
    
    public void Modificar(String Dni){
        String cambio = "UPDATE paciente SET Email = '"+this.getEmail()+"', Nombre = '"+this.getNombre()+"', Apellido = '"+this.getApellido()+"', Dni = '"+this.getDni()+"', Celular = '"+this.getCelular()+"', Domicilio = '"+this.getDomicilio()+"', FechaNac = '"+this.getFechaNac()+"', NroAfiliado = '"+this.getNroAfiliado()+"', Prepaga= '"+this.getPrepaga()+"', Estatura = '"+this.getEstatura()+"', Peso = '"+this.getPeso()+"', Acfisica = '"+this.getAcFisica()+"', Enfermedades = '"+this.getEnfermedades()+"', Alergias = '"+this.getAlergias()+"', Observaciones = '"+this.getObservaciones()+"', Nutricionista_MatriculaNro = '"+this.getMatriculanutri()+"', Dietas_TipodeDieta = '"+this.getTipodieta()+"' WHERE Dni = '"+ Dni +"';";
        
        try {
            Ps = obj.MeConecto().prepareStatement(cambio);
            int resultado = Ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Datos del paciente modificados.");                
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar al paciente" + "\n" + e);            
        }
    }
    public void ModificarxApeynom(String Apellido){
         String cambio = "UPDATE paciente SET Observaciones = '"+this.getObservaciones()+"' where Apellido ='"+Apellido+"';";
         try {
            Ps = obj.MeConecto().prepareStatement(cambio);
            int resultado = Ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Observación del paciente agregada.");                
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar al paciente" + "\n" + e);            
        }
    }
    public void Bajas (String dni){
         String eliminar = "DELETE FROM paciente WHERE Dni = '"+ dni +"';";
        
        try {
            Ps = obj.MeConecto().prepareStatement(eliminar);
            int resultado = Ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Registros del Paciente eliminados.");                
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al querer elimminar al paciente" + "\n" + e);            
        }}

    public int setTipodieta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
