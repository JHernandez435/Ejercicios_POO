package P1;

public class Paralelogramo {

    int base, altura, Area;
    private int vUno, vDos;

    public Paralelogramo() {
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
    public Paralelogramo(int base, int altura) {
        this.vUno = base;
        this.vDos = altura;
    }

    // Funcion...
    public void Operacion() {
        Area = (vUno * vDos);
    }

    // Funcion....
    public void Imprimir() {
        Operacion();
        System.out.println("El resultado del Area Paralelogramo es =" + Area);
    }
    
}
