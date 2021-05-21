public class Aluno {

    private String nome;
//matricula é string, pois não farei opreações matemáticas com o número.

    private String matricula;
    private float cre;
    private String curso;

    public Aluno(String nome, String matricula, float cre, String curso) {

        this.nome = nome;
        this.matricula = matricula;
        this.cre = cre;
        this.curso = curso;

    }


    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public float getCre() {
        return this.cre;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setCre(float cre){
        this.cre = cre;
    }

    public void  setCurso(String curso){
        this.matricula = curso;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + " - Matrícula: " + this.matricula + " - CRE: " + this.cre + " - Curso: " + this.curso;
    }

}


