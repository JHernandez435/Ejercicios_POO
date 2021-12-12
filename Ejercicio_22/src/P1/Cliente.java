package P1;

import java.util.Scanner;

/**
 *
 * @author Pc_Hp_07
 */
public abstract class Cliente {
    
    Scanner in = new Scanner(System.in);

    protected String nombre;
    protected int antiguedad;
    protected double compra, xcentaje, Reply;

    Cliente () {
    }

    public double getCompra() {
        return compra;
    }

    public void setCompra(double compra) {
        this.compra = compra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Cliente(String nombre, int antiguedad, double compra) {
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.compra = compra;
    }

    public void PedirDatos() {

        System.out.println("Ingrese su nombre: ");
        nombre = in.next();
        System.out.println("Ingrese su antiguedad: "
                + "\nElige una opcion:\n1: 10Años\n2: 5Años\n3: 3Años");
        antiguedad = in.nextInt();
        System.out.println("Ingrese el valor de su compra");
        compra = in.nextDouble();

    }

    public abstract  void Operacion() ;
    
    public abstract  void Show ();

    
}
