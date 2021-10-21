package Modulo3;

import java.util.Scanner;

public class Ejercicio15_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingresar que tipo de coche quiere. Pudiendo ser la opcion a , b o c ");
		
		Scanner sc = new Scanner(System.in);
		String texto = sc.next();
		char coche = texto.charAt(0);
		
		String cocheA = "tiene 4 ruedas + un motor ";
		String cocheB = cocheA + "+ cierre centralizado + aire ";
		String cocheC = cocheB + "+ airbag.";
		
		switch (coche) {
		case 'a':
			System.out.println("Usted eligio el coche que " + cocheA);
			break;
		case 'b':
			System.out.println("Usted eligio el coche que " + cocheB);
			break;
		case 'c':
			System.out.println("Usted eligio el coche que " + cocheC);
			break;
			default:
				System.out.println("el coche que quiere no esta disponible");
		}
		

	}

}
