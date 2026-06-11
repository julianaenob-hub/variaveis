package variaveis;



import java.util.Scanner;

public class variaveis {


    public static void main(String[] args) {
    	
    	// TODO Auto-generated method stub

        Scanner leia = new Scanner(System.in);

        int numero1 = 10;
        int numero2 = 5;
        float numero3, numero4;

        System.out.println("Variável numero1 = " + numero1);
        System.out.println("Variável numero2 = " + numero2);
        System.out.printf("%d + %d = %d\n", numero1, numero2, numero1 + numero2);

        System.out.print("Digite o primeiro valor real: ");
        numero3 = leia.nextFloat();

        System.out.print("\nDigite o segundo valor real: ");
        numero4 = leia.nextFloat();

        System.out.printf("%.2f * %.0f = %f", numero3, numero4, numero3 * numero4);

    }
    }


