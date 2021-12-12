package PI;
import java.util.Scanner;
public class Principal {
    
   
    public static void main(String[] args) {
             
        Scanner in = new Scanner(System.in);

        Empleado ap1=new Empleado();
        
        System.out.println("Ingresar su Codigo:");
        String codigo= in.next();
        
        System.out.println("Ingresar su Nombre:");
        String nombre= in.next();
        
        if (true) {
            
        System.out.println("Ingresar su sueldo:");
        double sueldo= in.nextDouble();
        
        }else
        
 
        System.out.println("\033[34mCodigo: "+ap1.getCodigo()+"\n\033[32mNombre del Aprendiz: "+ap1.getNombre()
        +"\n\033[31mNOta: "+ap1.getSueldo());
        
    }
    
}
