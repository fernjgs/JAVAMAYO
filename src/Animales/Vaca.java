package Animales;

public class Vaca extends Animal {
	
	int litrosLeche;
	
	public Vaca(String sonido) {
        super(sonido);
		
    }

    @Override
    public void comunicarse() {
        System.out.println("La vaca hace: " + sonido);
    }
	
}
