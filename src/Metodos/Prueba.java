package Metodos;

public class Prueba {

	public static void main(String[] args) {
	
		Prueba a = new Prueba();
		boolean respuesta = a.tieneLetra("perro", 'O');
		System.out.println(respuesta);
	}
	
	public boolean tieneLetra(String palabra, char letra) {
		
		return palabra.toLowerCase().indexOf(Character.toLowerCase(letra)) >= 0;
	}
	
}
	
