package br.com.generation.aula01;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner(System.in);
		
		int a, b, soma, subtra��o;
		
		System.out.println("Digite o valor de a: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de b: ");
		b = leia.nextInt();
		
		soma = a + b;
		subtra��o = a - b;
		
		System.out.println("O resultado da soma �: " +soma);
		System.out.println("O resultado da subtra��o �: " +subtra��o);
		
		leia.close();
	}

}
