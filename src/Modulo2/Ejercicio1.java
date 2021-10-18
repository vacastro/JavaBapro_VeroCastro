package Modulo2;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Post incremento

		int i = 6;
		int j = i++;

		System.out.println("POST INCREMENTO- EJEMPLO");
		System.out.println("i: " + i);
		System.out.println("j: " + j);

		System.out.println("\n");
		// Pre incremento

		int a = 6;
		int b = ++a;

		System.out.println("PRE INCREMENTO- EJEMPLO");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		System.out.println("\n");

		// Post decremento

		int c = 6;
		int d = c--;

		System.out.println("POST DECREMENTO- EJEMPLO");
		System.out.println("c: " + c);
		System.out.println("d: " + d);

		System.out.println("\n");

		// Pre decremento

		int e = 6;
		int f = --e;

		System.out.println("PRE DECREMENTO- EJEMPLO");
		System.out.println("e: " + e);
		System.out.println("f: " + f);

		System.out.println("\n");

		// EJEMPLO PRACTICO DE EXAMEN

		System.out.println("EJEMPLO DE EXAMEN DE CERTIFICACION");

		int y = 0;
		int z = ++y;

		System.out.println("y: " + y);
		System.out.println("z: " + z);

		System.out.println("ahora si los quiero ver");
		// hasta aca y= 1

		System.out.println(y++ + "-" + ++y);
		// Opciones
		// a) 2 - 3
		// b) 1 - 2
		// c) 1 - 3 *** esta es la respuesta correcta
		// d) ninguna de las anteriores

	}

}
