package com.arquitecturajava.ejemplo004;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Paths;

public class Principal {

	public static void main(String[] args) {
		
		int dato;
		
		try(InputStream entrada = new FileInputStream(Paths.get("foto.jpg").toFile());
			OutputStream salida = new FileOutputStream(Paths.get("fotoClon.jpg").toFile())
			) {
			
			while((dato = entrada.read()) != -1) {
				salida.write(dato);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
