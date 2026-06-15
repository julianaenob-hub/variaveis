package condicionais;

import java.util.Scanner;

public class condicionais1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner leia = new Scanner(System.in);

		    System.out.println("Digite um número inteiro: ");
		    int numero = leia.nextInt();

		    if(numero > 10 && numero < 100) {
		        System.out.println("O número digitado é maior do que 10!");
		    }

		    System.out.println("*** Fim do Programa ****");

		    leia.close();

		}

	}


