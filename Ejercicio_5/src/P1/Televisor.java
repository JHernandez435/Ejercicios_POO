package P1;

/**
 *
 * @author Pc_Hp_07
 */
public class Televisor {

    public Televisor(){ 
        System.out.println("Bienvenido(s) Usuario(s)");
}
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getSmarttv() {
        return smarttv;
    }

    public void setSmarttv(String smarttv) {
        this.smarttv = smarttv;
    }

    public String getHdmi() {
        return hdmi;
    }

    public void setHdmi(String hdmi) {
        this.hdmi = hdmi;
    }
    
    private String codigo,marca,modelo,resolucion,
            caracteristicas,smarttv,hdmi;
    
    public void in(){
              
        System.out.println(codigo);
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(resolucion);
        System.out.println(caracteristicas);
        System.out.println(smarttv);
        System.out.println(hdmi);
        
     }
}
