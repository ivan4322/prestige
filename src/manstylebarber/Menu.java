/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manstylebarber;

import java.io.FileNotFoundException;
import javax.swing.JOptionPane;


public class Menu {
  
    
    public void principal() {
         int opc;
      Barbero barbero = new Barbero();
      
      Cliente cliente1 = new Cliente ();
      
     Archivo archivo = new Archivo();
      
      do{
          
         opc = Integer.parseInt(  JOptionPane.showInputDialog(null, "BIENVENIDO A LA PELUQUERIA \n \n  MANSTYLEBARBER\n"
              + " DIGITA  1  para registrarse como barbero \n DIGITA  2  para registrarse como cliente \n \n DIGITA  3  para ver la lista de barberos \n"
              + "  DIGITA  4  para ver la lista de clientes \n\n DIGITA  5  para eliminar un cliente\n DIGITA  6  para eliminar un barbero \n\n DIGITA  7  para salir ")); 
        
        switch (opc) {
             
            case 1:
               Barbero barbero1 = new Barbero ();
                try {
                    JOptionPane.showMessageDialog(null, "                          "
                
                + " BIENVENIDO \n SU REGISTRO SERA COMO BARBERO DE LA PELUQUERIA");
        barbero.setNombre(JOptionPane.showInputDialog("Por favor, introduce tu nombre:"));
       barbero.setApellido(JOptionPane.showInputDialog("Por favor, introduce tu Apellido:"));
        barbero.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Por favor, introduce tu numero telefonico: \n MENOR O igual a 7 numeros")));
                
                archivo.registroArchivos(barbero, "barberos.txt");
                } catch (Exception e) {
                }
                
                break;
              case 2:  
                
                cliente1.registrar(cliente1);
                
                break;
              case 3:
                  
                 archivo.mostrar("barberos.txt");
                 
                  //barbero.mostrarPersonas();
                break;
                
              case 4:
                  
                   cliente1.mostrarPersonas();
                   break;
                   
              case 5:
                 
                 int elimina = Integer.parseInt(  JOptionPane.showInputDialog(null, "digite el numero de id del cliente a liminar"));
                   cliente1.eliminar(elimina);
                   break;
              case 6:
                  int eliminar = Integer.parseInt(  JOptionPane.showInputDialog(null, "digite el numero de id del cliente a liminar"));
                   barbero.eliminar(eliminar);
                  break;
              case 7:
                   JOptionPane.showMessageDialog(null, "  programa cerrado con exito  ");
       break;
            default:
               JOptionPane.showMessageDialog(null, "  opcion no valida  "); 
               
        }
        
      }while(opc >= 1 && opc <=6);          
                  
      }

    }

