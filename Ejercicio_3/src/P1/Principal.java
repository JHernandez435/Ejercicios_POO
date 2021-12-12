package P1;

import java.util.Scanner;

/**
 *
 * @author Pc_Hp_07
 */
public class Principal {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Empleado(s)");
        int n=sc.nextInt();

        Empleado [] p1= new Empleado[n];
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Empleado "+(i+1));
            p1[i]=new Empleado();
             
            System.out.println("Codigo:");
            String codigo=sc.next();
            p1[i].setCodigo(codigo);
            
            System.out.println("Nombre:");
            String nombre=sc.next();
            p1[i].setNombre(nombre);
            
            System.out.println("Genero:");
            String genero=sc.next();
            p1[i].setGenero(genero);
            
            System.out.println("Digite el Estado del animal:");
            System.out.println("1.Soltero\n2.Casado\n3.Viudu");
            
            System.out.println("Estado Civil:");
            String estadocivil=sc.next();
            p1[i].setEstadocivil(estadocivil);
            
            System.out.println("Telefono:");
            String telefono=sc.next();
            p1[i].setTelefono(telefono);
            
            System.out.println("Direccion:");
            String direccion=sc.next();
            p1[i].setDireccion(direccion);
        }   
         for (int i = 0; i < n; i++) {
            System.out.println("Empleado(s) Ingresados "+(i+1));
            p1[i].in();
        }
    }
    
}
