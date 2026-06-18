package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class colllectionPilha {

	public static void main(String[] args) {
		
		Deque<String> pilha = new ArrayDeque<String>();
		
		pilha.push("Azul");
		pilha.push("Verde");
		pilha.push("Amarelo");
		pilha.push("Branco");
		pilha.push("Laranja");
		
		
		//pra tirar o ultimo elemento da fila
		pilha.pop(); 
		
		//checar se esta na pilha
		System.out.println("A cor Azul ainda esta na pilha? " + pilha.contains("Azul"));
		
		for(var cor : pilha) {
			System.out.println(cor);
		}
		
		

	}

}
