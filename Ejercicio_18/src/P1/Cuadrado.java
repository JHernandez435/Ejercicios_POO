package P1;

import java.util.Scanner;

/**
 *
 * @author Pc_Hp_07
 */
public class Cuadrado {
    
    Scanner in = new Scanner(System.in);

    public static int valor1,valor2,lado1, lado2, reply;

    public Cuadrado(int lado1, int lado2){
        this.valor1 = lado1;
        this.valor2 = lado2;
    }
    public void Operacion() {
        reply = lado1 * lado2;
    }

    public void MostrarReply() {
        Operacion();
        System.out.println("El area es ="+reply);
    }
}
