package br.com.bytebank;

import br.com.bytebank.banco.modelo.*;

public class TesteBibliotecas {

	public static void main(String[] args) {
		Conta c = new ContaCorrente(123, 321);
		c.deposita(200.3);
		System.out.println(c.getSaldo());

	}

}
