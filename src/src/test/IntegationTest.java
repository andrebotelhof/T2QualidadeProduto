package src.test;

import java.io.IOException;

import org.junit.Test;
import src.main.Escrita;
import src.main.Leitura;

public class IntegationTest {
	@Test
	public void testLeituraEscrita() throws NumberFormatException, IOException{
		Escrita.main(null);
		Leitura.main(null);
	}
}
