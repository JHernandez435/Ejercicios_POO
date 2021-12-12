package P1;

import java.util.Scanner;

/**
 *
 * @author Pc_Hp_07
 */
public class Cocinero extends Empleado {

    Scanner in = new Scanner(System.in);
    
    protected String tipococina, especialidad, ciudad;

    public String getTipococina() {
        return tipococina;
    }

    public void setTipococina(String tipococina) {
        this.tipococina = tipococina;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCocina() {
        return ciudad;
    }

    public void setCocina(String cocina) {
        this.ciudad = cocina;
    }

    public void pedirdatos_2() {

        System.out.print("Ingrese el tipo de cocina: ");
        tipococina = in.next();

        System.out.print("Ingrese su especialidad: ");
        especialidad = in.next();

        System.out.print("Ingrese su ciudad: ");
        ciudad = in.next();
    }

}
