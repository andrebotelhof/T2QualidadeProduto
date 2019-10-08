package src.test;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import src.main.Escrita;
import src.main.Leitura;

public class IntegationTest {
	@Test
	public void testLeituraEscrita() throws NumberFormatException, IOException{
		Escrita.main(null);
		Leitura.main(null);
	}
}
