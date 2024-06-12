package Metodos;
public class Main {
    public static void main(String[] args) {
        System.out.println(nand(true, true)); // Debería devolver false
        System.out.println(nand(true, false)); // Debería devolver true
        System.out.println(nand(false, true)); // Debería devolver true
        System.out.println(nand(false, false)); // Debería devolver true
    }

    public static boolean nand(boolean a, boolean b) {
        return !(a && b);
    }
}
