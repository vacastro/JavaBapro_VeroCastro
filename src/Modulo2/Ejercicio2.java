package Modulo2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		byte bmin = -128;
		byte bmax = 127;
		// reemplazar el 0 por el valor que corresponda en todos los caso
		short smin = Short.MIN_VALUE;
		short smax = Short.MAX_VALUE;
		int imax = Integer.MAX_VALUE;
		int imin = Integer.MIN_VALUE;
		long lmin = Long.MIN_VALUE;
		long lmax = Long.MAX_VALUE;
		System.out.println("tipo\t\tminimo\t\t\tmaximo");
		System.out.println("....\t\t......\t\t\t......");
		System.out.println("\nbyte\t\t" + bmin + "\t\t\t" + bmax);
		System.out.println("\nshort\t\t" + smin + "\t\t\t" + smax);
		System.out.println("\nint\t\t" + imin + "\t\t" + imax);
		System.out.println("\nlong\t\t" + lmin + "\t" + lmax);
	}

}
