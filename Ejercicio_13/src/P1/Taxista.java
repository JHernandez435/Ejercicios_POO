package P1;

import java.util.Scanner;

/**
 *
 * @author Pc_Hp_07
 */
public class Taxista extends Persona {

    Scanner in = new Scanner(System.in);
    
    protected String NoTaxis,turno;
    
    public String getNoTaxis() {
        return NoTaxis;
    }

    public void setNoTaxis(String NoTaxis) {
        this.NoTaxis = NoTaxis;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public void pedirdatos_2(){
        
        System.out.print("Ingrese el No del taxi:");
        NoTaxis = in.next();  
        System.out.print("Ingrese su turno: ");
        turno = in.next();
    }

    
     
}
