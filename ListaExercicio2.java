/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias*/

package br.com.generation.aula01;

//importando biblioteca
import java.util.Scanner;

public class ListaExercicio2 {

	public static void main(String[] args) {

		// informando que o comando leia deverá ser escaneado
		Scanner leia = new Scanner(System.in);

		// declarando variáveis
		int dias, meses, anos, idadeDias;

		// solicitando informações
		System.out.println("Informe a idade em dias: ");
		dias = leia.nextInt();

		// calculo
		anos = dias / 365;
		meses = (dias % 365) / 30;
		idadeDias = (dias % 365) % 30;
				
		//saída
		System.out.println("Sua idade em anos é: " +anos);
		System.out.println("Sua idade em meses é: " +meses);
		System.out.println("Sua idade em dias é: " +idadeDias);

		//encerrando a função leia
		leia.close();

	}
}