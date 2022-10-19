package controlefluxos.repeticao;

public class ListaAlunos {

    public static void main(String[] args) {

        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
        //Forma abreviada -> uso de arrays e coleções
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }
         // Uso comum do for
        /*for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos [x] );
        }*/
    }
}
