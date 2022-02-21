package br.com.gerenciamentocursos;

import java.util.HashSet;
import java.util.*;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String>alunos = new HashSet<>();
		alunos.add("Hallack");
		alunos.add("Random");
		alunos.add("Aleat�rio");
		alunos.add("Pessoa");
		alunos.add("J�o");
		alunos.add("Z�");
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println(alunos.size());
		alunos.add("J�o");
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println(alunos.size());
		boolean hallackEstaMatriculado = alunos.contains("Hallack");
		System.out.println(hallackEstaMatriculado);
		alunos.remove("Aleat�rio");
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		

	}

}
