import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = leia.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = leia.nextInt();
		
		if (idade >= 18 ) {
			System.out.println("Acesso liberado para " + nome);
			
		} else
			System.out.println("Possui Autorizacao dos Responsaveis? true/false: ");
		boolean autorizacaoDosResponsaveis = leia.nextBoolean();
		
		
		if (autorizacaoDosResponsaveis) {
			System.out.println("Acesso liberado somente com autorizacao para: " + nome);
		} else { 
			System.out.println("Acesso negado para: " + nome);
				
		}
		
			
		leia.close();
		
		
		

	}

}
