package com.arquitecturajava.ejemplo005;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

public class Principal {

	public static void main(String[] args) {
		
		int dato;
		long numero1 = System.currentTimeMillis();
		
		try(InputStream entrada = new FileInputStream(Paths.get("foto.jpg").toFile());
				//primera clase decoradora para mejorar el rendimiento
				BufferedInputStream entradaRapida = new BufferedInputStream(entrada)
			) {
			
			while((dato = entradaRapida.read()) != -1) {
				System.out.print((char) dato);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		long numero2 = System.currentTimeMillis();
		System.out.println("*********************");
		System.out.println(numero2 - numero1);

	}

}
