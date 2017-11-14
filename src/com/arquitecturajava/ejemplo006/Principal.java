package com.arquitecturajava.ejemplo006;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Principal {

	public static void main(String[] args) {
		
		String linea = null;
		long numero1 = System.currentTimeMillis();
		
		try(InputStream entrada = new FileInputStream(Paths.get("texto.txt").toFile());
				InputStreamReader transformador = new InputStreamReader(entrada);
				BufferedReader lectorTexto = new BufferedReader(transformador)
			) {
			
			while((linea = lectorTexto.readLine()) != null) {
				System.out.println(linea);
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
