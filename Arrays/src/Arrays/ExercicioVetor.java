package Arrays;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		int vetorNumeros [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
			
	     System.out.print("Digite o numero que deseja encontrar: ");
	     int numero = leia.nextInt ();
	     
	     boolean encontrou = false;
	     for (int contador = 0; contador < vetorNumeros.length; contador++) {
	     
	    	 if (vetorNumeros[contador] == numero) {
	    		 System.out.println("O numero " + numero + " esta localizado na posicao: " + contador);
	    		 encontrou = true;}
	     }
	    	 
	
		
		if (encontrou == false) 
			System.out.println("Nao foi encontrado");
		
		
		leia.close();
		
		}
		
			
		
	}
	
	
	
	
	
	



