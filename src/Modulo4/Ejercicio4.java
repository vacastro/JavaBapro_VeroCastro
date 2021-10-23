package Modulo4;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte numeros []= new byte [10];
		int i= 1;
		
		float suma =0;
		
		System.out.println("Los numeros al azar son : ");
		while (i<numeros.length) {
			numeros [i]=(byte)(Math.random()*100%10);
			suma = suma + numeros[i];
			i++;
		}
		System.out.println(Arrays.toString(numeros));
		System.out.println("la suma de todos los numeros al azar es: "+suma);
		System.out.println("el promedio de todos los numeros al azar es: "+(suma/10));

	}

}
