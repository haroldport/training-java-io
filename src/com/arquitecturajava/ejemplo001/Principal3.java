package com.arquitecturajava.ejemplo001;

import java.io.File;
import java.io.IOException;

public class Principal3 {

	public static void main(String[] args) {
		
//		File miFichero = new File("miCarpeta");
//		miFichero.mkdir();
		try {
			File miFichero2 = new File("miCarpeta", "miFichero4.txt");
			miFichero2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
