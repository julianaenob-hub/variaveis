package condicionais;

import java.util.Scanner;

public class exemplocondicionais {
	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 
		 String nome;
		 int idade;
		 
		 System.out.println("Digite o seu nome: ");
		 nome = leia.next();
		 
		 System.out.println("Digite a sua idade: ");
		 idade = leia.nextInt();
		 
		 /**
		  * 0 - 10 = 100,00
		  * 11 - 29 = 200,00
		  * 30 - 45 = 300,00
		  * 46 - 59 = 500,00
		  * 60 - 65 = 600,00
		  * Acima 65 = 1000,00
		  */
		 
		 System.out.printf("Nome: %s\n", nome);
	
		if(idade > 0 && idade <=10) {
			System.out.println("A mensalidade do plano é 100,00");
		
		} else if (idade > 11 && idade <=29) {
			System.out.println("A mensalidade do plano é 200,00");
			
		} else if (idade > 30 && idade <=45) {
			System.out.println("A mensalidade do plano é 300,00");
	    
		} else if (idade > 46 && idade <=59) {
			System.out.println("A mensalidade do plano é 500,00");
	    
		} else if (idade > 59 && idade <=65) {
			System.out.println("A mensalidade do plano é 600,00");
		} else {
			System.out.println("A mensalidade do plano é 1.000,00");
		}
		
		
		leia.close();
	}
}
