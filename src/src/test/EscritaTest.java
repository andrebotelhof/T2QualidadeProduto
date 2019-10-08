package src.test;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.jupiter.api.Test;

import src.main.Escrita;

public class EscritaTest {
	@Test
	public void testFileExist(){
		Escrita.main(null);
		File file = new File("numbers.txt");
		boolean e = file.exists();
		assertTrue(e);
	}
}
