package Metodos;

public class kilometros {

    public static void convertirAKilometrosPorHora(double velocidadKmH) {
        double velocidadMH = velocidadKmH * 1000;
        System.out.println(velocidadKmH + " Km/h son " + velocidadMH + " metros/hora");
    }

    public static void main(String[] args) {
        
        double velocidad = 60.0;
        convertirAKilometrosPorHora(velocidad); 
    }
}
