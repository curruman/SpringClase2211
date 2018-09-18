package archivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoCaracter {
	
	public void ioChar() {
        char[] c = new char[128];
        int cLen = c.length;
        // Example use of InputStream methods
        try (FileReader fr = new FileReader("c:\\Zcurso\\bibliografia\\ejemplo.txt");
             FileWriter fw = new FileWriter("c:\\Zcurso\\bibliografia\\ejemplo2.txt")) {
            int count = 0;
            int read = 0;
         //   System.out.println("Read: " + fr. + " characters.");
            while ((read = fr.read(c)) != -1) {
                if (read < cLen)
                	fw.write(c, 0, read);
                else
                	fw.write(c);
                count += read;
            }
            System.out.println("Wrote: " + count + " characters.");
        } catch (FileNotFoundException f) {
            System.out.println("File " + f.toString() + " not found.");
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
	}

}
