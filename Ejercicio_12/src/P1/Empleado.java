package P1;
import java.util.Scanner;
/**
 *
 * @author Pc_Hp_07
 */
public class Empleado {    
    
    Scanner in = new Scanner(System.in);
    
    protected String nombre,sueldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
    
    public void pedirdatos_1(){
        
        System.out.print("Ingrese su nombre: ");
        nombre = in.next();
        
        System.out.print("Ingrese su sueldo: ");
        sueldo = in.next();
    }
}
