package br.com.banheiro;

public class TarefaLimpeza implements Runnable {
	
	private Banheiro banheiro;

	@Override
	public void run() {
		while(true) {
			banheiro.limpa();
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public TarefaLimpeza(Banheiro banheiro) {
		super();
		this.banheiro = banheiro;
	}

	

}
