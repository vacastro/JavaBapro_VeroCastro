package Modulo3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese un numero");
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if(numero %2 == 0) {
			System.out.println("Es un numero par");
		}else {
			System.out.println("es un numero impar");
		}
		

	}

}
