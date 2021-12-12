package P1;

/**
 *
 * @author Pc_Hp_07
 */
public class Biblioteca {

    public Biblioteca() {
        System.out.println("Bienvenidos a la Biblioteca");
}
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }
    
    private String isbn,titulo,autor,disponible;
    
    public void in(){
        System.out.println(isbn);
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(disponible);
    }
    
}
