package P1;

/**
 *
 * @author Pc_Hp_07
 */
public class Triangulo {

    int base, altura, Area;
    private int vUno, vDos;

    public Triangulo() {
        System.out.println("Bienvenido a la operacion");
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // Costructor...
    public Triangulo(int base, int altura) {
        this.vUno = base;
        this.vDos = altura;
    }

    // Funcion...
    public void Operacion() {
        Area = (vUno * vDos) / 2;
    }

    // Funcion....
    public void Imprimir() {
        Operacion();
        System.out.println("El resultado del Area Triangulo es =" + Area);
    }
}
