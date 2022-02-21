
public class Multiplos3 {

	public static void main(String[] args) {
		int contador = 0;
		for(int i=0; i<=100; i++) {
			if(i % 3 == 0) {
				System.out.println(i + " É um multiplo de 3");
				contador ++;
			}
		}
		System.out.println(contador);

	}

}
