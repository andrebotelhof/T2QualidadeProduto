package src.test;


import java.io.File;


import org.junit.Test;
import src.main.Escrita;

import static org.junit.Assert.assertTrue;

public class EscritaTest {
	@Test
	public void testFileExist(){
		Escrita.main(null);
		File file = new File("numbers.txt");
		boolean e = file.exists();
		assertTrue(e);
	}
}
