import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = leia.nextLine ();
		
		System.out.println("Digite sua nota final: ");
		int notaFinal = leia.nextInt ();
		
		if (notaFinal >= 7) {
			System.out.println("Aluno: " + nome + " Situacao: Aprovado (a)");
			
		} else {
			
		}
		if (notaFinal >=5 && notaFinal <7) {
			System.out.println("Aluno: " + nome + " Situacao: Recuperacao");
		}
		else if (notaFinal <5) {
			System.out.println("Aluno: " + nome + " Situacao: Reprovado, melhore");
		}
		 leia.close();

	}

}
