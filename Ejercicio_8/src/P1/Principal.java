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

        Rombo[] p1 = new Rombo[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Rombo: " + (i + 1));
            p1[i] = new Rombo();

            System.out.println("Ingrese la Diagonal mayor del rombo: ");
            int dMayor = sc.nextInt();
            p1[i].setdMayor(dMayor);
            
            System.out.println("Ingrese la Diagonal menor del rombo: ");
            int dMenor = sc.nextInt();
            p1[i].setdMenor(dMenor);
            
            Rombo valores = new Rombo(dMayor, dMenor);
            valores.Imprimir();
            
        }
    }
    
}
