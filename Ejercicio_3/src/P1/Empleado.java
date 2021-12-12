package P1;

/**
 *
 * @author Pc_Hp_07
 */
public class Empleado {
    
    public Empleado() {
        System.out.println("Bienvenido(s) Usuario(s)");
}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    private String codigo,nombre,genero,estadocivil,telefono,direccion;
    
     public void in(){
           
        System.out.println(codigo);
        System.out.println(nombre);
        System.out.println(genero);
        System.out.println(estadocivil);
        System.out.println(telefono);
        System.out.println(direccion);
    }
}
