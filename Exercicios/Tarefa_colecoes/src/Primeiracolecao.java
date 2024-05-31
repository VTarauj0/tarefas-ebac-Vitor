import java.util.Arrays;
import java.util.Scanner;

public class Primeiracolecao {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("digite nomes de alunos separados por virgulas: ");
            String input = scanner.nextLine();
            String[] nomes = input.split(",");
            Arrays.sort(nomes);
            for (String nome : nomes) {
                System.out.println(nome.trim());
            }
            scanner.close();
        }
}
