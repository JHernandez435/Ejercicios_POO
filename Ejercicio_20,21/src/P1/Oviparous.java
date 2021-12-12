package P1;
public class Oviparous {
    private String aguila,paloma,trucha,salmon;

    public Oviparous(String aguila, String paloma, String trucha, String salmon) {
        this.aguila = aguila;
        this.paloma = paloma;
    }

    public Oviparous(String trucha, String salmon) {
        this.trucha = trucha;
        this.salmon = salmon;
        System.out.println("OVIPARO");
    }
}
