package com.arquitecturajava.ejemplo001;

import java.io.File;

public class Principal4 {

	public static void main(String[] args) {
		
		File miCarpeta = new File("miCarpeta");
		
		File[] ficheros = miCarpeta.listFiles();
		
		for(int i = 0; i < ficheros.length; i++) {
			System.out.println(ficheros[i].getName());
		}
		
	}

}
