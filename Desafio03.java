package br.com.generation.aula01;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		double galoes, litros;
		
		System.out.println("Digite a quantidade de gal�es: ");
		galoes = leia.nextDouble();
		
		litros = galoes * 3.7854;
		
	
		System.out.println("A quantidade de Litros de �gua para " + galoes+ " gal�es � de: " +litros);
		
		leia.close();
		
	}

}
