package br.com.threads.lista;

import java.util.List;

public class TarefaAdicionarElemento implements Runnable {
	Lista lista;
	private int numeroThread;
	public TarefaAdicionarElemento(Lista lista, int numeroThread) {
		this.lista = lista;
		this.numeroThread = numeroThread;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			lista.adicionaElementos("Thread "+ numeroThread+"-" + i);
		}

	}

}
