package P1;

import java.util.Scanner;

/**
 *
 * @author Pc_Hp_07
 */
public class Libertadores {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Taxistas:");
        int n = in.nextInt();

        Conductor[] p1 = new Conductor[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Taxista: " + (i + 1));
            p1[i] = new Conductor();

            Conductor Messenger_1 = new Conductor();
            Messenger_1.pedirdatos_1();
            Messenger_1.pedirdatos_2();
        }

        for (int i = 0; i < n; i++) {

            System.out.println("-------------");
            p1[i].mostrar_1();
            p1[i].mostrar_2();
        }
    }

}
