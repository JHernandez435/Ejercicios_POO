package P1;
/**
 *
 * @author Pc_Hp_07
 */
public class Circulo {

    int radio, Area;
    private int vUno;

    public Circulo() {
        System.out.println("Bienvenido a la operacion");
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Circulo(int radio) {
        this.vUno = radio;
    }

    public void Operacion() {
        Area = (int) (Math.PI *Math.pow(vUno, 2));
    }

    public void Imprimir() {
        Operacion();
        System.out.println("El resultado del Area Circulo es =" + Area);

    }
}
