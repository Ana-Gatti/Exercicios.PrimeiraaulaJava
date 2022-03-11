/*Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o: D = R+S/2, onde R=(A +3)� S-(B+C)� */

package br.com.generation.aula01;

//importando biblioteca
import java.util.Scanner;

public class ListaExercicio4 {
	
	public static void main(String[] args) {
		
		// informando que o comando leia dever� ser escaneado
		Scanner leia = new Scanner(System.in);
		
		// declarando vari�veis
		int a, b, c;
		double r, s, d;


		//solicitando informa��es 
		System.out.println("Qual o valor de A? ");
		a = leia.nextInt();
			
		System.out.println("Qual o valor de B? ");
		b = leia.nextInt();
		
		System.out.println("Qual o valor de C? ");
		c = leia.nextInt();

		//calculos
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = (r+s) / 2;
		
		//sa�da
		System.out.println("O valor de R �: "+ r + " o valor de S �: " + s + " (R+S/2) equivale a: "+ d );
		
		//encerrando a fun��o leia
		leia.close();
	}

}
