package Modulo4;

import java.util.Arrays;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO . Realizar dos ciclos for anidados de manera de mostrar todas las tablas

		System.out.println("Este programa muestra todas las tablas del 1 al 10");
		
		
		String resultado;
		
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) {
				resultado= i +"*"+j+"="+(i*j);
				System.out.println(resultado);
			}
			
			
		}
		
	}

}
