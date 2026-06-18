package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ColllectionFila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Thiago");
		fila.add("Guilherme");
		fila.add("Higor");
		fila.add("Sara");
		fila.add("Bella");
		
		System.out.println("Digite o nome: ");
		fila.add(leia.next());
		
		for(var cliente: fila) {
			System.out.println(cliente);
			
		}
	}

	}
