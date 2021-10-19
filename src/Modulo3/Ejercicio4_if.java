package Modulo3;

import java.util.Scanner;

public class Ejercicio4_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese una categoria, puede ser: a, b, c");

		Scanner sc = new Scanner(System.in);

		String categoria = sc.next();
		
		if (categoria.equals("a")) {
			System.out.println("hijo");
		}else if (categoria.equals("b")) {
			System.out.println("padres");
		}else if (categoria.equals("c")) {
			System.out.println("abuelos");
		}else {
			System.out.println("no corresponde a una categoria");
		}

	}

}
