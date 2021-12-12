package P1;

/**
 *
 * @author Pc_Hp_07
 */
public class Operador extends Persona{

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
    
    protected String cargo,turno,sueldo;
    
     public void pedirdatos_4(){
        
        
        System.out.print("Ingrese su Cargo: ");
        cargo = in.next();         
        System.out.print("Ingrese su turno: "); 
        turno = in.next();
        System.out.print("Ingrese su sueldo: "); 
        sueldo = in.next();
        
    }
}
