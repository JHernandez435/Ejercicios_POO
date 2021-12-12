package P1;

import java.util.Scanner;

/**
 *
 * @author Pc_Hp_07
 */
public class Persona {
    
    Scanner in = new Scanner(System.in);
    protected String nombres,apellidos,edad,direccion;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void pedirdatos_1(){
        
        System.out.print("Ingrese sus nombre: ");
        nombres = in.next();         
        System.out.print("Ingrese sus apellidos: "); 
        apellidos = in.next();
        System.out.print("Ingrese la edad: ");
        edad = in.next();        
        System.out.print("Ingrese sus direccion: ");
        direccion = in.next();
        
    }
    
    public void mostrar_1(){
        System.out.println(nombres);
        System.out.println(apellidos); 
        System.out.println(edad);
        System.out.println(direccion);
    }
}
