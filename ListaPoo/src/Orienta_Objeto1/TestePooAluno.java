package Orienta_Objeto1;

import java.util.Scanner;

public class TestePooAluno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do Aluno: ");
		String nome = sc.nextLine();
		System.out.println();
		System.out.print("Matricula do Aluno: ");
		String matricula = sc.nextLine();
		System.out.println();
		System.out.print("Endereço do Aluno:");
		sc.nextLine();
		String endereco = sc.nextLine();

		System.out.print("Digite o CPF: ");
		String cpf = sc.nextLine();

		AlunoPoo alunoPoo = new AlunoPoo(nome, matricula, cpf, endereco);
		System.out.print(alunoPoo);

		sc.close();
	}
}