package P1;

import java.util.Scanner;

/**
 *
 * @author Pc_Hp_07
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese el priemr lado: ");
        int lado1 = in.nextInt();

        System.out.print("Ingrese el segundo lado: ");
        int lado2 = in.nextInt();

        Cuadrado messenger = new Cuadrado(lado1, lado2);
        messenger.MostrarReply();

    
    }
    
}
