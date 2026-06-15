package condicionais;

import java.util.Scanner;

public class exercicio2condicionais {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite seu nome: ");
		String nome = leia.nextLine ();
		
		System.out.println("Digite sua idade: ");
		int idade = leia.nextInt();
		
		
		System.out.println("Primeira doacao de sangue? true/false: ");
		boolean primeiraVezDoandoSangue = leia.nextBoolean();
		
		if (idade >= 18 && idade < 60) {

	}
		else if (idade >=60 && idade <= 69 && !primeiraVezDoandoSangue) {
			
		} else {
		}
		
		if (idade >= 18 && idade < 60) {
		    System.out.println(nome + " está apto para doar sangue!");
		}
		else if (idade >= 60 && idade <= 69 && !primeiraVezDoandoSangue) {
		    System.out.println(nome + " está apto para doar sangue!");
		}
		else {
		    System.out.println(nome + " não está apto para doar sangue!");
		}
		leia.close();
		}

}
