package Animales;

public class Cerdo extends Animal {

	int kilosCarne;
	
	 public Cerdo(String sonido) {
		 super(sonido);
		
    }

    @Override
    public void comunicarse() {
        System.out.println("El cerdo hace: " + sonido);
    }
	
}
