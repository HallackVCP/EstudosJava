
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaPessoa = new Conta();
		//contaPessoa.titular.nome = "Pessoa";
		contaPessoa.titular = new Cliente();
		System.out.println(contaPessoa.titular);
		contaPessoa.titular.nome = "Pessoa";
		System.out.println(contaPessoa.titular.nome);
		System.out.println(contaPessoa.titular);
		
		
		
		

	}

}
