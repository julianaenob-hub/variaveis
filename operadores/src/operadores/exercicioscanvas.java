package operadores;

import java.util.Scanner;

public class exercicioscanvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float salario;
		float abono;
		float novoSalario;
		System.out.print("Digite o salario: ");
		salario = leia.nextFloat();
		System.out.print("Digite o abono: ");
		abono = leia.nextFloat();
		novoSalario = salario+abono;
		System.out.println("Novo salario: " + novoSalario);
		
		leia.close ();

	}

}
