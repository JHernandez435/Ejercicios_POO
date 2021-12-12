package P1;

import java.util.Scanner;

/**
 *
 * @author Pc_Hp_07
 */
public class Principal {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de televisor(es)");
        int n=sc.nextInt();

        Televisor [] p1= new Televisor[n];
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Televisor "+(i+1));
            p1[i]=new Televisor();
            
            System.out.println("Codigo:");
            String codigo=sc.next();
            p1[i].setCodigo(codigo);
            
            System.out.println("Marca:");
            String marca=sc.next();
            p1[i].setMarca(marca);
             
            System.out.println("Modelo:");
            String modelo=sc.next();
            p1[i].setModelo(modelo);
            
            System.out.println("Resolucion:");
            String resolucion=sc.next();
            p1[i].setResolucion(resolucion);
            
            System.out.println("Caracteristicas:");
            String caracteristicas=sc.next();
            p1[i].setCaracteristicas(caracteristicas);
      
            System.out.println("El televisor es Smart tv:");
            System.out.println("1.Si\n2.No");
            System.out.println("Smarttv:");
            String smarttv=sc.next();
            p1[i].setSmarttv(smarttv);
            
        }   
         for (int i = 0; i < n; i++) {
            System.out.println("Televisor(s) Ingresados "+(i+1));
            p1[i].in();
            
         }
    }
    
}
