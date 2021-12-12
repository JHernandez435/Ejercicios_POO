package P1;

import java.util.Scanner;

/**
 *
 * @author Pc_Hp_07
 */
public class Directivo extends Persona {
    
    Scanner in = new Scanner(System.in);
    
    protected String cargo,Htrabajo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHtrabajo() {
        return Htrabajo;
    }

    public void setHtrabajo(String Htrabajo) {
        this.Htrabajo = Htrabajo;
    }
    
    public void pedirdatos_2(){
        
        System.out.print("Ingrese su cargo: ");
        cargo = in.next();  
        System.out.print("Ingrese su Horario de trabajo: ");
        Htrabajo = in.next();
    }
    
}
