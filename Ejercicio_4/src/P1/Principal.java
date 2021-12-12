package P1;

import java.util.Scanner;

/**
 *
 * @author Pc_Hp_07
 */
public class Principal {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de vehiculo(s)");
        int n=sc.nextInt();

        Vehiculo [] p1= new Vehiculo[n];
        
        
                       
        for (int i = 0; i < n; i++) {
            
            System.out.println("Vehiculo "+(i+1));
            p1[i]=new Vehiculo();
             
            System.out.println("Modelo:");
            String modelo=sc.next();
            p1[i].setModelo(modelo);
            
            System.out.println("Marca:");
            String marca=sc.next();
            p1[i].setMarca(marca);
            
            System.out.println("Version:");
            String version=sc.next();
            p1[i].setVersion(version);
            
            System.out.println("Año:");
            String año=sc.next();
            p1[i].setAño(año);
      
            System.out.println("Cilindraje:");
            int cilindraje=sc.nextInt();
            p1[i].setCilindraje(cilindraje);
                     
            System.out.println("kilometraje:");
            int kilometraje=sc.nextInt();
            p1[i].setKilometraje(kilometraje);
            
            System.out.println("Puertas:");
            int puerta=sc.nextInt();
            p1[i].setPuerta(puerta);
            
            System.out.println("Tipo Combustible:");
            String combustible=sc.next();
            p1[i].setCombustible(combustible);
            
        } 
        
        
         for (int i = 0; i < n; i++) {
            System.out.println("Veiculo(s) Ingresados "+(i+1));
            p1[i].in();
         
         }
    }
    
}
