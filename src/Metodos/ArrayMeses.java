package Metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayMeses {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca el numero del mes: ");
		
		int month;
		month = Integer.parseInt(reader.readLine());
		
		
		
		String [] months = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre","Diciembre "};
		
		if(month >= 1 && month <= 12) {
			System.out.println(months[month - 1]);
		}else {
			System.out.println("Numero incorrecto");
		}
		
		
	}
	
}
