package com.arquitecturajava.ejemplo007;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class Principal2 {

	public static void main(String[] args) {

		String claveTexto = "iQLIJr/ZPX8=";

		try {
			byte[] clave = Base64.getDecoder().decode(claveTexto);
			Key key = new SecretKeySpec(clave, "DES");
			Cipher cifrador = Cipher.getInstance("DES");
			cifrador.init(Cipher.DECRYPT_MODE, key);
			BufferedReader lector = new BufferedReader(
					new InputStreamReader(new CipherInputStream(new FileInputStream("textoEncriptado.txt"), cifrador)));
			System.out.println(lector.readLine());
			lector.close();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
