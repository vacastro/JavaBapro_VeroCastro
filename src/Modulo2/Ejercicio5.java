package Modulo2;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Cual de las siguientes líneas dan errores de compilación y para esos casos cubrirlos con el casteo
//		 correspondiente, asignándole un valor a las variables por ejemplo short s=25; int I = 1200,
//		 finalmente se deberán imprimir en pantalla.
		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 9223372036854775807L;
		
		b = (byte) s; // Da error - perdida de precision
		System.out.println(b);
		
		l = i;
		System.out.println(l);

		b = (byte)i; // Da error - perdida de precision
		System.out.println(b);
		
		s = (short)i;// Da error - perdida de precision
		System.out.println(s);

	}

}
