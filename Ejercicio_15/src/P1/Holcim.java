package P1;

import java.util.Scanner;

/**
 *
 * @author Pc_Hp_07
 */
public class Holcim {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
            System.out.println("Director:");
            Directivo Messenger_1 = new Directivo();
            Messenger_1.pedirdatos_1();
            Messenger_1.pedirdatos_2();
            
            System.out.println("Funcionario:");
            Funcionario Messenger_2 = new Funcionario();
            Messenger_2.pedirdatos_1();
            Messenger_2.pedirdatos_3();
            
            System.out.println("Operador:");
            Operador Messenger_3 = new Operador();
            Messenger_3.pedirdatos_1();
            Messenger_3.pedirdatos_4();
        
        
    }
    
}
