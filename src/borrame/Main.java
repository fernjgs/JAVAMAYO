package borrame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * int numero = 9;
		 * 
		 * String texto = "Hola";
		 * 
		 * float p; p = 0.3f;
		 * 
		 * 
		 * int a; a = 7; int b; // Sólo hay que modificar esta línea b = 7;
		 * 
		 * 
		 * String tituloDeLaPelicula; String camelCaseBienPuesto; int edadDelMonstruo;
		 * 
		 * int i = 7; i = 5; i = 3; //System.out.println(i); // ¿Cuánto valdrá i?
		 * 
		 * //System.out.println(texto + numero + p + b);
		 * 
		 * int j = 2; double d = 0.5d; char c = 'f';
		 * 
		 * System.out.println(j +" "+ d +" "+ c);
		 * 
		 * 
		 * int a = 5; int b = 7;
		 * 
		 * int c = a;// aquí hay que poner código a = b; b = c; System.out.println(a);
		 * //Debería mostrar 7 System.out.println(b); //Debería mostrar 5
		 * 
		 * 
		 * String texto = "Este es el principio" + " " + " Este es el final";
		 * System.out.println(texto);
		 * 
		 * 
		 * 
		 * int euros = 7; int dolares = 7 * 2;// Hay que modificar esta línea
		 * System.out.println(dolares);
		 * 
		 * 
		 * float precio = 100f; float precioConIva = precio * 1.21f; // Hay que
		 * modificar esta línea System.out.println("Precio con IVA" + precioConIva +
		 * "euros");
		 * 
		 * int ancho; int alto;
		 * 
		 * ancho = 4; alto = 7;
		 * 
		 * System.out.println(ancho * alto);
		 * 
		 * 
		 * float centigrados= 20f; float fahrenheit= centigrados * 9/5 + 32; // Hay que
		 * modificar esta línea System.out.println(fahrenheit); // Debería mostrar 68
		 * 
		 * String nombre = "Juan"; String material = "madera"; String dimensiones =
		 * "diminutas"; String comentario =
		 * "Que sea bonita, pero de una belleza estraña, indómita";
		 * 
		 * System.out.println(nombre + "ha pedido una caja de" + material +
		 * "con unas dimensiones" + dimensiones + comentario );
		 * 
		 * int myVar = 87; myVar = ++myVar;
		 * 
		 * System.out.println(myVar);
		 * 
		 * 
		 * int mor = 11; mor--;
		 * 
		 * System.out.println(mor);
		 * 
		 * 
		 * BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		 * System.out.println("Introduzca un número, por favor: "); String txt =
		 * r.readLine();
		 * 
		 * 
		 * int currencyEuros = Integer.parseInt(txt); int dolares = currencyEuros * 2;//
		 * Hay que modificar esta línea
		 * 
		 * System.out.println(dolares);
		 * 
		 * BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		 * System.out.println("Introduzca un número, por favor: "); String txt =
		 * r.readLine();
		 * 
		 * 
		 * float porcentaje = Float.parseFloat(txt); float precioConIva = porcentaje *
		 * 1.21f;
		 * 
		 * System.out.println("Precio con IVA" + precioConIva + "euros");
		 * 
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * System.out.print("Introduce un número entero: ");
		 * 
		 * int numero = Integer.parseInt(br.readLine());
		 * 
		 * System.out.println("El doble es: " + (numero * 2));
		 * System.out.println("El triple es: " + (numero * 3));
		 * 
		 * 
		 * BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("Introduce el ancho del rectángulo:"); double ancho =
		 * Double.parseDouble(reader.readLine());
		 * 
		 * System.out.println("Introduce el alto del rectángulo:"); double alto =
		 * Double.parseDouble(reader.readLine());
		 * 
		 * double perimetro = 2 * (ancho + alto); double area = ancho * alto;
		 * 
		 * System.out.println("El perímetro del rectángulo es: " + perimetro);
		 * System.out.println("El área del rectángulo es: " + area);
		 * 
		 * 
		 * 
		 * 
		 * BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 * System.out.print("Introduce la nota del examen: "); double nota =
		 * Double.parseDouble(reader.readLine());
		 * 
		 * if (nota > 5) { System.out.println("Aprobado"); } else if (nota == 5) {
		 * System.out.println("Aprobado por nada!"); } else {
		 * System.out.println("Suspenso"); }
		 * 
		 * 
		 * 
		 * BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.print("Introduce el primer número :"); String input1 =
		 * reader.readLine(); int n1 = Integer.parseInt(input1);
		 * 
		 * System.out.println("Introduce el segundo número :"); String input2 =
		 * reader.readLine(); int numero2 = Integer.parseInt(input2);
		 * 
		 * int suma = numero1 + numero2;
		 * 
		 * System.out.println(" La suma de " + numero1 + " y " + numero2 + " es " + suma
		 * + ".");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * =============================================================================
		 * ================
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.print("Introduce el primer número :"); String input1 =
		 * reader.readLine(); int n1 = Integer.parseInt(input1);
		 * 
		 * System.out.print("Introduce el segundo número :"); String input2 =
		 * reader.readLine(); int n2 = Integer.parseInt(input2);
		 * 
		 * System.out.println("Introduce la operación (+, *, -):"); String op =
		 * reader.readLine(); int r = 0;
		 * 
		 * switch (op) { case "+": r = n1 + n2; break; case "-": r = n1 - n2; break;
		 * case "*": r = n1 * n2; break; }
		 * 
		 * System.out.println("Resultado: " + r);
		 * 
		 * 
		 * 
		 * for(int i=0; i<100; i=i+2) { System.out.println(i); }
		 * 
		 * 
		 * 
		 * for(int i=0; i<100;i++) { if(i%2==0) { System.out.println(i); } }
		 * 
		 * 
		 * 
		 * 
		 * for(int i=1; i<21;i++) { if(i%3==0 && i%5==0) {
		 * System.out.println("FizzBuzz"); }else if(i%3==0) {
		 * System.out.println("Fizz"); }else if(i%5==0) { System.out.println("Buzz");
		 * }else { System.out.println(i); } }
		 * 
		 * 
		 * int numero = 7;
		 * 
		 * for(int i = 1; i <= 10; i++) { int resultado = numero * i;
		 * System.out.println(numero + " X " + i + " = " + resultado); }
		 * 
		 

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean correcto = false;

		while (correcto == false) {
			System.out.println("Introduce tu nombre :");
			String nombre = reader.readLine();

			if (!nombre.equals("")) {
				System.out.println("Los datos son correctos?:");
				String answers = reader.readLine();
				if (answers.equals("si")) {
					System.out.println("Enhorabuena, puedes continuar!");
					correcto = true;
				} else {
					System.out.println("error");
				}

			}else {
				System.out.println("Error");
			} 

		}  
	
	
	============================================ */
	
	
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int counter = 0;
		boolean palomita = false;
		while(!palomita) {
			System.out.println("Introduce un número :");
			String txt = reader.readLine();
			int n = Integer.parseInt(txt);
			if(n==-1) {
				palomita=true;
			}else {
				counter++;
			}
		}
	
	System.out.println(" Has introducido " + counter);
	
	
		
		
		
		
		
		
		
		
		
	}

}
