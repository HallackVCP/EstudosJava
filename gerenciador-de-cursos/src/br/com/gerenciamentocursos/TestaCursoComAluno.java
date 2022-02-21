package br.com.gerenciamentocursos;

import java.util.*;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as colecoes do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
        
        
        Aluno a1 = new Aluno("Hallack", 1478);
        Aluno a2 = new Aluno("Jão", 34672);
        Aluno a3 = new Aluno("Zé", 5617);
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.getAlunos().forEach(a -> System.out.println(a));
        
        System.out.println("O aluno " + a1.getNome() + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));
        
        Aluno hallack = new Aluno("Hallack", 1478);
        System.out.println(javaColecoes.estaMatriculado(hallack));
        
        System.out.println(a1.equals(hallack));
        
        
        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while(iterador.hasNext()) {
        	Aluno proximo = iterador.next();
        	System.out.println(proximo);
        }
        

	}

}
