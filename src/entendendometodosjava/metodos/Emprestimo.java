package entendendometodosjava.metodos;

public class Emprestimo {
    
    public static double obterTaxa(int parcelas) {
        if (parcelas == 2) {
            return 0.30;            
        }
        else if (parcelas == 3) {
            return 0.45;
        }
        return 0;
    }

    public static void informarValorFinalEmprestimo (int valorInicial, int parcelas ){
        if (parcelas >= 4 || parcelas == 0) {
            System.out.println("Valor de parcelas inválido!");
        }

        else {
            double valorFinalEmprestimo = valorInicial + (valorInicial * obterTaxa(parcelas));
            System.out.println("O valor final do empréstimo para " + parcelas + " parcelas é: R$ " + valorFinalEmprestimo);

        }
    }
}
