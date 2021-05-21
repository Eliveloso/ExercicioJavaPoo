package folha_empregados;

public class Empregado {

	/* atributos da classe */

	public String name;
	public double salarioBruto;
	public double tax;

	/* Métodos: visibilidade - retorno -nome (parametros) */

	public double salarioLiquido() {

		return (salarioBruto - tax);

	}

	public void encrementoSalario(double percentage) {

		salarioBruto += salarioBruto * percentage / 100;

	}

	public String toString() {
		return name + ", $" + String.format(" %.2f", salarioLiquido());
	}

}
