package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteGuardadorContas {

	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		Conta cc = new ContaCorrente(22, 11);
		Conta cc2 = new ContaCorrente(22, 22);
		guardador.adiciona(cc);
		guardador.adiciona(cc2);
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		Conta ref = guardador.getReferencia(0);
		System.out.println(ref.getNumero());

	}

}
