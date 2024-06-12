package Animales;

public class Gallina extends Animal {
    int numHuevos;

    public Gallina(String sonido) {
        super(sonido);
    	
    }

    @Override
    public void comunicarse() {
        System.out.println("La gallina hace: " + sonido);
    }
}
