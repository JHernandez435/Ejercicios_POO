package aves;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
          
        Aves ave1= new Aves();
        ave1.nombre=" ";
        ave1.raza=" ";
        ave1.peso=0;
        ave1.salvaje=true;
        
        System.out.println("¿Ingrese el nombre(s)?");
	ave1.nombre = in.nextLine(); 
        
        System.out.println("¿Ingrese el Raza(s)?");
	ave1.raza = in.nextLine();
        
        System.out.println("¿Ingrese el Peso(s)?");
	ave1.peso = in.nextInt();
        
        System.out.println("¿ES  Salvaje(s)?");
        ave1.salvaje = in.nextBoolean();
               
            
        System.out.println("\nEl nombre del ave es:"+ave1.nombre+"\nSu raza es:"+ave1.raza+"\nSu peso es:"+ave1.peso
                +"\n¿Es salvaje?"+ave1.salvaje);

        ave1.cantar();
        ave1.volar();
        
    }
    
}
