package P1;

/**
 *
 * @author Pc_Hp_07
 */
public class Vehiculo {

    public Vehiculo() {
        System.out.println("Bienvenido(s) Usuario(s)");
}
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }
    
      private String marca,modelo,version,año,combustible;
      private int cilindraje,kilometraje,puerta  ;        
    
     public void in(){
              
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(version);
        System.out.println(año);
        System.out.println(cilindraje);
        System.out.println(kilometraje);
        System.out.println(puerta);
        System.out.println(combustible);
        
     }
}
