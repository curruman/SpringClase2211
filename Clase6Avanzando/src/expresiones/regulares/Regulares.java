package expresiones.regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regulares {
	
	public void regular() {
		String s = "Fueron los mejores.tiempos";
		String cad = "It was the best of times";
		String s2 = "juanpablo_lopez.alurralde@yahoo.com";
		String cadena = "2018.06.24.id123.alta.zip";
		
		//-------cualquier setencia que empiece por m y siga con s------
		Pattern p1 = Pattern.compile("l.s");
		Pattern p2 = Pattern.compile("s\\.t");
		Pattern p3 = Pattern.compile("w[abc]s");
		Pattern p4 = Pattern.compile("o[\\.|_]l");
		Pattern p5 = Pattern.compile("[^@yahoo.com]");
		
		Pattern pgrupos = Pattern.compile("(\\S)(\\.)(\\d[0-1]\\d)(\\.)(\\d[0-3]\\d)"
				+ "(\\.)(\\S)(\\.)(\\S)(\\.)(zip)");
				
		
		Matcher m1 = p1.matcher(s);
		Matcher m2 = p2.matcher(s);
		Matcher m3 = p3.matcher(cad);
		Matcher m4 = p4.matcher(s2);
		Matcher m5 = p5.matcher(s2);
		
		Matcher mgrupos = pgrupos.matcher(cadena);
		
		if (m1.find()) {
			System.out.println("Encontrado character " + m1.group());
		}
		else {
			System.out.println("No encontrado character");
		}
		
		if (m2.find()) {
			System.out.println("Encontro " + m2.group());
		}
		if (m3.find()) {
			System.out.println("Encontro " + m3.group());
		}
		if (m4.find()) {
			System.out.println("Encontro " + m4.group());
		}
		if (m5.find()) {
			System.out.println("Encontro " + m5.group());
		}

		if (mgrupos.find()) {
			System.out.println("Encontro " + mgrupos.group());
		}
		else {
			System.out.println("No encontro");
		}

	}

}
