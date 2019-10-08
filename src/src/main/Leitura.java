package src.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leitura {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int somaTotal=0;
		BufferedReader br = new BufferedReader(new FileReader("numbers.txt"));
		
		while(br.ready()){
			String linha = br.readLine();
			String[] numbers = linha.split(":");
			somaTotal += Integer.parseInt(numbers[2]);
		}
		br.close();
		System.out.println("A soma toal da 3ª coluna é de: "+somaTotal);
		
	}
}
