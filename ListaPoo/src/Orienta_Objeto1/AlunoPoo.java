package Orienta_Objeto1;


public class AlunoPoo {

	
	public String nome;
	public String matricula;
	public String endereco;
	public String cpf;
	
	public AlunoPoo (String nome, String matricula, String endereco, String cpf) {
		
		this.nome = nome;
		this.matricula = matricula;
		this.endereco = endereco;
		this.cpf = cpf;
		
	
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


	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCpf() {
		return cpf;
	}

	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	@Override
	public String toString() {
		return "Dados do Aluno:" + nome + ", matricula: " + matricula + ", Endereco: " + endereco + ", CPF: " + cpf +"" ;
	}
	
	
}