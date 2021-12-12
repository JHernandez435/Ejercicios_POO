
import javax.swing.JOptionPane;

public class Principal {

    private static String apellidos;
    private static Object estadocivil;
    private static String nombres;
    private static String telefono;

   
    public static void main(String[] args) {
        
        Persona person1= new Persona();
        JOptionPane.showMessageDialog(null,"Persona 1");        
        person1.mostrar();
        
        Persona person2= new Persona();
        JOptionPane.showMessageDialog(null,"Persona 2");
        person2.mostrar();
        
        Persona person3= new Persona();
        JOptionPane.showMessageDialog(null,"Persona 3");
        person3.mostrar();
        
        for (int i = 0; i < 3; i++) {           
            JOptionPane.showMessageDialog(null,"Nombre y Apellidos: "+nombres+" "+apellidos+"\nnumero: "+telefono+"\nestado civil: "+estadocivil);
        }
    }
    
}
