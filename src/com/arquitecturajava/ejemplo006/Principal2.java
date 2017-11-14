package com.arquitecturajava.ejemplo006;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class Principal2 {

	public static void main(String[] args) {
		
		try(FileWriter salida = new FileWriter(Paths.get("texto2.txt").toFile());
				BufferedWriter escritorTexto = new BufferedWriter(salida)
			) {
			
			for(int i = 0; i < 1000; i++) {
				escritorTexto.write("Hola este es el mensaje " + i);
				escritorTexto.newLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
