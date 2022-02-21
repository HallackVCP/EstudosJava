package br.com.servidor;

import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.Callable;

public class ComandoC2ChamaWS implements Callable<String> {

	private PrintStream saida;

	public ComandoC2ChamaWS(PrintStream saida) { 
		this.saida = saida;
	}

	@Override
	public String call() throws Exception{
		// será impresso no console do servidor
		System.out.println("Servidor recebeu comando c2");
		
		saida.println("");

		
		Thread.sleep(20000); //simulando algo demorado
		
		int numero = new Random().nextInt(100) + 1;
		
		System.out.println("Servidor finalizou comando c2-WS");
		return Integer.toString(numero);
	

	}

	
}
