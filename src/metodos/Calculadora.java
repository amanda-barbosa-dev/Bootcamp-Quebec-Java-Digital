package metodos;

public class Calculadora {
    public static void somarDoisNumeros (double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println("A soma dos dois números é: " + resultado);
    }

    public static void subtrairDoisNumeros (double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("A subtração dos dois números é: " + resultado);
    }

    public static void multiplicarDoisNumeros (double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println("A multiplicação dos dois números é: " + resultado);
    }

    public static void dividirDoisNumeros (double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println("A divisão dos dois números é: " + resultado);
    }
}
