package P1;

import java.util.Scanner;

/**
 *
 * @author Pc_Hp_07
 */
public class Rectangulo {

    Scanner in = new Scanner(System.in);

    public static int valor1,valor2,base, altura, reply;

    public Rectangulo(int base, int altura){
        this.valor1 = base;
        this.valor2 = altura;
    }
    public void Operacion() {
        reply = valor1 * valor2;
    }

    public void MostrarReply() {
        Operacion();
        System.out.println("El area es ="+reply);
    }
}
