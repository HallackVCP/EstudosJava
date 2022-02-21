package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		boolean saqueValido = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println("o saque é valido: " + saqueValido);
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		boolean transferenciaValida = conta2.transfere(300, conta);
		System.out.println(conta.saldo + " Saldo conta1");
		System.out.println(conta2.saldo + " Saldo conta2");
		System.out.println("Transferencia é valida? " + transferenciaValida);
		conta.titular = "testador";
		System.out.println(conta.titular);
	}

}
