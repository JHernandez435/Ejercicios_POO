import javax.swing.JOptionPane;

public class Persona {


    String nombres,apellidos,direccion,telefono,estadocivil;
    
       public void mostrar(){
           
       nombres=JOptionPane.showInputDialog("¿Ingrese el nombre(s)?");
       apellidos=JOptionPane.showInputDialog("¿Ingrese el apellido(s)?");
       telefono=JOptionPane.showInputDialog("¿Ingrese el numero?");
       estadocivil=JOptionPane.showInputDialog("¿Ingrese el Estado civil(s)?");
       
       
       
    }
}
