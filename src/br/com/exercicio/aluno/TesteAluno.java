package br.com.exercicio.aluno;

import java.util.Scanner;

public class TesteAluno {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		aluno.nomeDisciplinas = new String[3];
		aluno.notasDiciplinas = new double[3][4];
		
		System.out.println("Entre com o nome do Aluno: ");
		aluno.nome = input.next();
		
		System.out.println("Entre com o nome do Curso: ");
		aluno.nomeCurso = input.next();
		
		System.out.println("Entre com a matricula do Aluno: ");
		aluno.matricula = input.next();
		
		for(int i=0; i<aluno.nomeDisciplinas.length; i++) {
			System.out.println("Entre com o nome das diciplinas: "+ (i+1));
			aluno.nomeDisciplinas[i] = input.next();
		}
		
		for(int i=0; i<aluno.notasDiciplinas.length;i++) {
			System.out.println("Obtendo notas das disciplinas: "+ aluno.nomeDisciplinas[i]);
			for(int j=0; j<aluno.notasDiciplinas[i].length; j++) {
				System.out.println("Entre com as notas das diciplinas: ");
				aluno.notasDiciplinas[i][j] = input.nextDouble();
			}
		}
		
		aluno.mostrarInformação();
		
		for(int i=0; i<aluno.nomeDisciplinas.length; i++) {
			if(aluno.verificarMedia(i)) {
				System.out.println("Disciplina "+aluno.nomeDisciplinas[i]+" - foi aprovado.");
			}else {
				System.out.println("Disciplina "+aluno.nomeDisciplinas[i]+" - foi reprovado.");
			}
		}
		
		input.close();
	}
}
