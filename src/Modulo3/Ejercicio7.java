package Modulo3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese un numero entero");
		Scanner sc = new Scanner (System.in);
		
		int num1= sc.nextInt();
		System.out.println("\n");
		System.out.println("Ingrese el siguiente numero entero");
		int num2 = sc.nextInt();
		System.out.println("\n");
		System.out.println("Ingrese el ultimo numero entero");
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("El mayor es el numero uno porque su valor es "+num1);
		} else if (num2>num3 && num2 > num1) {
			System.out.println("El mayor es el numero dos porque su valor es "+num2);
		} else {
			System.out.println("El mayor es el numero tres porque su valor es "+num3);
		}
		

	}

}
