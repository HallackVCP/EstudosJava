package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Vinicius";//object literal
		//String outro = new String("Vinicius"); má prática
		
		//String outra = nome.replace("V", "v");
		//String outra = nome.replace("Vi", "vI");
		String outra = nome.replace('V', 'v');
		System.out.println(nome);
		System.out.println(outra);
		//String outro = nome.toLowerCase();
		//String outro = nome.toUpperCase();
		System.out.println(nome);
		//System.out.println(outro);
		System.out.println(nome.charAt(2));
		int pos = nome.indexOf("nic");
		System.out.println(pos);
		System.out.println(nome.substring(1));
		System.out.println(nome.substring(1, 4));
		System.out.println(nome.length());
		System.out.println(nome.isEmpty());
		System.out.println(nome.isBlank());
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		String vazio = "";
		System.out.println(vazio.isEmpty());
		String espaco = " ";
		System.out.println(espaco.isBlank());
		System.out.println(espaco.isEmpty());
		String coisa = espaco.trim();
		System.out.println(coisa.isEmpty());
		System.out.println(nome.contains("Vin"));

	}

}
