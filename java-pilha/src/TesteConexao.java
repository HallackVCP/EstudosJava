
public class TesteConexao {

	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
			
		}
		catch(IllegalStateException ex) {
			System.out.println("Deu merda na conexão!");
		}
		
		//------------------------------------------------------------------------------
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//			
//		}
//		catch(Exception ex) {
//			System.out.println("Deu merda na conexão!");
//		}
//		finally {
//			con.close();
//		}

	}

}
