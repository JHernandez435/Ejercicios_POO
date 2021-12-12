package P1;

/**
 *
 * @author Pc_Hp_07
 */
public class Persona {

    protected String nombre, telefono, direccion, expediccion;
    int cedula;

    public Persona(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    Persona() {
    }

    public void Mostrar_1(String nombre, String telefono, String direccion) {
        System.out.println("Nombre:");
        System.out.println("Telefono:");
        System.out.println("Direccion:");
    }

    public void Mostrar_2(String expediccion) {
        this.expediccion = expediccion;
        System.out.println("La ciudad de expediccion: "+expediccion);;
    }

    public void Mostrar_3(int cedula) {
        this.cedula = cedula;
        System.out.println("La cedula es:"+cedula);
    }

    
}
