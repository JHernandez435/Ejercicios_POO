package P1;

/**
 *
 * @author Pc_Hp_07
 */
public class Funcionario extends Persona {

    public String getCfuncionario() {
        return Cfuncionario;
    }

    public void setCfuncionario(String Cfuncionario) {
        this.Cfuncionario = Cfuncionario;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
    
    protected String Cfuncionario,sueldo;
    
    public void pedirdatos_3(){
        
        
        System.out.print("Ingrese su Cargo de Sueldo: ");
        Cfuncionario = in.next();         
        System.out.print("Ingrese su sueldo: "); 
        sueldo = in.next();
        
    }
}
