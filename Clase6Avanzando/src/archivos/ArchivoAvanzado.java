package archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArchivoAvanzado {
	
	public void io() {
		
        byte[] b = new byte[128];
        int bLen = b.length;
        // Example use of InputStream methods
        try (FileInputStream fis = new FileInputStream ("C:\\Zcurso\\bibliografia\\les_10_io_fund.ppt");
             FileOutputStream fos = new FileOutputStream ("C:\\Zcurso\\bibliografia\\les_10_io_fund2.ppt"))
        {
           System.out.println ("Bytes available: " + fis.available());
           int count = 0; int read = 0;
//           while (fis.read(b) != -1) {
//        	   read = fis.available();
//               if (read < bLen) {
//            	   fos.write(b, 0, read);
//               }   
//               else {
//            	   fos.write(b);
//               }
//               count += read;
//            }
           while (read != -1) {
        	   if (read < bLen) {
            	   fos.write(b, 0, read);
               }   
               else {
            	   fos.write(b);
               }
               count += read;
               read=fis.read(b);
            }          
           
            System.out.println ("Wrote: " + count);
        } catch (FileNotFoundException f) {
            System.out.println ("File not found: " + f);
        } catch (IOException e) {
            System.out.println ("IOException: " + e);
        }
    }

	

}
