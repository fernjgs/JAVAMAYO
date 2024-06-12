package Metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Perimetro {

	public void calcularPerimetro(int altura, int anchura) {
		int perimetro = 2*altura + 2*anchura;
		System.out.println(perimetro);
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Introduce altura :");
		String alturaIntroducida = br.readLine();
		System.out.println("Introduce el ancho :");
		String anchuraIntroducida = br.readLine();
		
		int altura = Integer.parseInt(alturaIntroducida);
		int anchura = Integer.parseInt(anchuraIntroducida);		
		
		Perimetro i;
		i = new Perimetro();
		i.calcularPerimetro(altura, anchura);
	}
	
}

