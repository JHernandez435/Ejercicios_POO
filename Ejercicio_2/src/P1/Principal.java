package P1;

import java.util.Scanner;

/**
 *
 * @author Pc_Hp_07
 */
public class Principal {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Animales");
        int n=sc.nextInt();

        Zoologico [] p1= new Zoologico[n];
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Animal "+(i+1));
            p1[i]=new Zoologico();
             
            System.out.println("Codigo:");
            String codigo=sc.next();
            p1[i].setCodigo(codigo);
            
            System.out.println("Especie");
            String especie=sc.next();
            p1[i].setEspecie(especie);
            
            System.out.println("Nombre:");
            String nombre=sc.next();
            p1[i].setNombre(nombre);
            
            
            System.out.println("Digite el Estado del animal:");
            System.out.println("1.Saludable\n2.Enfermo\n3.Translado");
            
            System.out.println("Estado:");
            String estado=sc.next();
            p1[i].setEstado(estado);
        }   
         for (int i = 0; i < n; i++) {
            System.out.println("Animale(s) Ingresados "+(i+1));
            p1[i].in();
        }
    }
    
}
