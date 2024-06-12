package Metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadorastatic {

		
	
	
	public static void main(String[] args) throws IOException {
		 
		Calculadorastatic calculadora = new Calculadorastatic();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		  
		  System.out.print("Introduce el primer número :"); 
		  String input1 = reader.readLine(); int n1 = Integer.parseInt(input1);
		  
		  System.out.print("Introduce el segundo número :"); 
		  String input2 = reader.readLine(); int n2 = Integer.parseInt(input2);
		  
		  System.out.println("Introduce la operación (+, *, -):"); 
		  String op = reader.readLine(); int r = 0; 
		  
		  switch (op) 
		  { case "+":
			  r = n1 + n2; 
		  break; 
		  case "-":
			  r = n1 - n2; 
		  break;
		  case "*":
			  r = n1 * n2; 
		  break; }
		  
		  System.out.println("Resultado: " + r);
	}
	
}
