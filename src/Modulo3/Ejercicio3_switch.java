package Modulo3;

import java.util.Scanner;

public class Ejercicio3_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese un mes del año en minuscula");

		Scanner sc = new Scanner(System.in);

		String mes = sc.nextLine();

		switch (mes) {

		case "abril":
		case "junio":
		case "septiembre":
		case "noviembre":
			System.out.println("el mes tiene 30 dias ");
			break;
		case "febrero":
			System.out.println("el mes tiene 28 dias");
			break;
		case "enero":
		case "marzo":
		case "mayo":
		case "julio":
		case "agosto":
		case "octubre":
		case "diciembre":

			System.out.println("el mes tiene 31 dias");
			break;
		default:
			System.out.println("lo ingresado no corresponde a un mes");

		}

	}

}
