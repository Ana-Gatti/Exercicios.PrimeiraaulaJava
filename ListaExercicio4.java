/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: D = R+S/2, onde R=(A +3)² S-(B+C)² */

package br.com.generation.aula01;

//importando biblioteca
import java.util.Scanner;

public class ListaExercicio4 {
	
	public static void main(String[] args) {
		
		// informando que o comando leia deverá ser escaneado
		Scanner leia = new Scanner(System.in);
		
		// declarando variáveis
		int a, b, c;
		double r, s, d;


		//solicitando informações 
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
		
		//saída
		System.out.println("O valor de R é: "+ r + " o valor de S é: " + s + " (R+S/2) equivale a: "+ d );
		
		//encerrando a função leia
		leia.close();
	}

}
