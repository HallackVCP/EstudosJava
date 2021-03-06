package br.com.gerenciamentocursos;

public class Aluno {
	
	private String nome;
	private int numeroMatricula;
	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException();
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	public String getNome() {
		return nome;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	
	@Override
	public String toString() {
		
		return "Nome: "+this.getNome() +"   N?mero de matr?cula: "+ this.getNumeroMatricula();
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro =(Aluno) obj;
		
		
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public int hashCode() {
		
		return this.nome.hashCode();
	}
	
	
	
}
	
	


