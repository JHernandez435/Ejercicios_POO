package P1;

import java.util.Scanner;

/**
 *
 * @author Pc_Hp_07
 */
public class Taxi {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
       
        System.out.println("Ingrese la cantidad de Taxistas");
        int n = in.nextInt();

        Taxista[] p1= new Taxista[n];
        
        for (int i = 0; i < n; i++) {
        System.out.println("Taxista: " + (i + 1));
            p1[i] = new Taxista();
   
        Taxista Messenger_1 = new Taxista();
        Messenger_1.pedirdatos_1();
        Messenger_1.pedirdatos_2();
        
        }
        
    
    }
    
}
