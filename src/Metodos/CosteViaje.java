package Metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CosteViaje {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca el número de noches: ");
		int numeroNoches = Integer.parseInt(reader.readLine());
		System.out.println("Introduzca el destino: ");
		String destino = reader.readLine();
		
		CosteViaje costeViaje = new CosteViaje();
		int resultado1 = costeViaje.costeHotel(numeroNoches);
		int resultado2 = costeViaje.costeAvion(destino);
		int resultado3 = costeViaje.costeAlquilerCoche(numeroNoches);
		
		int sumaCostes = resultado1 + resultado2 + resultado3;
		System.out.println("Coste total: " + sumaCostes);
	}
	
		int costeHotel(int noches) {
			return noches*140;
		}
		
		int costeAvion(String destino) {
			if(destino.equals("Oviedo")) {
				return 15;
			}else if(destino.equals("Tokyo")) {
				return 700;
			}else if(destino.equals("Madrid")) {
				return 90;
			}else if(destino.equals("Barcelona")) {
				return 90;
			}else {
				return 0;
			}
		}
		
		int costeAlquilerCoche(int preciodias) {
			
			int precio = preciodias*40;
			if(preciodias >= 7) {
				precio = precio - 50;
			}else if(preciodias >= 3) {
				precio = precio - 20;
			}
			
			return precio;
		}

}
