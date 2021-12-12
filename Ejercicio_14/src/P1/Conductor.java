package P1;

import java.util.Scanner;

/**
 *
 * @author Pc_Hp_07
 */
public class Conductor extends Persona {
    
    Scanner in = new Scanner(System.in);
    
    protected String NoBus,ruta;
    
    public String getNoBus() {
        return NoBus;
    }

    public void setNoBus(String NoBus) {
        this.NoBus = NoBus;
    }

    public String getTurno() {
        return ruta;
    }

    public void setTurno(String ruta) {
        this.ruta = ruta;
    }
    
    public void pedirdatos_2(){
        
        System.out.print("Ingrese el No del BUS: ");
        NoBus = in.next();  
        System.out.print("Ingrese su ruta: ");
        ruta = in.next();
    }
    public void mostrar_2(){
        System.out.println(NoBus);
        System.out.println(ruta); 
    }

}
