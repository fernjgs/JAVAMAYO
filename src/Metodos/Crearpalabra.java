package Metodos;

public class Crearpalabra {

	public String crearPalabra(char letra, int numero) {
		String palabraNueva = "";
		for(int i = 0; i < numero; i++) {
			palabraNueva += letra;
		}
		return palabraNueva.toUpperCase();
	}
	
	
	public static void main(String[] args) {
	
		Crearpalabra a = new Crearpalabra();
		String respuesta = a.crearPalabra('z', 8);
		System.out.println(respuesta);
	}
	
}
