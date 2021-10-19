
package Modulo2;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Crear una clase identificada como Mod2_Ejercicio3.java dentro del paquete modulo2, en dicha
//clase realizar un programa que permita alojar en variables la siguiente información utilizando el
//tipo de dato que ocupe la menor cantidad de memoria posible, para ello en el programa se debe
//utilizar una variable asignándole un valor y luego imprimirlo por ejemplo short
//cantidadDePaises=193, puesto que el byte no alcanza. 
//		a. Tipo de división ‘a’,’b’ o ‘c’.
//		b. Cantidad de goles por partido de futbol.
//		c. La capacidad de la cancha por ejemplo river (70.000 personas).
//		d. Promedio de goles.
		
		char tipoDeDivision;
		byte cantidadGolesXPartido;
		int capacidadCancha;
		float promedioGoles;

	tipoDeDivision= 'a';
	System.out.println("Tipo de division: " +tipoDeDivision);
	
	cantidadGolesXPartido=8;
	System.out.println("Cantidad de Goles por Partido: "+cantidadGolesXPartido);
	
	capacidadCancha = 70000;
	System.out.println("Capacidad de la Cancha: "+capacidadCancha);
	
	promedioGoles = 4;
	System.out.println("Promedio de Goles: "+promedioGoles);

	}

}
