package Orienta_Objeto1;

import java.util.Scanner;


public class TestePooFuncionario {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		FuncionarioPoo funcionario = new FuncionarioPoo();
	
		
			
		System.out.print("Nome do Funcionario: ");
		funcionario.nomeFuncionario = sc.nextLine();
		System.out.println();
		System.out.print("Salario do Funcionario: ");
		funcionario.salario = sc.nextInt();
		System.out.println();
		System.out.print("Data de inicio do Funcionario: ");
		System.out.println();
		sc.nextLine();
		funcionario.inicio = sc.nextLine();
		System.out.println();
		System.out.print("RG do Funcionario: ");
		funcionario.rg = sc.nextLine();
		
		System.out.println();
		System.out.print("Dados do Funcionário" + funcionario);
		
		System.out.println();
		System.out.print("Qual a porcentagem que você deseja incrementar? ");
		double aumento = sc.nextDouble();
		funcionario.recebeAumento(aumento);	
		
						
		System.out.println();
		System.out.print("Dados do Funcionário com aumento " + funcionario);
		
						
				
		sc.close();
	}
}