package br.com.exercicio.aluno;

public class Aluno {
	String nome;
	String matricula;
	String nomeCurso;
	String[] nomeDisciplinas;
	double[][] notasDiciplinas;
	
	boolean verificarMedia(int indice) {
		
		
		if(this.obterMedia(indice) >= 7) {
			return true;
		}else {
			return false;
		}
	}
	
	double obterMedia(int indice) {
		
		double soma = 0;
		
		for(int i=0; i<this.notasDiciplinas[indice].length; i++) {
			soma += this.notasDiciplinas[indice][i];
		}
		
		double media = soma / 4;
		
		return media;
	}
	
	void mostrarInformação() {
		System.out.println("Nome Aluno: "+this.nome);
		System.out.println("Numero da Matricula: "+this.matricula);
		System.out.println("Nome do Curso: "+this.nomeCurso);
		
		for(int i=0; i<this.nomeDisciplinas.length;i++) {
			System.out.println("Nome da Disciplina: "+this.nomeDisciplinas[i]);
		}
		
		for(int i=0; i<this.notasDiciplinas.length;i++) {
			System.out.println("Nome da Disciplina: "+this.nomeDisciplinas[i]);
			for(int j=0; j<this.notasDiciplinas[i].length; j++) {
				System.out.println("A notas disciplina: "+this.notasDiciplinas[i][j]);
			}
		}
	}
}
