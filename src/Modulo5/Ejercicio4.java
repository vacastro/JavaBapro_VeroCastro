package Modulo5;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ejer4 = "esto es una prueba de la case Spring";
		String sinB = ejer4.replace(" ", "");
		
		int cantidadVocales=0;
		int cantidadConsonantes=0;
		
		for(int i=0; i< sinB.length(); i++) {
			if(sinB.charAt(i)== 'a'||sinB.charAt(i)== 'e'||sinB.charAt(i)== 'i'||sinB.charAt(i)== 'o'||sinB.charAt(i)== 'u') {
				cantidadVocales=cantidadVocales+1;
			}else{
				cantidadConsonantes=cantidadConsonantes+1;
			}
		}
		
		System.out.println("la cantidad de vocales de la frase es: "+cantidadVocales);
		System.out.println("la cantidad de consantes de la frase es: "+cantidadConsonantes);

	}

}
