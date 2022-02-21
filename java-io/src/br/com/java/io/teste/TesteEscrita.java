package br.com.java.io.teste;

import java.io.Writer;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import jdk.internal.org.jline.utils.InputStreamReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		
		
		
		FileOutputStream fos = new FileOutputStream("lorem2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		bw.newLine();
		bw.newLine();
		bw.write("palavras aleatorias");
		
		
		
		
		bw.close();

	}

}
