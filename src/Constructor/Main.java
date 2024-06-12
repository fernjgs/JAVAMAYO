package Constructor;

public class Main {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		Persona p4 = new Persona();
		
		System.out.println("Número total de personas: " + Persona.numPersonas);
		System.out.println("Edad de la persona 1: " + p1.getEdad());
		System.out.println("Edad de la persona 2: " + p2.getEdad());
		System.out.println("Edad de la persona 3: " + p3.getEdad());
		System.out.println("Edad de la persona 4: " + p4.getEdad());

		
	}
	
}
