import java.util.ArrayList;
import java.util.Scanner;

public class SeparandoPorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomesMasculinos = new ArrayList<>();
        ArrayList<String> nomesFemininos = new ArrayList<>();

        System.out.println("Digite os nomes e sexos separados por vírgula (ex: Maria,F; João,M). Digite 'sair' para terminar:");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            String[] parts = input.split(",");
            if (parts.length == 2) {
                String name = parts[0].trim();
                String sex = parts[1].trim();

                if (sex.equalsIgnoreCase("M")) {
                    nomesMasculinos.add(name);
                } else if (sex.equalsIgnoreCase("F")) {
                    nomesFemininos.add(name);
                }
            }
        }

        System.out.println("Nomes masculinos: " + nomesMasculinos);
        System.out.println("Nomes femininos: " + nomesFemininos);
    }
}
