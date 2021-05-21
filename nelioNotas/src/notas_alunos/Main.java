package notas_alunos;

import java.util.Locale;
import java.util.Scanner;
import notas_alunos.Alunos;

public class Main {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Alunos alunos = new Alunos();
	
	System.out.println("Nome do Aluno: ");
	alunos.name = sc.nextLine();
	System.out.println("Primeira Nota: ");
	alunos.avaliacaoUm = sc.nextDouble();
	System.out.println("Segunda Nota: ");
	alunos.avaliacaoDois = sc.nextDouble();
	System.out.println("Terceira Nota: ");
	alunos.avaliacaoTres = sc.nextDouble();
	
		if (alunos.mediaFinal () < 60) {
	
			System.out.println("você Foi Reprovado");
			System.out.println("Faltou " + alunos.situacao());
		}
		else {
			
			System.out.println();
			System.out.println("você foi Aprovado");
		}
	}
	
	
	
	
	
	
		

}


