package AtividadePratica;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		ArrayList<String> produtos = new ArrayList<String>();
		ArrayList<Integer> quantidade = new ArrayList<Integer>();
		
		int opcao;
		do {
			System.out.println("1- Adicionar produto");
			System.out.println("2 - Atualizar quantidade");
			System.out.println("3- Listar produtos");
			System.out.println("0 - Sair");
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1: 
				leia.nextLine();
			System.out.println("Nome do produto");
			String produto = leia.nextLine();
			System.out.println("Quantidade");
			int qtd = leia.nextInt();
			produtos.add(produto);
			quantidade.add(qtd);
			break;
			
			case 2:
				leia.nextLine();

				System.out.println("Digite o nome do produto:");
				String nomeProduto = leia.nextLine();

				int indice = produtos.indexOf(nomeProduto);
				if(indice != -1) {

				    System.out.println("Nova quantidade:");
				    int novaQtd = leia.nextInt();

				    quantidade.set(indice, novaQtd);

				} else {

				    System.out.println("Produto não encontrado!");

				}			
				break;
			case 3: for(int i = 0; i < produtos.size(); i++) {
				System.out.println("Produto: " + produtos.get(i)
				+ ("  |   Quantidade: " + quantidade.get(i)));
			}
				break;
			case 0:
				System.out.println("Programa encerrado");
				break;
				default:
					System.out.println("Opcao invávilda");
			}
		} while(opcao !=0);
		

	}



}
