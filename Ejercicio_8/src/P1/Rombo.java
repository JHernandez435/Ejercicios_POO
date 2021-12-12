package P1;
/**
 *
 * @author Pc_Hp_07
 */
public class Rombo {
    
    int dMenor, dMayor, Area;
    private int vUno, vDos;
    
    public Rombo() {
        System.out.println("Bienvenido a la operacion");
    }

    public int getdMenor() {
        return dMenor;
    }

    public void setdMenor(int dMenor) {
        this.dMenor = dMenor;
    }

    public int getdMayor() {
        return dMayor;
    }

    public void setdMayor(int dMayor) {
        this.dMayor = dMayor;
    }


    // Costructor...
    public Rombo(int dMenor, int dMayor) {
        this.vUno = dMenor;
        this.vDos = dMayor;
    }

    // Funcion...
    public void Operacion() {
        Area = (vUno * vDos) / 2;
    }

    // Funcion....
    public void Imprimir() {
        Operacion();
        System.out.println("El resultado del Area Rombo es =" + Area);
    }
}
