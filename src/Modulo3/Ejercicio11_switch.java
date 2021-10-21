package Modulo3;

import java.util.Scanner;

public class Ejercicio11_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese una letra");

		Scanner sc = new Scanner(System.in);
		String texto = sc.next();
		char caracter = texto.charAt(0);

		switch (caracter) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("el caracter ingresado es una vocal");
			break;
		default:
			System.out.println("El caracter ingresado es una consonante");

		}

	}

}
