package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[]contas = new Conta[5];
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;
		Object contas1 = new Object[5];
//		contas1[0] = contas[0];
		
//		Cliente cliente = new Cliente();
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		contas[1] = cc2;
//		contas1[1] = contas[1];
//		contas1[2] = cliente;
		//System.out.println(cc2.getNumero());
		System.out.println(contas[0].getNumero());
		System.out.println(contas[1].getNumero());
		ContaPoupanca ref = (ContaPoupanca)contas[1];//typecast
		System.out.println(ref.getNumero());
		

	}

}
