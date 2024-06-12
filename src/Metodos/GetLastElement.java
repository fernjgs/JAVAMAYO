package Metodos;

public abstract class GetLastElement {
	
	public static int getLastElement(int[] array) {
		
		if(array != null && array.length > 0) {
			return array[array.length - 1];
		} else {
			return -1;
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] numeros = {1, 2};
		System.out.println(getLastElement(numeros));
		
	}

}
