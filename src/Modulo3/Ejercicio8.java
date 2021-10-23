package Modulo3;

import java.util.Scanner;



public class Ejercicio8 {
	
		static int piedra = 0;
		static int papel = 1;
		static int tijera = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Jugador 1: Ingrese su jugada, siendo 0 = piedra, 1 = papel y 2 = tijera ");
		
		Scanner sc = new Scanner (System.in);

		int jugada1 = sc.nextInt();
		
		System.out.println("Jugador 2: Ingrese su jugada, siendo 0 = piedra, 1 = papel y 2 = tijera ");
		
		int jugada2= sc.nextInt();
	
		String listaJugadas[]= {"piedra","papel","tijera"};
		
		if ((jugada1 == piedra && jugada2 == tijera)|| (jugada1 == papel && jugada2 == piedra )||(jugada1 == tijera && jugada2 == papel) ) {
			System.out.println("el jugador ganador es el jugador 1 porque " + listaJugadas[jugada1] + " mata a " + listaJugadas[jugada2]);
			
		}else if ((jugada2 == piedra && jugada1 == tijera)|| (jugada2 == papel && jugada1 == piedra )||(jugada2 == tijera && jugada1 == papel)) {
			System.out.println("el jugador ganador es el jugador 2 porque "+ listaJugadas[jugada2] + " mata a " + listaJugadas[jugada1]);
		} else if (jugada1 == jugada2) {
			System.out.println("empate porque ambos jugadores eligieron "+ listaJugadas[jugada2]);
		}else {
			System.out.println("la jugada seleccionada no existe");
		}
		
	}
}
