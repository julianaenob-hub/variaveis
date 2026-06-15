package operadores;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;

		System.out.print("Digite o salario bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.print("Digite o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.print("Digite as horas extras: ");
		horasExtras = leia.nextFloat();
		System.out.print("Digite os descontos: ");
		descontos = leia.nextFloat();
		salarioLiquido = salarioBruto+adicionalNoturno+horasExtras-descontos;
		System.out.println("salario liquido: " + salarioLiquido);
		
		leia.close ();
		
		
	}

}
