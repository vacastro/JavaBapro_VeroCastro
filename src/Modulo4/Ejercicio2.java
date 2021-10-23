package Modulo4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Ingrese un numero para conocer la tabla de multiplicar");
		
		Scanner sc = new Scanner (System.in);
		
		int tablaDel = sc.nextInt();
		
		int [] values = new int [11];
		int sumaDeValoresPares = 0;
		for (int i=0; i<values.length;i++) {
			values[i]=i*tablaDel;
			if (values[i]%2==0) {
				sumaDeValoresPares= sumaDeValoresPares +values[i];
			}
			
		}
		System.out.println("Tabla del " + tablaDel+" : " + Arrays.toString(values));
		
		System.out.println("Suma de todos sus valores pares es :"+ sumaDeValoresPares);

	}

}
