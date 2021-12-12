package P1;
/**
 *
 * @author Pc_Hp_07
 */
public class Clase_A extends Cliente {
    
    public Clase_A(String nombre, String antiguedad, double compra) {
    }

    Clase_A() {
    }
    
    @Override
    public void Operacion() {

        xcentaje = compra * 0.10;
        Reply = compra - xcentaje;
        
        
        }
    @Override
    public void Show() {
        Operacion();
        switch (antiguedad) {
            case 1:
                    if (compra >= 200.000) {
                        System.out.println("Su compra es =" + Reply);
                    }else {
                    System.out.println("Su compra es=" + compra);
                }

                break;
                default:
        }

    }
    

}
