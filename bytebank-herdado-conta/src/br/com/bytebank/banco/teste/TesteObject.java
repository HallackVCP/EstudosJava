package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteObject {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(22, 33);
		System.out.println(cc);
		//System.out.println(cc.toString()); chamada toString desnecessaria
		ContaPoupanca cp = new ContaPoupanca(33, 22);
		System.out.println(cp);
		//System.out.println(cp.toString()); chamada toString desnecessaria
		

	}

}
