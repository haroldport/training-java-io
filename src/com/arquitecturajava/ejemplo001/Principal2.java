package com.arquitecturajava.ejemplo001;

import java.io.File;

public class Principal2 {

	public static void main(String[] args) {
		
		File miFichero = new File("miFichero.txt");
		System.out.println(miFichero.getAbsolutePath());
		System.out.println(miFichero.getName());
		System.out.println(miFichero.isDirectory());
		
	}

}
