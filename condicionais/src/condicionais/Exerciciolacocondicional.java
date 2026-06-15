package condicionais;

import java.util.Scanner;

public class Exerciciolacocondicional {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
System.out.println("Digite um número: ");
int numero = leia.nextInt ();
if (numero % 2 == 0) {
	if (numero >=0) {
		System.out.println("O Número: " + numero + " é par e positivo");
	} else {
		System.out.println("O Número: " + numero + " é par e negativo");
	}

} else {
	if (numero >=0) {
		System.out.println("O Número: " + numero + " é impar e positivo");
	}else {
		System.out.println("O Numero: " + numero + " é impar e negativo");
	}
}
		
		System.out.println("Fim do programa");
	
		leia.close();
	
	}
}
	

