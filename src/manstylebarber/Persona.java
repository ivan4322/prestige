



package manstylebarber;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


 public class Persona implements Serializable{
   
     
     
   List<Persona> listaPersonas;
   private  String nombre,apellido;
   private int telefono;
   private int id;
   private static int contPersonas;
   int total;
   private static final long serialVersionUid=1L;
   
   public Persona(){
       this.listaPersonas = new ArrayList();           
      }
      
      
   
    public Persona(String nombre, String apellido, int telefono ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono=telefono;
       this.id = ++Persona.contPersonas;
       this.listaPersonas = new ArrayList();
      
    }
    
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
   
   public int getId(){
       return id;
           
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
    
   //abstract public void registrar(Persona persona);
    
   
   
   //metodo para eliminar cliente o barberos este metodo lo heredan tanto la clase cliente como la clase barbero//
   
   
     public void eliminar(int id) {
         boolean eliminado = false;
    for (int i = 0; i < listaPersonas.size(); i++) {
        Persona persona = listaPersonas.get(i);
        if (persona.getId() == id) {
            listaPersonas.remove(i);
             JOptionPane.showMessageDialog(null, "LA ELIMINACION HASIDO EXITOSA! " );  
          i--;
          eliminado = true;
        }
        
      }
    if(eliminado == false){
       JOptionPane.showMessageDialog(null, "NO SE ENCONTRO NINGUN USUARIO, IDENTIFICADO CON ESE ID " );   
    }
       }
     
    
   

     
    //metodo para mostrar clientes o barberos este metodo lo heredan tanto la clase cliente como la clase barbero//
     
   public void mostrarPersonas(){
       boolean existe = false;
   for(Persona a: listaPersonas) { 
       if(a.getId()!=0){
         JOptionPane.showMessageDialog(null, "LISTA DE REGISTROS \n  NOMBRE: " 
                  + a.getNombre() + "\n APELLIDO:  "  +a.getApellido() +" \n TELEFONO:   " +a.getTelefono() +
                  "\n  ID:  " +a.getId()); 
         existe = true;
       }
       
       
         
       total = a.getId(); 
       
   }
   
   if(existe == false){
       JOptionPane.showMessageDialog(null, "NO HAY REGISTROS " );  
   }
     
   }
 }
     
     
     /*
     JOptionPane.showMessageDialog(null, "    NUMERO DE PERSONAS REGISTRADOS   " +total);
     */
  
  
