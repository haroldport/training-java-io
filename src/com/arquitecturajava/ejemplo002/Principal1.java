package com.arquitecturajava.ejemplo002;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal1 {

	public static void main(String[] args) {
		
		Path ruta = Paths.get("miFichero.txt");
		
		System.out.println(ruta.getFileName());
		System.out.println(ruta.toAbsolutePath());
		
		Path ruta2 = ruta.toAbsolutePath();
		
		for(Path miniRuta: ruta2) {
			System.out.println(miniRuta);
		}

	}

}
