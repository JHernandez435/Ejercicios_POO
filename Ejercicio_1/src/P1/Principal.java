package P1;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Libros");
        int n=sc.nextInt();

        Biblioteca [] p1= new Biblioteca[n];
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Libros"+(i+1));
            p1[i]=new Biblioteca();
             
            System.out.println("ISBN:");
            String isbn=sc.next();
            p1[i].setIsbn(isbn);
            
            System.out.println("Titulo:");
            String titulo=sc.next();
            p1[i].setTitulo(titulo);
            
            System.out.println("Autor:");
            String autor=sc.next();
            p1[i].setAutor(autor);
            
            System.out.println("Digite la disponibilidad(si/no) del libro");
            System.out.println("Disponiblidad:");
            String disponible=sc.next();
            p1[i].setDisponible(disponible);
            
                       
        }   
        for (int i = 0; i < n; i++) {
            System.out.println("Libro Ingresados"+(i+1));
            p1[i].in();
        }
    }
    
}
