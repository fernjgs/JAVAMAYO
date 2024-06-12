package Constructor;

public class Persona {
	
	public static int numPersonas = 0;
	
	int edad;
	
	public Persona() {
		numPersonas++;
		edad++;
	}
	
	public int getEdad() {
		return edad;
	}

}
