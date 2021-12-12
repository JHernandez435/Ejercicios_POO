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

        Paralelogramo[] p1 = new Paralelogramo[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Paralelogramo: " + (i + 1));
            p1[i] = new Paralelogramo();

            System.out.println("Ingrese la Base del Paralelogramo: ");
            int base = sc.nextInt();
            p1[i].setBase(base);
            
            System.out.println("Ingrese la Altura del Paralelogramo: ");
            int altura = sc.nextInt();
            p1[i].setBase(altura);
            
            Paralelogramo valores = new Paralelogramo(base, altura);
            valores.Imprimir();
        }
    }
    
}
