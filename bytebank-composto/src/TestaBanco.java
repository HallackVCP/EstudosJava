
public class TestaBanco {

	public static void main(String[] args) {
		Cliente vinicius = new Cliente();
		vinicius.nome = "Vinicius";
		vinicius.cpf = "222.222.222-22";
		vinicius.profissao = "Estagiario";
		Conta contaVinicius = new Conta();
		contaVinicius.deposita(100);
		contaVinicius.titular = vinicius;
		System.out.println(contaVinicius.titular.nome);
		

	}

}
