package P1;

public class Principal {

    public static void main(String[] args) {
        
        Persona p1=new Persona();
        
        p1.setNombre("pepe");
        p1.setDireccion("Carrera 10 #15-10");
        p1.setGenero("Masculino");
        p1.setEdad(15);
        
        System.out.println("Nombre:"+p1.getNombre()+"\nDireccion"+p1.getDireccion()
                +"\nGenero:"+p1.getGenero()+"\nEdad:"+p1.getEdad());
        System.out.println("-----------------------------");
        Persona p2=new Persona();
        
        p2.setNombre("Sofia");
        p2.setDireccion("Carrera 11 #10");
        p2.setGenero("femenino");
        p2.setEdad(15);
        
        System.out.println("Nombre:"+p2.getNombre()+"\nDireccion"+p2.getDireccion()
                +"\nGenero:"+p2.getGenero()+"\nEdad:"+p2.getEdad());
        System.out.println("-----------------------------");
        Persona p3=new Persona();
        
        p3.setNombre("Felipe");
        p3.setDireccion("Carrera 15 #15");
        p3.setGenero("Genero indefinido");
        p3.setEdad(25);
        
        System.out.println("Nombre:"+p3.getNombre()+"\nDireccion"+p3.getDireccion()
                +"\nGenero:"+p3.getGenero()+"\nEdad:"+p3.getEdad());
    }
    
}
