package P1;
public class Mammal {
    private String perro,lobo,gato,tigre;
    
    public Mammal(String perro, String lobo, String gato, String tigre) {
        this.perro = perro;
        this.lobo = lobo;
    }    

    public Mammal(String gato, String tigre) {
        this.gato = gato;
        this.tigre = tigre;
        System.out.println("MAMIFERO");
    }
}
