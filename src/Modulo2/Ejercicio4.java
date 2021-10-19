package Modulo2;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Completar con el tipo de dato que corresponda, se debe tener en cuenta que la suma de 2 bytes
//		va a sobrepasar el byte.
		byte b=10;
		short s=20;
		int i = 30;
		long l= 40;
		
		short sumabb=(short) (b+b);
		int sumabs=(int)(b+s);
		long sumabi= (long)(b+i);
		long sumaii=(long)(i+i);
		long sumasl=(s+l);
		
		System.out.println("sumabb: " + sumabb);
		System.out.println("sumabs: " + sumabs);
		System.out.println("sumabi: " + sumabi);
		System.out.println("sumaii: " + sumaii);
		System.out.println("sumasl: " + sumasl);




		
		//CASTEO
		System.out.println("\n");
		b = 34;
		s= b;
		i= 1357;
		b= (byte)i;// vos te haces resposable porque el numero puede perder precision
		s= (short)i; 
				
		System.out.println("i: "+i);
		System.out.println("b: "+b);// corta al numero en 8 bits y se pierde el resto
		System.out.println("s: "+s);


	}

}
