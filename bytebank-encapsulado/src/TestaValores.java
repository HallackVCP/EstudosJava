
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 22466);
		Conta conta2 = new Conta(1337, 113566);
		System.out.println(Conta.getTotal());
		
		//conta.setAgencia(-10);
		//conta.setNumero(-20);

	}

}
