package Metodos;

public class ObtenerNumerorRandom {

	public static void main(String[] args) {
		double randomNumber = Math.floor(Math.random() * (7 - 5 + 1)) + 5;
		System.out.println(randomNumber);
	}
	
}
