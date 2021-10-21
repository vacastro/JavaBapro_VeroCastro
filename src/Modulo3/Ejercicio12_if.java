package Modulo3;

import java.util.Scanner;

public class Ejercicio12_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese un numero entero");
		
		Scanner sc= new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if (numero >= 1 && numero <=12) {
			System.out.println("el numero "+ numero +" corresponde a la primera docena de numeros");
		} else if (numero >= 13 && numero <=24) {
			System.out.println("el numero "+ numero + " corresponde a la segunda docena de numeros");
		}else if (numero >= 25 && numero <=32) {
			System.out.println("el numero "+ numero + " corresponde a la tercera docena de numeros");
		}else if (numero < 1 || numero >32) {
			System.out.println("el numero "+ numero + " esta fuera del rango");
		}

	}

}
