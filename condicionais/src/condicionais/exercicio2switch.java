package condicionais;

import java.util.Scanner;

public class exercicio2switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nomeDoColaborador = " ";
		String cargo= " ";
		int codigoDoCargoDoColaborador;
		float salario;
		
		System.out.println("Digite o nome do colaborador:");
		nomeDoColaborador = leia.nextLine();
		
		System.out.println("************");
		System.out.println("Cargos e Reajustes");
		System.out.println("************");
		System.out.println("1 - Gerente");
		System.out.println("2 - Vendedor");
		System.out.println("3 - Supervisor");
		System.out.println("4 - Motorista");
		System.out.println("5 - Estoquista");
		System.out.println("6 - Tecnico de TI");
		
		System.out.println("Digite o seu cargo: ");
		codigoDoCargoDoColaborador = leia.nextInt ();
		
		
		System.out.println("Digite o salário:");
		salario = leia.nextFloat();
		
		
		switch(codigoDoCargoDoColaborador) {
		case 1:
		cargo = "Gerente";
		salario = salario + (salario * 0.10f);
		break;
		
		case 2:
		    cargo = "Vendedor";
		    salario = salario * 1.07f;
		    break;

		case 3:
		    cargo = "Supervisor";
		    salario = salario * 1.09f;
		    break;

		case 4:
		    cargo = "Motorista";
		    salario = salario * 1.06f;
		    break;

		case 5:
		    cargo = "Estoquista";
		    salario = salario * 1.05f;
		    break;

		case 6:
		    cargo = "Tecnico de TI";
		    salario = salario * 1.08f;
		    break;
		    
		default:
			 System.out.println("Opcao inválida");
			 break;
		}
		
		System.out.println("Salario: " + salario);
		System.out.printf("Novo salario: R$ %.2f%n", salario);
		
		leia.close();
		
		}
	}
		
	