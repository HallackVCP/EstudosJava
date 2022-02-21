package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("saldo primeira conta: "+ primeiraConta.saldo);
		System.out.println("saldo segunda conta: "+ segundaConta.saldo);
		System.out.println("agencia primeira conta: "+ primeiraConta.agencia);
		System.out.println("numero primeira conta: "+ primeiraConta.numero);
		if(primeiraConta == segundaConta) {
			System.out.println("são a mesma conta!");
		}
		else {
			System.out.println("são contas diferentes");
		}
			
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		

	

	}

}
