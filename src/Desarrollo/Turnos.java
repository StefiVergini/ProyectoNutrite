
package Desarrollo;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Turnos {
   // private int hora;//fijarme si int o LocalTime
    //private int minuto;
    private String Asistio;
    private Date FechaTurno;
    private Time HoraMin;
    private int Matricula;
    private int idPaciente;
    private String dniPa;
    
    private String AltaTurno = "INSERT INTO turnos (Fecha, Hora, Asistio, Nutricionista_MatriculaNro, Paciente_idPaciente) VALUES (?,?,?,?,?);";
    Conexion obj = new Conexion();
    PreparedStatement Ps;
    ResultSet Rs;
    
    LocalTime hm;
    /*public Turnos(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }*/

    public Turnos() {
    }

    public String getAsistio() {
        return Asistio;
    }

    public Date getFechaTurno() {
        return FechaTurno;
    }

    public Time getHoraMin() {
        return HoraMin;
    }

    public int getMatricula() {
        return Matricula;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public String getDniPa() {
        return dniPa;
    }

    public void setAsistio(String Asistio) {
        this.Asistio = Asistio;
    }

    public void setFechaTurno(Date FechaTurno) {
        this.FechaTurno = FechaTurno;
    }

    public void setHoraMin(Time HoraMin) {
        this.HoraMin = HoraMin;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setDniPa(String dniPa) {
        this.dniPa = dniPa;
    }
    

   /* public int getHora() {
        return hora;
    }*/

   /* public int getMinuto() {
        return minuto;
    }*/
     public void Altas(){
        try {
           Ps = obj.MeConecto().prepareStatement(AltaTurno);
           Ps.setDate(1, this.FechaTurno);
           Ps.setTime(2,this.HoraMin);
           Ps.setString(3,this.Asistio);
           Ps.setInt(4, this.Matricula);
           Ps.setInt(5, this.idPaciente);
           int dioElAlta = Ps.executeUpdate();
            if (dioElAlta > 0) {
                JOptionPane.showMessageDialog(null, "Turno Agendado.");                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agendar un nuevo turno." + "\n" + e);            
        }
        
    }
    
   /* LocalTime horaactual = LocalTime.now();//hora actual
    LocalTime h1 = LocalTime.of(15, 45); // se trabaja con un spinner trabaja horas y minutos
    LocalTime c = LocalTime.MAX;//para indicarle la hora o minuto maximo
    LocalTime d = LocalTime.MIN;//para indicarle la hora o minuto minimo*/
    
    //horario k = new horario ()
   /* public void Mostrar(){
        hm = LocalTime.of(this.getHora(),this.getMinuto());
        System.out.println("Hora: " + hm.getHour() + ":" + hm.getMinute());
        //calcular horas
        hm.plusHours(3); //se agregan 3 horas
        hm.minusMinutes(15); //resta minutos 
        
    
    }*/
    //select proveedores from tabla fechasql si queres que sea a partir de tal fecha es: 
    //fechasql >= '2020-12-01'
    //and fechasql <='-0-0-8-15'
    //y lo mismo poner beetween si queres manejar entre fechas
}
