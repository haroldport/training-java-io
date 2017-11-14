package com.arquitecturajava.ejemplo002;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal2 {

	public static void main(String[] args) {
		
		Path ruta = Paths.get("miFichero.txt");
		Path rutaDestino = Paths.get("miCarpeta/miFichero.txt");
		
		try {
			//gestiona el movimiento, copia y borrado de ficheros de disco
			Files.copy(ruta, rutaDestino);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
