package operadores;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
double numero1, numero2;
System.out.println("Calculadora Basica");
System.out.print("digite o primeiro numero");
numero1 = leia.nextDouble();

System.out.print("digite o segundo numero");Double();
numero2 = leia.nextDouble();

System.out.printf("\n %2.f + , %.2f = %.2f", numero1, numero2, numero1 + numero2);

leia.close();


	}

}
