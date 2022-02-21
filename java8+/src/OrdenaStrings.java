import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");
		System.out.println(palavras);
//		Comparator<String> comparador = new ComparadorPorTamanho();
		//Collections.sort(palavras, comparador);
		
//		palavras.forEach(new Consumer<String>(){
//			@Override
//			public void accept(String s) {
//				System.out.println(s);	
//			}	
//		});
		palavras.sort((s1, s2) ->s1.length()-s2.length());
		
		
		palavras.sort((s1, s2) ->Integer.compare(s1.length(), s2.length()));
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
		System.out.println(palavras);
		
//		for (String palavra : palavras) {
//			System.out.println(palavra);
//		}
		palavras.forEach(s -> System.out.println(s));
		
		
		
	}

}

//class ImprimeNaLinha implements Consumer<String>{
//	@Override
//	public void accept(String s) {
//		System.out.println(s);
//		
//	}
//}

//class ComparadorPorTamanho implements Comparator<String>{
//
//	@Override
//	public int compare(String s1, String s2) {
//		
//		return s1.length()-s2.length();
//	}
//
//
//	
//}
