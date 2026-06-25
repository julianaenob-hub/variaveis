package optionall;

import java.util.Optional;

public class exemplo02 {

	public static void main(String[] args) {
		
		
		String frases [] = new String [5];
		
		frases[2] = "Generation Brasil";
		
		for(var frase : frases) {
			System.out.println(frase);
		}

		//Optional Vazio
		Optional<String> optionalVazio = Optional.empty();
		System.out.println("Exibir o valor de optionalVazio" + optionalVazio);
		System.out.println("O optionalVazio esta vazio?" + optionalVazio.isEmpty());
		
		//Optional com dados
		Optional<String> valorIndice2 = Optional.of(frases[2]);
		System.out.println("Exibir o valor de valorIndice2" + optionalVazio.isEmpty());
		System.out.println("O valorIndice2 tem alguma coisa? " + valorIndice2.isPresent());
		System.out.println("Qual é o valor armazenado em valorIndice? " + valorIndice2.get());
	}

}
