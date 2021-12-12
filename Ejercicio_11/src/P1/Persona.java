package P1;
import java.util.Scanner;
/**
 *
 * @author Pc_Hp_07
 */
public class Persona {
    
    protected String nombre,genero;
    
    Scanner in = new Scanner(System.in);
    
    //Este método pide los valores al usuario
    public void PedirDatos(){
        System.out.print("Digite su nombre: ");
        nombre = in.next();
        
        System.out.print("Digite su genero: ");
        genero = in.next();
    }
    public void caminar(){
        System.out.println("Estoy caminando ");
    }
    public void correr(){
        System.out.println("Estoy corriendo ");
    }      
    
}
