package condicionais;

import java.util.Scanner;

public class exercicio1swich {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String produto = " ";
		int codigoDoProduto;
		int quantidade;
		double valorTotal = 0;
		
		System.out.println("************");
		System.out.println("Menu Lanchonete");
		System.out.println("************");
		System.out.println("1 - Cachorro Quente");
		System.out.println("2 - X-Salada");
		System.out.println("3 - X-Bacon");
		System.out.println("4 - Bauru");
		System.out.println("5 - Refrigerante");
		System.out.println("6 - Suco de Laranja");
		
		System.out.println("Escolha o numero do seu produto: ");
		codigoDoProduto = leia.nextInt ();
		
		System.out.println("Digite a quantidade:");
		quantidade = leia.nextInt();
		
		switch(codigoDoProduto) {
		case 1:
		produto = "Cachorro Quente";
		valorTotal = quantidade * 10.00;
		break;
		
		case 2:
		produto = "X Salada";
		valorTotal = quantidade * 15.00;
		break;
		
		case 3:
		produto = "X Bacon";
		valorTotal = quantidade * 18.00;
		break;
		
		case 4:
		produto = "Bauru";
		valorTotal = quantidade * 12.00;
		break;
		
		case 5:
		produto = "Refrigerante";
		valorTotal = quantidade * 8.00;
		break;
		
		case 6:
		produto = "Suco de laranja";
		valorTotal = quantidade * 13.00;
		break;
		
		default:
			 System.out.println("Opcao inválida");
			 break;
		}
		
		System.out.println("Produto: " + produto);
		System.out.printf("Valor total: R$ %.2f%n", valorTotal);
		
		leia.close();
		}
	}

		
		

	

		
