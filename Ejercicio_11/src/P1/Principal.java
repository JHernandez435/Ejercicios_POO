package P1;
/**
 *
 * @author Pc_Hp_07
 */
public class Principal {

    public static void main(String[] args) {
              
        Aprendiz Messenger_1 = new Aprendiz();
        System.out.println("Aprendiz: ");
        Messenger_1.PedirDatos();
        Messenger_1.caminar();
        
        Coordinador Messenger_2 = new Coordinador();
        System.out.println("Coordinador: ");
        Messenger_2.PedirDatos();
        Messenger_2.correr();
        
        Instructor Messenger_3 = new Instructor();
        System.out.println("Instructor: ");
        Messenger_3.PedirDatos();
        Messenger_3.caminar();
        Messenger_3.correr();
        
    }
}
