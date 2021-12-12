package P1;
/**
 *
 * @author Pc_Hp_07
 */
public class TOTTO {

    public static void main(String[] args) {
        
        Cliente grupoA = new Clase_A();
        grupoA.PedirDatos();
        grupoA.Operacion();
        grupoA.Show(); 
        
        Cliente grupoB = new Clase_B();
        grupoB.PedirDatos();
        grupoB.Operacion();
        grupoB.Show();

        Cliente grupoC = new Clase_C();
        grupoC.PedirDatos();
        grupoC.Operacion();
        grupoC.Show();
    }

}
