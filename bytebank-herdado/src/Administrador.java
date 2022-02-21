
public class Administrador extends Funcionario implements Autenticavel{

	AutenticacaoUtil autenticador;
	
	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public boolean autentica(int senha) {		 
		return this.autenticador.autentica(senha);
		
		
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);	
	}
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 50;
	}

	
	
	

}
