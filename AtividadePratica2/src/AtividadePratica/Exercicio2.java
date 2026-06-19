package AtividadePratica;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio2 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
ArrayList<String> alunos = new ArrayList<String>();
ArrayList<Integer> idades = new ArrayList<Integer>();
ArrayList<Double> notas = new ArrayList<Double>();

System.out.println("Quantos alunos deseja cadastrar?");
int quantidade = leia.nextInt();
leia.nextLine();

for (int i = 0; i < quantidade; i++) {
	System.out.println("Digite o nome: ");
	String nome = leia.nextLine();

	System.out.println("Digite a idade: ");
	Integer idade = leia.nextInt();

	System.out.println("Digite as notas: ");
	Double nota = leia.nextDouble();
	
	leia.nextLine ();

alunos.add(nome);
idades.add(idade);
notas.add(nota); 


}

for (int i = 0; i< alunos.size(); i++) {
	System.out.println("Nome: " + alunos.get(i));
	System.out.println("Idad: " + idades.get(i));
	System.out.println("Nota: " + notas.get(i));
	System.out.println("------------------------");
}

double soma = 0;
for (int i = 0; i <notas.size(); i++) {
	soma += notas.get(i);
}
	double media = soma / notas.size();
	System.out.println("Media Geral: " + media);
}

	}


