package condicionais;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
 Scanner leia = new Scanner(System.in);
		 
		 String nome;
		 int faixaEtaria;
		 
		 System.out.println("Digite o seu nome: ");
		 nome = leia.next();
		 
		
		 System.out.println("**************");
		 System.out.println("FAIXA ETARIA");
		 System.out.println("**************");
		 System.out.println("               ");
		 System.out.println("1 - De o a 10 anos de idade");
		 System.out.println("2 - De 11 a 29 anos de idade");
		 System.out.println("3 - De 30 a 45 anos de idade");
		 System.out.println("4 - De 46 a 59 anos de idade");
		 System.out.println("5 - De 60 a 65 anos de idade");
		 System.out.println( "6 - Maiores de 65 anos*");
		 System.out.println("**************");
		 System.out.println("**************");
		 
		 
		 System.out.println("Escolha a sua faixa etaria: ");
		 faixaEtaria = leia.nextInt ();
		 
		 System.out.printf("Nome: %s\n", nome);
		 
		 switch(faixaEtaria) {
		 case 1:System.out.println("a mensalidade do plano é 100,00");
			 
		 break;
		 case 2:System.out.println(" mensalidade do plano é 200,00");
			 
			 
		 break;
		 case 3:System.out.println(" mensalidade do plano é 300,00");
				 
				 
		break;
		 case 4:System.out.println(" mensalidade do plano é 500,00");
					 
					 
		break;
		 case 5: System.out.println(" mensalidade do plano é 600,00");
						 
						 
		 break;
		 case 6:System.out.println( " mensalidade do plano é 1000,00");
		 
		 default:
			 System.out.println("Opcao inválida");
							 
							 
		 }
		 
		 
		 
		 
		 leia.close();
		

	}

}
