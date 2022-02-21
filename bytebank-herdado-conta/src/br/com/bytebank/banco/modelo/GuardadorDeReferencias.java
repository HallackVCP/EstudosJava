package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {
	private Object[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeReferencias() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	public void adiciona(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		System.out.println("Adicionou");
		this.posicaoLivre++;
		
	}
	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}
	public Object getReferencia(int pos) {		
		return this.referencias[pos];
	}

}
