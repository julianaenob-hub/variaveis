package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		
	
	Queue<String> fila = new LinkedList<String>();
	int opcao;
	
	Scanner leia = new Scanner (System.in);
	 String nome = " ";
	
	do { 
		System.out.println("1 - Adicionar Cliente");
		System.out.println("2 - Listar Clientes");
		System.out.println("3 - Retirar Cliente");
		System.out.println("0 - Sair");
		
		System.out.println("Digite uma opcao: ");
		opcao = leia.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Digite o seu nome|: ");
			leia.nextLine() ;
			nome = leia.nextLine ();
			fila.add(nome);
			System.out.println("Cliente Adicionado");
			break;
		case 2:
			System.out.println(fila);
			break;
		case 3:
			if (fila.isEmpty()) {
				System.out.println("A fila esta vazia");
			} else {
		    fila.poll();
		    System.out.println("Cliente Retirado");
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
