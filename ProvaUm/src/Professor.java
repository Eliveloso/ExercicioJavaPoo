public class Professor {


    private String nome;
//matricula � string, pois n�o farei oprea��es matem�ticas com o n�mero.

    private String matricula;
    private String disciplina;
    private String coordenacao;

    public Professor(String nome, String matricula, String disciplina, String coordenacao) {

        this.nome = nome;
        this.matricula = matricula;
        this.disciplina = disciplina;
        this.coordenacao = coordenacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(String coordenacao) {
        this.coordenacao = coordenacao;
    }

    @Override
    public String toString(){
        return "Professor: " + this.nome + "Matr�cula: " + this.matricula + " Disciplina: " + this.disciplina + " Coordena��o: " + this.coordenacao;
    }
}
