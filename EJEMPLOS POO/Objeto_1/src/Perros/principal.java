package Perros;

public class principal {

    public static void main(String[] args) {
        
        // Crear instancias de clases
        Perritos perro1= new Perritos();
        perro1.nombre="\033[31mCopito";
        perro1.raza="\033[31mShitzu";
        perro1.edad=3;
        perro1.peso=15.5;
        perro1.propietario="\033[31mSofia Aranguren";
        
        System.out.println("-------------------------------------------");       
        //objeto No 2
        Perritos perro2=new Perritos();
        
        perro2.nombre="\033[31mBalu";
        perro2.raza="\033[31mLabrador";
        perro2.edad=5;
        perro2.peso=25.5;
        perro2.propietario="\033[31mOsman Aranguren";
        
        System.out.println("Caracteristicas del perro 1");
        System.out.println("El nombre del perro es:"+perro1.nombre+"\nRaza: "+perro1.raza+"\nEdad: "+perro1.edad
                +"\nPeso: "+perro1.peso+"Kg"+"\nPropitario: "+perro1.propietario);
        perro1.ladrar();
        perro1.popis();
        System.out.println("-------------------------------------------");  
        
        System.out.println("Caracteristicas del perro 2");
        System.out.println("El nombre del perro es:"+perro2.nombre+"\nRaza: "+perro2.raza+"\nEdad: "+perro2.edad
                +"\nPeso: "+perro2.peso+"Kg"+"\nPropitario: "+perro2.propietario);
        perro2.ladrar();
        perro2.popis();


    }
    
}
