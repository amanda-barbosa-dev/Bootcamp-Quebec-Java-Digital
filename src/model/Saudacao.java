package model;

public class Saudacao {
    public static void verificarSaudacao (double userLocalTime) {
        if (userLocalTime < 12) {
            System.out.println("Bom dia!");
        }
        else if (userLocalTime < 18) {
            System.out.println("Boa tarde!");
        }
        else {
            System.out.println("Boa noite!");
        }
    }
}
