import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int numero1 = leia.nextInt();

		System.out.println("Digite o segundo numero: ");
		int numero2 = leia.nextInt();
		
		System.out.println("Digite a operacao: 1- Soma, 2- Subtracao, 3- Multiplicacao, 4 - Divisao");
		int operacao = leia.nextInt(); 
		
		if (operacao == 1) {
			System.out.println("Operacao: Soma Resultado: " + (numero1 + numero2));
		} else if (operacao == 2) {
			System.out.println("Operacao: Subtracao Resultado: " + (numero1 - numero2));
		} else if (operacao == 3) {
			System.out.println("Operacao: Multiplicacao Resultado: " + (numero1 * numero2));
		} else if (operacao == 4 ) {
			if (numero2 !=0) {
				System.out.println("Operacao: Divisao Resultado: " + (numero1 / numero2));
			} else {
				System.out.println("Erro: nao e possivel dividir por zero ");
			}
		} else {
			System.out.println("Codigo de operacao invalido");
			}
			
			
		
		

		leia.close();
	}

}
