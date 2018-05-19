package Clases;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.util.Scanner;



public class LeerFichero {

	static Scanner sc = new Scanner(System.in);
	static String traduccion = null;
	public static String newsentence = null;
	static String bandera = null;
	public static String sentence = null;
	

	public static void muestraContenido(String path) {

		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {

			archivo = new File(path);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String linea;
			while ((linea = br.readLine()) != null)
				sentence = linea;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
