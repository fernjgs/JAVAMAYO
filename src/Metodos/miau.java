package Metodos;

public class miau {

	public static void verificarValor(boolean valor) {
		String mensaje = valor ? "Si, eso es cierto" : "No, eso es falso";
		System.out.println(mensaje);
	}
	
	public static void main (String [] args) {
		verificarValor(false);
		}
	
}
