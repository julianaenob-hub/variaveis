package AtividadePratica;

import java.util.ArrayList;

public class Exercicio1 {
	
	public static int somarNumeros(ArrayList<Integer> numeros) {	
		int soma = 0;

		for (int numero : numeros) {
			soma += numero;
		}
	
	return soma;
	}
	
	public static double calcularMedia(ArrayList<Integer> numeros) {
		
		int soma = somarNumeros(numeros);
		return (double) soma / numeros.size();
	}
	public static int maiorNumero(ArrayList<Integer> numeros) {
		int maior = numeros.get (0);
		for(int numero : numeros) {
			if (numero > maior) {
				maior = numero;
			}
		}
	return maior;
	}
	public static void main(String[] args) {
	
		ArrayList<Integer> numeros = new ArrayList<Integer>();		
		
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		
		System.out.println("Colecao: " + numeros);
		System.out.println("Media: " + calcularMedia(numeros));
		
		for (int numero : numeros) {
			System.out.println(numero);
		}
			System.out.println("Soma: " + somarNumeros(numeros));
			System.out.println("Media: " + calcularMedia(numeros));
			System.out.println("Maior: " + maiorNumero(numeros));
			
		}
	}


