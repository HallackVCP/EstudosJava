
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 22466);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		Cliente pessoa = new Cliente();
		conta.setTitular(pessoa);
		pessoa.setNome("Vinicius");
		//System.out.println(pessoa.getNome());
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("estagiario");
	}

}
