package Metodos;

public class Calcular {

	public static void calcularCubo(int numero) {
		int cubo = numero * numero * numero;
		System.out.println(" El cubo de " + numero + " es: " + cubo);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int miNumero = 6;
		calcularCubo(miNumero);
	}

}
