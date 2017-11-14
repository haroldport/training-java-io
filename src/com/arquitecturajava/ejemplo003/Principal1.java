package com.arquitecturajava.ejemplo003;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Principal1 {

	public static void main(String[] args) {
		
		Path ruta = Paths.get("miCarpeta");
		
		try {
			Stream<Path> st = Files.list(ruta);
			st.filter((p) -> p.getFileName().toString().contains("otro"))
			.map((p) -> p.getFileName().toString().toUpperCase())
			.forEach(System.out::println);
			st.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
