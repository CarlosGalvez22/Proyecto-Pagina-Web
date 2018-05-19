
package com.traductor.umg.TranslateCompi;

import java.io.IOException;
import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import com.darkprograms.speech.translator.GoogleTranslate;
import com.traductor.umg.TranslateCompi.TranslateParser.BodyContext;

import Clases.EscribirFichero;
import Clases.LeerFichero;

public class Main {

	private static final String EXTENSION = "pmo";
	static Scanner sc = new Scanner(System.in);
	static String traduccion = null;
	public static String newsentence = null;
	static String bandera = null;
	public static String sentence = null;

	public static void main(String[] args) throws IOException {

		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpretando archivo: " + program);

		System.out.println("¿Que desea interpretar?");

		newsentence = sc.nextLine();
		EscribirFichero.escribirContenido(program, newsentence);

		TranslateLexer lexer = new TranslateLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		TranslateParser parser = new TranslateParser(tokens);

		BodyContext tree = parser.body();

		TranslateCustomVisitor visitor = new TranslateCustomVisitor();
		visitor.visit(tree);

		System.out.println("Iniciando interpretacion...");
		LeerFichero.muestraContenido(program);
		traduccion = LeerFichero.sentence;

		System.out.println("Texto a traducir: " + traduccion);

		System.out.println("Traduciendo...");

		// English to Spanish
		System.out.println(GoogleTranslate.translate("es", traduccion));
		System.out.println("Traduccion completa... :)");

	}
}
