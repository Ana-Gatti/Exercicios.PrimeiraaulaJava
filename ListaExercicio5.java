/* Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.*/

package br.com.generation.aula01;

//importando biblioteca
import java.util.Scanner;


public class ListaExercicio5 {
	
	public static void main(String[] args) {
		
		// informando que o comando leia dever� ser escaneado
		Scanner leia = new Scanner(System.in);
		
		
		// declarando vari�veis
		
		double nota1, nota2, nota3, media, notaPeso, peso = 10;
		
		
		//solicitando informa��es 
		System.out.println("Valor Nota 1: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Valor Nota 2: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Valor Nota 3: ");
		nota3 = leia.nextDouble();
	
		
		//calculos
		notaPeso = (nota1 * 2) + (nota2 * 3) + (nota3 * 5);
		media = notaPeso / peso;
		
		
		//sa�da
		System.out.println("A m�dia de notas � de: " +media);
		
		
		//encerrando a fun��o leia
		leia.close();
		
	}

}
