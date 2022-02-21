package br.com.threads.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		Lista lista = new Lista();
//		List<String> lista = new Vector<String>();
//		List<String> lista = Collections.synchronizedList(new ArrayList<String>());
		for(int i =0; i<100;i++) {
			new Thread(new TarefaAdicionarElemento(lista, i)).start();
			
		}
		
		new Thread(new TarefaImprimir(lista)).start();
		
		
		
		
		

	}

}
