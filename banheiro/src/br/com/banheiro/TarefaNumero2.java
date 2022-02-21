package br.com.banheiro;

public class TarefaNumero2 implements Runnable {
	private Banheiro banheiro;

	@Override
	public void run() {
		banheiro.fazNumero2();

	}

	public TarefaNumero2(Banheiro banheiro) {
		super();
		this.banheiro = banheiro;
	}
}
