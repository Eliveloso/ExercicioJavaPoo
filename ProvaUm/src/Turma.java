public class Turma {

    private Aluno aluno1;
    private Aluno aluno2;
    private Aluno aluno3;
    private Professor professor;

    public Turma (Aluno a1, Aluno a2, Aluno a3, Professor p){

        this.aluno1 = a1;
        this.aluno2 = a2;
        this.aluno3 = a3;
        this.professor = p;
    }

    public Aluno getAluno1() {
        return aluno1;
    }

    public Aluno getAluno2() {
        return aluno2;
    }

    public Aluno getAluno3() {
        return aluno3;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setAluno1(Aluno aluno1) {
        this.aluno1 = aluno1;
    }

    public void setAluno2(Aluno aluno2) {
        this.aluno2 = aluno2;
    }

    public void setAluno3(Aluno aluno3) {
        this.aluno3 = aluno3;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public boolean verificarAluno(String nome){

        if (this.aluno1.getNome() == nome){
            return true;

        } else if (this.aluno2.getNome() == nome) {
            return true;
        } else if (this.aluno3.getNome() == nome) {
            return true;
        }
        return false;
    }

    public float maiorCRE(){
        float maiorCRE = aluno1.getCre();
        if(aluno2.getCre()> maiorCRE){
            maiorCRE = aluno2.getCre();

        }
        if(aluno3.getCre()>maiorCRE){
            maiorCRE = aluno3.getCre();
        }
        return maiorCRE;

    }

    public void imprimeAlunosMatriculados(){
        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
        System.out.println(aluno3.toString());
    }

}

