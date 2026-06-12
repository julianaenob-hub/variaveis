package operadores;

import java.util.Scanner;

public class relacionaisexemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
final double VALOR_MINIMO_FRETE_GRATIS = 150.00;
System.out.print("Digite o valor total da compra: R$");
double valorCompra = leia.nextDouble();

System.out.print("O cliente é prime?");
boolean isPrime = leia.nextBoolean ();

boolean ganhouFrete = valorCompra >= VALOR_MINIMO_FRETE_GRATIS;

System.out.println("Status do Pedido ---");
System.out.printf("Valor da compra:R$ %.2f", valorCompra);
System.out.printf("Cliente Prime? %b", isPrime);
System.out.printf("Frete Gratis? %b", ganhouFrete);
leia.close ();

	}

}
