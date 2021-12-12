package P1;

import java.util.Scanner;

/**
 *
 * @author Pc_Hp_07
 */
public class Principal {

    public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese el valor de la base: ");
        int base = in.nextInt();

        System.out.print("Ingrese el valor de la altura: ");
        int altura = in.nextInt();

        Rectangulo messenger = new Rectangulo(base, altura);
        messenger.MostrarReply();

    }

}
