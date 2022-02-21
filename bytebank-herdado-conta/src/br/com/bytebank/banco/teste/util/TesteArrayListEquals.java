package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		Conta cc = new ContaCorrente(22, 11);
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc);
		lista.add(cc2);
		Conta cc3 = new ContaCorrente(22, 22);
		
		System.out.println("Já existe? " + lista.contains(cc2));
		System.out.println("Já existe? " + lista.contains(cc3));
		
		
		
		for(Conta conta : lista) {
			if(conta.equals(cc3)) {
				System.out.println("Já existe");
			}
		}
		for(Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
