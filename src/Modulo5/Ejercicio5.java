package Modulo5;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email = "gcasas1972@gmail.com";
		
		int posicion= email.indexOf('@')+1;
		
		System.out.println("la posicion del @ es: " +posicion);
		
		String subS1= email.substring(0, email.indexOf('@'));
		String subS2= email.substring(posicion);
		
		System.out.println(subS1);
		System.out.println(subS2);

	}

}
