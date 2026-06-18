package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioArrayList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		
		for(int i = 0; i< 5; i++) {
			System.out.println("Digite uma cor: ");
			cores.add(leia.nextLine());
		}
		
	System.out.println("\nListar todas as cores: ");
	
	for(String cor : cores) {
		System.out.println(cor);
		
	}
	
	Collections.sort(cores);
	System.out.println("\n Ordenar as cores: ");

	for(String cor : cores) {
		System.out.println(cor);
	}

	leia.close();	
	}

}
