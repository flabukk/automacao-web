package br.com.viaVarejo.support;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * @author Flavio Pacheco
 *
 */
public class Generator{
      public static String dataHoraParaArquivo(){
            Timestamp ts = new Timestamp(System.currentTimeMillis());
            return new SimpleDateFormat("yyyyMMddhhmmss").format(ts); 
      }
      
     
  
    public static int numeroAleatorio() {
    	  Random random = new Random();

          int numeroAleatorio = random.nextInt(999999);
          return numeroAleatorio;
    	  
      }
      
}