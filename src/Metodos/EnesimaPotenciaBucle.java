package Metodos;

public class EnesimaPotenciaBucle {
	
	public static void main(String[] args) {
		int base = 4;
		int exponente = 4;
		
		for(int i=1; i<5; i++) {
			exponente = exponente * base;
		}
		System.out.println(exponente);
	}

}
