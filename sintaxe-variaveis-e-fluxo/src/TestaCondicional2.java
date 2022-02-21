
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais: ");
		int idade = 20;
		boolean acompanhado = true;
		if(idade>=18 || acompanhado) {
			System.out.println("Pode entrar,maior de idade ou está acompanhado");
		}
		
		else {
			System.out.println("Menor de idade desacompanhado");
		}
	}
}
