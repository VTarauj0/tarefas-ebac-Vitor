public class CalculaMedia {

    public static void main(String args[]) {
        mediaDasNotas();
    }

    private static void mediaDasNotas (){
        int n1 = 5 ;
        int n2 = 8;
        int n3 =4;
        int n4 = 6;
        int soma = n1 + n2 + n3 + n4;
        int media = (n1 + n2 + n3 + n4) /4;

        System.out.println("a soma de todas as notas é de: " + soma + ",e  media dessa soma é de: " + media);

    }
}
