package Metodos;

public class Saludo {

	 public static String saludar(String nombre) {
	        return "Hola " + nombre + "!";
	    }
	
	
	public static void main(String[] args) {
        String nombre = "Ada";
        String saludo = saludar(nombre);
        System.out.println(saludo);
    }

   
}
