package Modulo5;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese su nombre");
		Scanner sc = new Scanner (System.in);
		
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese su apellido");
		
		String apellido = sc.nextLine();
		
		String nombreCompleto= nombre + " "+ apellido;
		System.out.println("Su nombre completo es: "+nombreCompleto);

	}

}
