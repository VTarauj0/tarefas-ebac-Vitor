import java.util.Scanner;

public class ExercicioMod10 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("digite sua primeira nota");
        int n1 = s.nextInt();
        System.out.println("digite sua segunda nota");
        int n2 = s.nextInt();
        System.out.println("digite sua terceira nota");
        int n3 = s.nextInt();
        System.out.println("digite sua quarta nota");
        int n4 = s.nextInt();
        int media = (n1 + n2 + n3 + n4)/ 4;
        if (media >= 7){
            System.out.println("aluno aprovado!" + media);
        }else if (media >= 5) {
            System.out.println("aluno de recuperação!" + media);
        }else {
            System.out.println("aluno reprovado!" + media);
        }
    }
}
