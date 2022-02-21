package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		Conta cc = new ContaCorrente(22, 11);
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc);
		lista.add(cc2);
		System.out.println(lista.size());
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		lista.remove(0);
		System.out.println(lista.size());
		
		Conta cc3 = new ContaCorrente(33, 311);
		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc3);
		lista.add(cc4);
//		for(int i =0; i < lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}forma "antiga" à de baixo
		for(Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
