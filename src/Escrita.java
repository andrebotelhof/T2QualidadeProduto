import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Escrita {
	public static void main (String[] args) {
		Leitura leitura = new Leitura();
		String fileName = "numbers.txt";
		System.out.println("Arquivo criado!");
		try (PrintStream ps = new PrintStream(fileName);) {
			for (int i = 1; i<=10 ;i++) {
				ps.printf("%d:%d:%d:%n", i, i*i, i*i*i);
			}
			leitura.leitura();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
