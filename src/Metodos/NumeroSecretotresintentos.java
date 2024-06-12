package Metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumeroSecretotresintentos {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int intentos = 0;
		final int MAX_INTENTOS = 3;
		
		
		int randomNumber = (int) Math.floor(Math.random() * (999 - 0 + 1)) + 0;
		int numeroUsuario;
		boolean acertado = false;
		System.out.println(randomNumber);
		
		while(intentos < MAX_INTENTOS) {
			System.out.println("Introduce un numero entre el 0 y el 999 :");
			numeroUsuario = Integer.parseInt(reader.readLine());
			
			if(numeroUsuario == randomNumber) {
				System.out.println("Has acertado el número!!");
				acertado = true;
				break;
			} else {
				System.out.println("Número incorrecto, intentalo de nuevo");
				intentos++;
			}
		}
	
		if(!acertado) {
			System.out.println("Has agotado los " + MAX_INTENTOS + "intentos. El numero secreto era " + randomNumber);
		}
	}

}
