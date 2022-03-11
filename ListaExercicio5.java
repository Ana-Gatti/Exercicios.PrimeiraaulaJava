/* Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/

package br.com.generation.aula01;

//importando biblioteca
import java.util.Scanner;


public class ListaExercicio5 {
	
	public static void main(String[] args) {
		
		// informando que o comando leia deverá ser escaneado
		Scanner leia = new Scanner(System.in);
		
		
		// declarando variáveis
		
		double nota1, nota2, nota3, media, notaPeso, peso = 10;
		
		
		//solicitando informações 
		System.out.println("Valor Nota 1: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Valor Nota 2: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Valor Nota 3: ");
		nota3 = leia.nextDouble();
	
		
		//calculos
		notaPeso = (nota1 * 2) + (nota2 * 3) + (nota3 * 5);
		media = notaPeso / peso;
		
		
		//saída
		System.out.println("A média de notas é de: " +media);
		
		
		//encerrando a função leia
		leia.close();
		
	}

}
