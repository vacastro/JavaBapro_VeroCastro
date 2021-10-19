package Modulo3;

import java.util.Scanner;

public class Ejercicio6_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese en que curso esta");
		
		Scanner sc= new Scanner(System.in);
		
		int curso = sc.nextInt();
		
		switch (curso) {
		case 0:
			System.out.println("Esta en jardin de infantes");
			break;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Esta en primaria");
			break;
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("Esta en secundaria");
			break;
			default:
				System.out.println("no corresponde a ningun curso");
			
		}

	}

}
