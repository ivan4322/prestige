/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manstylebarber;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.tools.FileObject;

/**
 *
 * @author Ivan
 */
public class Archivo {
File archivoc;
    public Archivo() {

    }

    public void registroArchivos(Persona persona, String nombre) throws FileNotFoundException {
        archivoc = new File(nombre);

        try {
            if (archivoc.exists()) {
                FileOutputStream archivo_salida = new FileOutputStream(nombre, true);

                Objetos entrada = new Objetos(archivo_salida);

                entrada.writeObject(persona);
                
                JOptionPane.showMessageDialog(null, "  el archivo esta creado "
                        + "                 ");
                archivo_salida.close();
                entrada.close();
            } else {
                FileOutputStream archivo_salida2 = new FileOutputStream(nombre, true);
                ObjectOutputStream entrada2 = new ObjectOutputStream(archivo_salida2);

     
                JOptionPane.showMessageDialog(null, "  el archivo no esta creado                  ");
                archivo_salida2.close();
                entrada2.close();
            }
         
        } catch (Exception e) {
        }

    }

    public void mostrar(String nombre) {
        Persona persona = new Persona();
        try {
             FileInputStream archivo_entrada = new FileInputStream(nombre);
   ObjectInputStream entrada = new ObjectInputStream (archivo_entrada);
 while(true){
     
     try {
        
         persona= (Persona) entrada.readObject();
         System.out.println("persona" +persona.getNombre());
     } catch (Exception e) {
         System.out.println("error lectura");
         break;
     }
 }
        
       
  
 
        } catch (Exception e) {
        }
       
    }

}
