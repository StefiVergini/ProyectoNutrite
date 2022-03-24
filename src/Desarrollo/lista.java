
package Desarrollo;

import java.util.ArrayList;

public class lista {
    
    static ArrayList <Integer> nro = new ArrayList <>();
    
    public void Cargar(int nromatri){
        nro.add(nromatri);
    }
    
    public int Mostrar(){
        return nro.get(0);
    }
}
