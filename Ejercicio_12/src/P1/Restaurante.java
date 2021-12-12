package P1;
import java.util.Scanner;
/**
 *
 * @author Pc_Hp_07
 */
public class Restaurante {
   
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
       
        System.out.println("Ingrese la cantidad de Empleados");
        int n = in.nextInt();

        Empleado[] p1= new Empleado[n];
        
        for (int i = 0; i < n; i++) {
        System.out.println("Empleado: " + (i + 1));
            p1[i] = new Empleado();
   
        Empleado Messenger_1 = new Empleado();
        Messenger_1.pedirdatos_1();
        
        }
        
        Cocinero[] p2= new Cocinero[n];
        for (int i = 0; i < n; i++) {
        System.out.println("Cocinero: " + (i + 1));
            p2[i] = new Cocinero();
        Cocinero Messenger_2 = new Cocinero();
        Messenger_2.pedirdatos_1();
        Messenger_2.pedirdatos_2();
        
        }
        
    }
    
}
