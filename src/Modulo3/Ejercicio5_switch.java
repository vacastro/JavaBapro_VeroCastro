package Modulo3;

import java.util.Scanner;

public class Ejercicio5_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese el puesto del torneo");

		Scanner sc = new Scanner(System.in);

		int puesto = sc.nextInt();

		switch (puesto) {
		case 1:
			System.out.println("Obtiene la medalla de oro");
			break;
		case 2:
			System.out.println("Obtiene la medalla de plata");
			break;
		case 3:
			System.out.println("Obtiene la medalla de bronce");
			break;
		default:
			System.out.println("Siga participando");
		}

	}

}
