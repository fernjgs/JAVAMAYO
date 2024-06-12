package Metodos;

public class GetFirstElement {
	
	
	public static int getFirstElement(int[] array) {
		
		int firstElement = -1;
		for(int i = 0; i < array.length && firstElement == -1; i++){
			firstElement = array[i];
		}
		
		return firstElement;
	}
	
	
	public static void main(String[] args) {
		
		int[] numeros = {1, 2};
		System.out.println(getFirstElement(numeros));
		
	}

}
