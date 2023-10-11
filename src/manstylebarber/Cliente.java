
 
package manstylebarber;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class Cliente extends Persona implements Serializable{
    
        int idCliente;
        static int contCliente;
         private static final long serialVersionUid=1L;
        
        
    public Cliente() {
       
    }

    public Cliente(String nombre, String apellido, int telefono) {
        super(nombre, apellido, telefono);
        this.idCliente=++Cliente.contCliente;
    }
    
    public int getIdCliente(){
        return idCliente;
    }
   
   
    public void registrar(Persona persona) {
        JOptionPane.showMessageDialog(null, "                          "
       + " BIENVENIDO \n SU REGISTRO SERA COMO CLIENTEO DE LA PELUQUERIA");
       this.setNombre(JOptionPane.showInputDialog("Por favor, introduce tu nombre:"));
       this.setApellido(JOptionPane.showInputDialog("Por favor, introduce tu apellido:"));
       this.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Por favor, introduce "
        + "tu numero telefonico: \n MENOR O igual a 7 numeros")));
        persona = new Cliente (this.getNombre(),this.getApellido(),this.getTelefono());
        if ( persona instanceof Persona ){
             super.listaPersonas.add(persona);
             
         JOptionPane.showMessageDialog(null ,"CLIENTE REGISTRADO CON EXITO "); 
    
      }  else{
         JOptionPane.showMessageDialog(null, "                          "
       + " usuario no valido ");
    }  
 } 
 
    
    
     @Override
    public void mostrarPersonas() {
        
        
        super.mostrarPersonas();
          
          
    }

    @Override
    public void eliminar(int id) {
        int elimina = (Integer.parseInt(JOptionPane.showInputDialog(" SEGURO QUE DESEAS ELIMINAR A ESTE CLIENTE?"
               + " \n  DIGITA 1 PARA COMFIRMAR \n DIGITA 2 PARA CANCELAR"  )));
      
        if(elimina == 1 ){
           super.eliminar(id); 
           
        }else  {
            JOptionPane.showMessageDialog(null, "   SE HA CANCELADO LA ELIMINACION  ");
        }
       
    }  
}
