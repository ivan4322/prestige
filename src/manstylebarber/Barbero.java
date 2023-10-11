/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manstylebarber;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan Dariocodigoc13
 */
public class Barbero extends Persona implements Serializable{

    private int idBarbero;
    private static int contBarbero = 0;
    Persona persona;
    private static final long serialVersionUid=1L;
    
    
    
    
    

    public Barbero() {

    }

    public Barbero(String nombre, String apellido, int telefono) {
        super(nombre, apellido, telefono);
        this.idBarbero = ++Barbero.contBarbero;

    }

    public int getIdBarbero() {
        return idBarbero;
    }

   
     public void registrar(Persona persona) {

        JOptionPane.showMessageDialog(null, "                          "
                
                + " BIENVENIDO \n SU REGISTRO SERA COMO BARBERO DE LA PELUQUERIA");
        this.setNombre(JOptionPane.showInputDialog("Por favor, introduce tu nombre:"));
        this.setApellido(JOptionPane.showInputDialog("Por favor, introduce tu Apellido:"));
        this.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Por favor, introduce tu numero telefonico: \n MENOR O igual a 7 numeros")));
        persona = new Barbero(this.getNombre(), this.getApellido(), this.getTelefono());

        if (persona instanceof Persona) {
            super.listaPersonas.add(persona);
            
            JOptionPane.showMessageDialog(null, "BARBERO REGISTRADO CON EXITO ");

        } else {
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
        int elimina = (Integer.parseInt(JOptionPane.showInputDialog(" SEGURO QUE DESEAS ELIMINAR A ESTE BARBERO?"
                + " \n  DIGITA 1 PARA COMFIRMAR \n DIGITA 2 para cancelar")));

        if (elimina == 1) {
            super.eliminar(id);
           
        } else  {
            JOptionPane.showMessageDialog(null, "   SE HA CANCELADO LA ELIMINACION  ");
        }
          
            
            
 
    }

}
