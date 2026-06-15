package operadores;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float mediafinal;
		System.out.print("Digite a nota 1: ");
		nota1 = leia.nextFloat ();
		System.out.print("Digite a nota 2: ");
		nota2 = leia.nextFloat ()
;				System.out.print("Digite a nota 3: ");
		nota3 = leia.nextFloat ();
				System.out.print("Digite a nota 4: ");
		nota4 = leia.nextFloat ();
		mediafinal = (nota1 + nota2 + nota3 + nota4) /4;
		System.out.println("media final" + mediafinal);
		
		
		leia.close ();
	}

}
