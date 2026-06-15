package operadores;

import java.util.Scanner;

public class exercicioteste {
	public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
	   float n1=5;
	   float n2=6;
	   float n3=7;
	   float n4=8;
	   float diferenca;
	   System.out.print("Digite o n1: ");
	   n1 = leia.nextFloat();
	   System.out.print("Digite o n2: ");
	   n2 = leia.nextFloat();
	   System.out.print("Digite o n3: ");
	   n3 = leia.nextFloat();
	   System.out.print("Digite o n4: ");
	   n4 = leia.nextFloat();
	   diferenca = (n1 * n2) - (n3 * n4);
	   System.out.println("Diferenca: " + diferenca);
	   
	   leia.close ();
		
		}
		
		

	}



