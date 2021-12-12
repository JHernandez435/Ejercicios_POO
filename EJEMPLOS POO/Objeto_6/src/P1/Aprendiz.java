package P1;

public class Aprendiz {
    
    private String codigo;
    private String nombre;
    private Double nota;
    
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    public String getCodigo(){
        return codigo;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setNota(Double nota){
        this.nota=nota;
    }
    public Double getNota(){
        return nota;
    }
}
