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

        Triangulo[] p1 = new Triangulo[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Triangulo: " + (i + 1));
            p1[i] = new Triangulo();

            System.out.println("Ingrese la Base del triangulo: ");
            int base = sc.nextInt();
            p1[i].setBase(base);
            
            System.out.println("Ingrese la Altura del triangulo: ");
            int altura = sc.nextInt();
            p1[i].setBase(altura);
            
            Triangulo valores = new Triangulo(base, altura);
            valores.Imprimir();
            
            
        }
    }

}
