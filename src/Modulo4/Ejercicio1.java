package Modulo4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese un numero para conocer la tabla de multiplicar");
		
		Scanner sc = new Scanner (System.in);
		
		int tablaDel = sc.nextInt();
		
		String [] values = new String [11];
		for (int i=0; i<values.length;i++) {
			values[i]=(tablaDel +"x"+ tablaDel + "="+ (i*tablaDel));
			
		}
		System.out.println("Tabla del " + tablaDel+" : " + Arrays.toString(values));
		
		
			
		
		
		
				
		
};
		

	}


