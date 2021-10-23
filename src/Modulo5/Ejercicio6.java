package Modulo5;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email ="gcasas1972@gmail.com";
		boolean contieneNumeros=false;
		
		for (int i=0; i< email.length(); i++) {
			if(Character.isDigit(email.charAt(i))) {
				contieneNumeros=true;
			}
		}
		
		System.out.println(contieneNumeros);

	}

}
