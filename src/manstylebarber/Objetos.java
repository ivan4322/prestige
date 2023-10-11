
package manstylebarber;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import static java.lang.System.out;



public class Objetos extends ObjectOutputStream{
  
   public Objetos () throws IOException{
       super();
   }
    
  public Objetos(OutputStream put)   throws IOException{
      super(put);
      
  }
}
