package br.com.bytebank.banco.teste.util;
import java.util.*;

import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		//Integer idadeRef = new Integer(29);
		Integer idadeRef = Integer.valueOf(30);
		int valor = idadeRef.intValue();
		
		String s = args[0];
		//Integer numero = Integer.valueOf(s);
		Integer numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);
		numeros.add(Integer.valueOf(28));
		numeros.add(valor);
		

	}

}
