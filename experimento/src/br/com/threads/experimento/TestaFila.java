package br.com.threads.experimento;

import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestaFila {

	public static void main(String[] args) throws Exception {
		BlockingQueue<String> fila = new ArrayBlockingQueue<String>(3);
		
		
		fila.put("c1");
		fila.put("c2");
		fila.put("c3");
		
		System.out.println(fila.size());
		System.out.println(fila.take());
		System.out.println(fila.take());
		System.out.println(fila.take());
		System.out.println(fila.size());

	}

}
