package entendendometodosjava.metodos.sobrecarga;

public class Quadrilatero {
    public static void calcularArea (double lado) {
        System.out.println("A área do quadrado é: " + (lado * lado));
    }
    public static void calcularArea (double base, double altura) {
        System.out.println("A área do retângulo é: " + (base * altura));
    }

    public static void calcularArea (double baseMenor, double baseMaior, double altura) {
        System.out.println("A área do trapézio é: " + (baseMaior + baseMenor) * altura /2);
    }
    public static void calcularArea (float diagonal1, float diagonal2) {
        System.out.println("A área do losango é: " + (diagonal1 * diagonal2)/2);
    }
}
