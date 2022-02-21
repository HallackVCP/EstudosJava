package br.com.gerenciamentocursos;

public class TestaBuscaAlunosNoCurso {

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
        
        Aluno aluno = javaColecoes.buscaMatriculado(5617);
        System.out.println(aluno);


	}

}
