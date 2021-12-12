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

        Circulo[] p1 = new Circulo[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Circulo: " + (i + 1));
            p1[i] = new Circulo();

            System.out.println("Ingrese el radio del Circulo: ");
            int radio = sc.nextInt();
            p1[i].setRadio(radio);   
                    
            Circulo valores = new Circulo(radio);
            valores.Imprimir();
            
            
        }
    }
    
}
