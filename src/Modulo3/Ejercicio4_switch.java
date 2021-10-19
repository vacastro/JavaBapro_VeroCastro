package Modulo3;

import java.util.Scanner;

public class Ejercicio4_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese una categoria, puede ser: a, b, c");

		Scanner sc = new Scanner(System.in);

		String categoria = sc.next();

		switch (categoria) {
		case "a":
			System.out.println("hijo");
			break;
		case "b":
			System.out.println("padres");
			break;
		case "c":
			System.out.println("abuelos");
			break;
		default:
			System.out.println("no corresponde a una categoria");

		}

	}

}
