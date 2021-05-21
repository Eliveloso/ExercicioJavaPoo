package notas_alunos;

public class Alunos {
	
	public String name;
	public double avaliacaoUm;
	public double avaliacaoDois;
	public double avaliacaoTres;
	
	public double mediaFinal(){
		
		return (avaliacaoUm + avaliacaoDois + avaliacaoTres) / 3;
		
	}
	
	public double situacao() {
		
		if (mediaFinal() < 70) {
			return 70 - mediaFinal();
		}
		else {
			
			return 0.0;
		}
	}
	
	
	

}
