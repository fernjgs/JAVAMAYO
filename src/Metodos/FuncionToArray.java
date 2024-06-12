package Metodos;

public class FuncionToArray {

	
	
	public static int[] crearArray(int a, int b) {
		
		int[] array = new int[2];
		
		int [] valores = {a, b}; 
		
		for(int i = 0; i < array.length; i++) {
			array[i] = valores[i];
		}
		return array;
	}
	
	
	public static void main(String[] args) {
		
		int[] miArray = crearArray(5, 9);
		System.out.println("(" + miArray[0] + ","+ " " + miArray[1] + ")");
		
		
	}
	
}
