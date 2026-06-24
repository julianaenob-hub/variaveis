package aula_exceptions;

import java.util.Scanner;

public class ChecaIdade {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade;
		
		try {
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		validarIdade(idade);
		}catch(DriveException error) {
			System.err.println("erro: " + error);
			System.err.println("nao pode dirigir");
		}
	}

	public static void validarIdade(int idade) throws DriveException{
		
		if(idade >= 18)
			System.out.println("A Pessoa pode dirigir!!");
	
		else
			throw new DriveException();
	}

}
