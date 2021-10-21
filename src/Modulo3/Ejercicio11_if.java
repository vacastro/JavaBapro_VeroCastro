package Modulo3;

import java.util.Scanner;

public class Ejercicio11_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Ingrese una letra");
		
		Scanner sc =new Scanner (System.in);
		String texto = sc.next();
		char caracter =texto.charAt(0);
		
		
		if(caracter == 'a'||caracter == 'e'||caracter == 'i'||caracter == 'o'||caracter == 'u') {
			System.out.println(" el caracter ingresado es una vocal");
		}else {
			System.out.println("el caracter ingresado es una consonante");
		}
		
	}

}
