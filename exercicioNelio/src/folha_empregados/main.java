package folha_empregados;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Empregado empregado = new Empregado();

		System.out.println("Nome do funcion�rio: ");
		empregado.name = sc.nextLine();
		System.out.println("Digite o Sal�rio Bruto: ");
		empregado.salarioBruto = sc.nextDouble();
		System.out.println("Digite o valor total de impostos: ");
		empregado.tax = sc.nextDouble();

		System.out.print(empregado);
		System.out.println();
		System.out.println("Quanto voc� gostaria de incrementar ao sal�rio? ");
		double percentage = sc.nextDouble();
		empregado.encrementoSalario(percentage);

		System.out.print("Dados com o encremento: " + empregado);

	}

}
