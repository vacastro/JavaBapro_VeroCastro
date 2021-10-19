package Modulo3;

import java.util.Scanner;

public class Ejercicio5_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese el puesto del torneo");
		
		Scanner sc = new Scanner(System.in);
		
		int puesto = sc.nextInt();
		
		if (puesto == 1) {
			System.out.println("Obtiene la medalla de oro");
		} else if (puesto == 2) {
			System.out.println("Obtiene la medalla de plata");
		} else if (puesto == 3) {
			System.out.println("Obtiene la medalla de bronce");
		}else {
			System.out.println("Siga participando");
		}

	}

}
