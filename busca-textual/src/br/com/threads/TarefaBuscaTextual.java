package br.com.threads;

import java.util.*;
import java.io.*;


public class TarefaBuscaTextual implements Runnable {

	private String nomeArquivo;
	private String nome;

	public TarefaBuscaTextual(String nomeArquivo, String nome) {
		
		this.nomeArquivo = nomeArquivo;
		this.nome = nome;
		
	}

	@Override
	public void run() {
		try {
			int numeroLinha = 1;
			Scanner scanner = new Scanner(new File(nomeArquivo));
			while(scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				
				if(linha.toLowerCase().contains(nome.toLowerCase())) {
					System.out.println(nomeArquivo + "------"+ numeroLinha + "------"+ linha);
				}
				numeroLinha +=1;
			}
			
			scanner.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

	}

}