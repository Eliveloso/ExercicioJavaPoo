package folha_empregados;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Empregado empregado = new Empregado();

		System.out.println("Nome do funcionário: ");
		empregado.name = sc.nextLine();
		System.out.println("Digite o Salário Bruto: ");
		empregado.salarioBruto = sc.nextDouble();
		System.out.println("Digite o valor total de impostos: ");
		empregado.tax = sc.nextDouble();

		System.out.print(empregado);
		System.out.println();
		System.out.println("Quanto você gostaria de incrementar ao salário? ");
		double percentage = sc.nextDouble();
		empregado.encrementoSalario(percentage);

		System.out.print("Dados com o encremento: " + empregado);

	}

}
