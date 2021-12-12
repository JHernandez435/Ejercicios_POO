package P1;

public class Principal {

    public static void main(String[] args) {
        
        Aprendiz ap1=new Aprendiz();
        Aprendiz ap2=new Aprendiz();
        Aprendiz ap3=new Aprendiz();
        ap1.setCodigo("11001");
        ap1.setNombre("Osman Aranguren");
        ap1.setNota(8.5);
        System.out.println("\033[34mCodigo: "+ap1.getCodigo()+"\n\033[32mNombre del Aprendiz: "+ap1.getNombre()
        +"\n\033[31mNOta: "+ap1.getNota());
        
    }
    
}
