public class Estudante {

    public static void main(String args []) {
        FichaEstudante fichaEstudante = new FichaEstudante();
        fichaEstudante.nomeEtudante("Vitor Araujo");
        fichaEstudante.estudanteMatricula(103032);
        fichaEstudante.estudanteCurso("Especialista back-end Java");
        fichaEstudante.cadatrarEndereco("Minha Rua");

        System.out.println(fichaEstudante.getNome());
        System.out.println(fichaEstudante.getMatricula());
        System.out.println(fichaEstudante.getCurso());
        System.out.println(fichaEstudante.getEndereco());
    }
}
