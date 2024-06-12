package Competicion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prueba {

	public static void main(String[] args) throws IOException {
		
		/*
		System.out.println("Hola mundo!"); 
		
	
		 String nombre = "Ramon";
		
		/*
		System.out.println("Hola " + nombre);
		
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingresa tu nombre :");
		String nombre = reader.readLine();
		
		System.out.println("Bienvenido " + nombre + "!"); 
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingresa primer número :");
		int num1 = Integer.parseInt(reader.readLine());
		
		System.out.println("Ingresa el segundo número :");
		int num2 = Integer.parseInt(reader.readLine()); 
		
		        String texto = "Hola mundo!";
		        System.out.println("El texto tiene " + texto.length() + " letras.");
		    
		        String frase = "Hola mundo!";
		        System.out.println("Primer letra es " + frase.charAt(0));
		        
		        String frase2 = "Hola mundo!";
		        System.out.println("Ultima letra es " + frase2.charAt(9));  
		
		String texto = "WONDERFUL DAY! ";
		System.out.println(texto.substring(3, 7)); 
		
		
		String texto1 = "Ten un maravilloso dia!";
		
		String texto2 = "Pasalo bien! ";
		
		System.out.println(devuelveMasLarga(texto1, texto2));
		
	}

		
		public static String devuelveMasLarga(String cadena1, String cadena2){
			if(cadena1.length() >= cadena2.length()) {
			return cadena1;
		} else {
			return cadena2;
		} 
		
		
		
		Prueba a = new Prueba();
		String respuesta = a.devuelveMasLarga2("Buen día!","Ten un maravilloso dia!","Ten un esplendido día!");
		System.out.println(respuesta);
			
	}		
		
		public String devuelveMasLarga2(String cadena1, String cadena2, String cadena3) {
			if(cadena1.length() == cadena2.length() || cadena1.length() == cadena3.length() || cadena2.length() == cadena3.length()) {
				return "Hay al menos dos cadenas iguales!";
			} 
				
			if(cadena1.length() > cadena2.length() && cadena2.length() > cadena3.length()) {
				return cadena1;
			}else if(cadena2.length() > cadena1.length() && cadena2.length() > cadena3.length()) {
				return cadena2;
			}else {
				return cadena3;
			} 
			
		
		======================================= */
			
		Prueba a = new Prueba();
		String respuesta = a.generarNombre3("Perro","Orangutan","Zarigueya");
		System.out.println(respuesta);
	
	}
		
		public String generarNombre3(String cadena1, String cadena2, String cadena3) {
			if(cadena1.length() < 5 || cadena2.length() < 5 || cadena3.length() < 5) {
				return "error";
			} else {
				return cadena1.substring(cadena1.length() - 3) + cadena2.substring(cadena2.length() - 3) + cadena3.substring(cadena3.length() - 3);
			
			
			
			}
			
		
		
		
		
		
	}

		
		
}

