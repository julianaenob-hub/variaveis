package lacoderepeticao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int pares = 0;
		int impares = 0;
	
		
		for (int contador = 1; contador <=10; contador ++) {
			
			System.out.print("Digite o " + contador + " numero: ");
		numero = leia.nextInt();
		
		if (numero %2 == 0) {
			pares++;
		} else {
		} impares++;
		

	}

	System.out.println("\nTotal de numeros pares: " + pares);	
	System.out.println("\nTotal de numeros impares: " + impares);
	
		
		
		
		
		leia.close();
	}
}


