package Metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sizes {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce un valor :");
		String valorIntroducido = br.readLine();
		
		int valor = Integer.parseInt(valorIntroducido);
		String resultado = testSize(valor);
		System.out.println(resultado);
	}
	
	
	public static String testSize(int num) {
	 String resultado = "";
	 
	 	if (num < 5) {
	 		resultado = "Tiny";
	 	}else if(num < 10) {
	 		resultado = "Small";
	 	}else if (num < 15) {
	 		resultado = "Medium";
	 	}else if (num < 20) {
	 		resultado = "Large";
	 	}else if (num < 25) {
	 		resultado = "Huge";
	 	}
	 	
	 	return resultado;
	}
	
}
