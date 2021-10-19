package Modulo3;

import java.util.Scanner;

public class Ejercicio3_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese un mes del año en minuscula");

		Scanner sc = new Scanner(System.in);

		String mes = sc.nextLine();
		
		if(mes.equals("enero")||mes.equals("marzo")||mes.equals("mayo")||mes.equals("julio")||mes.equals("agosto")||mes.equals("octubre")||mes.equals("diciembre")) {
			System.out.println("el mes tiene 31 dias");
		} else if (mes.equals("abril")||mes.equals("junio")||mes.equals("septiembre")||mes.equals("noviembre")) {
			System.out.println("el mes tiene 30 dias");
		}else if (mes.equals("febrero")) {
			System.out.println("el mes tiene 28 dias");
		} else {
			System.out.println("lo ingresado no corresponde a un mes");
		}

	}

}
