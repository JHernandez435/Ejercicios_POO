package P1;

import java.util.Scanner;
/**
 *
 * @author Pc_Hp_07
 */
public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de operaciones");
        int n = sc.nextInt();

        Cometa[] p1 = new Cometa[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Cometa: " + (i + 1));
            p1[i] = new Cometa();

            System.out.println("Ingrese la Diagonal mayor de la cometa: ");
            int dMayor = sc.nextInt();
            p1[i].setdMayor(dMayor);

            System.out.println("Ingrese la Diagonal menor de la cometa: ");
            int dMenor = sc.nextInt();
            p1[i].setdMenor(dMenor);

            Cometa valores = new Cometa(dMayor, dMenor);
            valores.Imprimir();

        }
    }

}
