package Metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testgreaterthan {
	
	public class booleans {

		public String testGreaterThan(int val) {
			  if (val > 100) {  // Cambia esta línea
			    return "Por encima de 100";
			  }

			  if (val > 10) {  // Cambia esta línea
			    return "Por encima de 10";
			  }

			  return "10 o menos";
			}
		
		

		public String orderMyLogic(int val) {
			  if (val < 5) {
			    return "Menos que 5";
			  } else if (val < 10) {
			    return "Menos que 10";
			  } else {
			    return "Mayor o igual a 10";
			  }
			}

		
		
		
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
}
