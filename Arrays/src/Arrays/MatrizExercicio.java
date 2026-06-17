package Arrays;

import java.util.Scanner;

public class MatrizExercicio {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner (System.in);

	int matrizInteiros[][] = {
		                 	{1,2,3},
			                {4,5,6},
			                {7,8,9}
	                             };
	
	System.out.println("Diagonal Principal: ");
	int somaPrincipal = 0;
	for (int linha = 0; linha < matrizInteiros.length; linha ++) {
		System.out.println(matrizInteiros[linha][linha]);
		somaPrincipal += matrizInteiros[linha][linha];
	
	}
	System.out.println("Soma: " + somaPrincipal);
	
	
	

	System.out.println("Diagonal Secundaria: ");
	int somaSecundaria = 0;
	for (int linha = 0; linha < matrizInteiros.length; linha ++) {
		System.out.println(matrizInteiros[linha][2 -linha]);
		somaSecundaria += matrizInteiros[linha][2 - linha];
	
	}
	
	System.out.println("Soma: " + somaSecundaria);
	
	
	
	
	leia.close();
	
	}
	
	}



