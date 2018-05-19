package Clases;

import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribirFichero {

	public static void escribirContenido(String path,String texto) {

		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter(path);
			pw = new PrintWriter(fichero);

			
				pw.println(texto);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
		
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
