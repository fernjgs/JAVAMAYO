package Metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TresEnRaya {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		String [] tablero = {"_","_","_","_","_","_","_","_","_"};
		int tirada = 0;
		boolean someoneWon = false;
		
		do {
			showTablero(tablero);
			String ficha = tirada%2==0? "X":"O";
			playPlayer(ficha, tablero);
			
			someoneWon = evaluateWin(tablero);
			if(someoneWon)
				System.out.println("Enhorabuena, player " + ficha);
			tirada++;
		}while (!someoneWon);
	}
	
	static void showTablero(String[] tablero) {
		System.out.println(tablero[0] + " | " + tablero[1] + " | " + tablero[2]);
		System.out.println(tablero[3] + " | " + tablero[4] + " | " + tablero[5]);
		System.out.println(tablero[6] + " | " + tablero[7] + " | " + tablero[8]);
	}
	static void playPlayer(String ficha, String[] tablero) throws NumberFormatException, IOException {
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("A¿Donde quieres mover, jugador " + ficha + "?");
		int posicion = 0;
		posicion = Integer.parseInt(reader.readLine());
		
		tablero[posicion] = ficha;
	}
	
	static boolean evaluateWin(String tablero[]) {
		if(tablero[0].equals(tablero[1]) && tablero[0].equals(tablero[2]) && !tablero[0].equals("_")){
			return true;
		}else if(tablero[3].equals(tablero[4]) && tablero[3].equals(tablero[5]) && !tablero[3].equals("_")) {
			return true;
		}else if(tablero[6].equals(tablero[7]) && tablero[6].equals(tablero[8]) && !tablero[6].equals("_")) {
			return true;
		}else if(tablero[0].equals(tablero[3]) && tablero[0].equals(tablero[6]) && !tablero[0].equals("_")) {
			return true;
		}else if(tablero[1].equals(tablero[4]) && tablero[1].equals(tablero[7]) && !tablero[1].equals("_")) {
			return true;
		}else if(tablero[2].equals(tablero[5]) && tablero[2].equals(tablero[8]) && !tablero[2].equals("_")) {
			return true;
		}else if(tablero[0].equals(tablero[4]) && tablero[0].equals(tablero[8]) && !tablero[0].equals("_")) {
			return true;
		}else if(tablero[2].equals(tablero[4]) && tablero[2].equals(tablero[6]) && !tablero[2].equals("_")) {
		
		}
		return false;
	}

}
 