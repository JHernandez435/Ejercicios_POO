package P1;

public class Persona {
    
    private String nombre;
    private String direccion;
    private String genero;
    private int edad;
              
    public void setNombre(String nom){
        nombre=nom;
    } 
    public void setDireccion(String dim){
        direccion=dim;
    } 
    public void setGenero(String gen){
        genero=gen;
    } 
    public void setEdad(int eda){
        edad=eda;
    } 
    
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getGenero(){
        return genero;
    }
    public int getEdad(){
        return edad;
    }
}
