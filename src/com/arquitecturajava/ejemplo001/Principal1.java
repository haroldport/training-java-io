package com.arquitecturajava.ejemplo001;

import java.io.File;
import java.io.IOException;

public class Principal1 {

	public static void main(String[] args) {
		
		try {
			File miFichero = new File("miFichero.txt");
			miFichero.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
