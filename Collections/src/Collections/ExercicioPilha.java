package Collections;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		
	
	Stack<String> pilha = new Stack<String>();
	int opcao;
	
	Scanner leia = new Scanner (System.in);
	 String nome = " ";
	
	do { 
		System.out.println("1 - Adicionar Livro");
		System.out.println("2 - Listar Livros");
		System.out.println("3 - Retirar Livro");
		System.out.println("0 - Sair");
		
		System.out.println("Digite uma opcao: ");
		opcao = leia.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Digite o nome do livro: ");
			leia.nextLine() ;
			nome = leia.nextLine ();
			pilha.push(nome);
			System.out.println("Livro Adicionado");
			break;
		case 2:
			System.out.println(pilha);
			break;
		case 3:
			if (pilha.isEmpty()) {
				System.out.println("A fila esta vazia");
			} else {
		    pilha.pop();
		    System.out.println("Livro Retirado");
			}
			break;
		case 0:
			System.out.println("Programa finalizado");
			break;
		}
		
	} while(opcao !=0);	
	
	
	leia.close();
	}


}
