package Metodos;

public class RandomLetter {

	public static void main(String[] args) {
		String nombre = "Fernando";
		int posicion = (int)Math.floor(Math.random() * (nombre.length() - 1 ) + 1);
		char letra = nombre.charAt(posicion);
		System.out.println("Letra aleatoria es : " + letra);
	}
	
}
