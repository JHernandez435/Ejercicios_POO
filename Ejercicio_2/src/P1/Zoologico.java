package P1;

/**
 *
 * @author Pc_Hp_07
 */
public class Zoologico {

     public Zoologico() {
        System.out.println("Bienvenido(s) al Zoologico");
}
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    private String codigo,especie,nombre,estado;

    public void in(){
        
        System.out.println(codigo);
        System.out.println(especie);
        System.out.println(nombre);
        System.out.println(estado);
    }
}
