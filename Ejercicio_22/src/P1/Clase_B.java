package P1;

/**
 *
 * @author Pc_Hp_07
 */
public class Clase_B extends Cliente {

    public Clase_B(String nombre, String antiguedad, double compra) {
    }

    Clase_B() {
    }
    
    @Override
    public void Operacion() {

        xcentaje = compra * 0.05;
        Reply = compra - xcentaje;

    }
    @Override
    public void Show() {
        Operacion();
        switch (antiguedad) {
            case 2:
                    if (compra >= 100.000) {
                        System.out.println("Su compra es =" + Reply);
                    }else {
                    System.out.println("Su compra es=" + compra);
                }

                break;
        }
    }
}
