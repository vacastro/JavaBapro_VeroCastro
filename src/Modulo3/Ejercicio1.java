package Modulo3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese la nota 1");
		Scanner sc = new Scanner(System.in);
		int nota1= sc.nextInt(); /// en caso de que se ingrese un float va nextFloat, etc...
		
		System.out.println("\n");
		System.out.println("Ingrese la nota 2");
		int nota2 = sc.nextInt();
		
		System.out.println("\n");
		System.out.println("Ingrese la nota 3");
		int nota3 = sc.nextInt();
		
		float promedio = (float) (nota1+nota2+nota3)/3; // aca necesita casteo porque al ser los 
		//parametros integer, la division la hace como integer y no me da el resultado con coma
		
		if (promedio >= 7) { 
			System.out.println("aprobado con "+ promedio);
		} else {
			System.out.println("desaprobado con "+promedio);
		}
			
		
		
		
		
		
		
		

	}

}
