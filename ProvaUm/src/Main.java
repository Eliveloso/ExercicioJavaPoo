public class Main {
    public static void main(String[] args){
        Aluno aluno1= new Aluno("Eli Veloso" ,"2020217", 7.8f, "Sistemas");
        Aluno aluno2 = new Aluno("Fulano de Tal" ,"2020218", 9.5f, "Sistemas");
        Aluno aluno3 = new Aluno("Jhon Doe" ,"2020219", 8.2f, "Sistemas");
        Professor prof = new Professor("Tia Maria", "1988255", "Libras", "Humanas");
        Turma libras = new Turma(aluno1,aluno2,aluno3,prof);

        if (libras.verificarAluno("Fulano de Tal")) {
            libras.imprimeAlunosMatriculados();
        }

            System.out.println("O maior CRE é: " + libras.maiorCRE());
    }

}
