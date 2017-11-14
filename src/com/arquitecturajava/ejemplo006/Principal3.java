package com.arquitecturajava.ejemplo006;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Paths;
import java.util.zip.GZIPOutputStream;

public class Principal3 {

	public static void main(String[] args) {
		
		try(
				FileOutputStream salida = new FileOutputStream(Paths.get("texto3.txt").toFile());
				GZIPOutputStream salidaComprimida = new GZIPOutputStream(salida);
				BufferedOutputStream salidaCache = new BufferedOutputStream(salidaComprimida);
				OutputStreamWriter transformador = new OutputStreamWriter(salidaCache);
				BufferedWriter escritorTexto = new BufferedWriter(transformador)
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
