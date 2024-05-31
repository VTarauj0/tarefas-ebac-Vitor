import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparacaoDeGenero {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String> homens = new ArrayList<>();
            List<String> mulheres = new ArrayList<>();

            System.out.println("Digite seu nome separado por '-'  e com a inicial do seu genero");

            String input = scanner.nextLine();
            String[] pessoas = input.split(",");

            for (String pessoa : pessoas) {
                String[] dados = pessoa.split("-");
                if (dados.length != 2) continue;
                List<String> lista = dados[1].equalsIgnoreCase("m") ? homens : mulheres;
                lista.add(dados[0].trim());
            }

            imprimirNomes("Homens", homens);
            imprimirNomes("Mulheres", mulheres);

            scanner.close();
        }

        private static void imprimirNomes(String titulo, List<String> nomes) {
            System.out.println(titulo + ":");
            for (String nome : nomes) {
                System.out.println(nome);
            }
            System.out.println();
        }
}
