package Modulo4;

public class EjercicioDeClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loteria[]= new int [100];
		for (int i=0; i< 100; i++)
			loteria [i]= (int)(Math.random()*1000%100);
		
//		System.out.println("os 100 numeros son ");
//		for (int i=0; i<100; i++)
//			System.out.println("loteria " +i +" = "+ loteria[i]);
		
		char teclado [][]= {{'1','2','3','A'},
							{'4','5','6','B'},
							{'7','8','9','C'},
							{'*','0','#','D'},
		};
		
		System.out.println("ahora voy a mostrar el teclado");
		System.out.println("cantidad de filas "+ teclado.length);
		System.out.println("cantidad de columnas "+ teclado[0].length);
		System.out.println("\nMostrar el teclado completo\n");
		for (int fila=0; fila<teclado.length; fila++) {
			for (int col =0; col < teclado[fila].length; col++) 
				System.out.print("teclado [ " + fila + "]="+ teclado[fila][col]+ " , ");
			System.out.println();
			
		}
				
		
	}

}
