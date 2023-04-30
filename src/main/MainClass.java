package main;

import java.util.Scanner;

public class MainClass {
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese una cadena...");
		String cadena = scanner.nextLine();
		if(cadena.length() >= 2) {
			ejercicioPunto7(cadena);
		}else {
			System.err.println("Cadena Invalida. Esta debe contar con al menos 2 Caracteres");
		}
		scanner.close();
	}
	
	public static void ejercicioPunto7(String cadena) {
		System.out.println("Cadena Ingresada: "+ cadena);
		System.out.println("Cadena en Minuscula: "+cadena.toLowerCase());
		System.out.println("Cadena en Mayuscula: "+cadena.toUpperCase());
		System.out.println("Primeros dos caracteres Cadena: "+ cadena.substring(0, 2));
		Integer longitudCadena = cadena.length();
		System.out.println("Ultimos dos caracteres Cadena: "+ cadena.substring(longitudCadena-2,longitudCadena));
		Character ultimoCaracter = cadena.charAt(longitudCadena-1);
		System.out.println("Ocurrencia ultimo Caracter: "+ cadena.chars().filter(value -> value == ultimoCaracter).count());
		System.out.println("Cadena con Asteriscos: "+ "***"+ cadena + "***");
		System.out.println("Cadena Invertida: "+ new StringBuilder(cadena).reverse());	
	}

}
