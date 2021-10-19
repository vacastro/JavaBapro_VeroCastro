package Modulo3;

import java.util.Scanner;

public class Ejercicio6_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Ingrese en que curso esta");
		
		Scanner sc= new Scanner(System.in);
		
		int curso = sc.nextInt();
		
		if (curso == 0) {
			System.out.println("Esta en jardin de infantes");
		} else if (curso >=1 && curso <=6) {
			System.out.println("Esta en primaria");
		}else if (curso >=7 && curso <=12) {
			System.out.println("Esta en secundaria");
		}else {
			System.out.println("no corresponde a ningun curso");
		}

	}

}
