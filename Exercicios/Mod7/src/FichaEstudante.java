public class FichaEstudante {

    private  String nome;

    private  int matricula;

    private String endereco;

    private String curso;

    public String getCurso() {
        return curso;
    }

    //estrutura de ficha dde aluno matriculado no curso

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void nomeEtudante(String nome) {
        setNome(nome);
    }

    public void cadatrarEndereco(String endereco) {
        setEndereco(endereco);
    }

    public void estudanteMatricula (int matricula){
        setMatricula(matricula);
    }

    public void estudanteCurso (String curso) {
        setCurso(curso);
    }
}
