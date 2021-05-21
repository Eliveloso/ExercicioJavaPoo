package Orienta_Objeto1;

public class FuncionarioPoo {

	public String nomeFuncionario;
	public int salario;
	public String inicio;
	public String rg;

	public FuncionarioPoo() {

		this.nomeFuncionario = nomeFuncionario;
		this.salario = salario;
		this.inicio = inicio;
		this.rg = rg;

	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String getInicio() {
		return inicio;
	}

	public String getRg() {
		return rg;
	}

	public void recebeAumento(double percentual) {

		salario += salario * percentual / 100;

	}

	public double recebeAnual() {

		return (salario * 12);

	}

	@Override
	public String toString() {
		return "Funcionario: " + nomeFuncionario + ", Salario: " + salario + ", Data da Contratação: " + inicio
				+ ", Registro: " + rg + "Valor recebido anualmente" + recebeAnual();
	}

}
