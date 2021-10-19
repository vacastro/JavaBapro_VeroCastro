package Modulo2;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Completar con el tipo de dato que corresponda, se debe tener en cuenta que la suma de 2 bytes
//		va a sobrepasar el byte.
		byte b=(byte)(Math.random()*Byte.MAX_VALUE);
		short s=(short)(Math.random()*Short.MAX_VALUE);
		int i = (int)(Math.random()*Integer.MAX_VALUE);
		long l= (long)(Math.random()*Long.MAX_VALUE);
		
		int sumabb= b+b;
		int sumabs=b+s;
		int sumabi= b+i;
		long sumaii=i+i;
		long sumasl=s+l;
		
		System.out.println("b= "+b);
		System.out.println("s= "+s);
		System.out.println("i= "+i);
		System.out.println("l= "+l);
		System.out.println("\n");
		
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
