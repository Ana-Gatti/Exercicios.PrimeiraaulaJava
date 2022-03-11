/*Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias*/

package br.com.generation.aula01;

//importando biblioteca
import java.util.Scanner;

public class ListaExercicio2 {

	public static void main(String[] args) {

		// informando que o comando leia dever� ser escaneado
		Scanner leia = new Scanner(System.in);

		// declarando vari�veis
		int dias, meses, anos, idadeDias;

		// solicitando informa��es
		System.out.println("Informe a idade em dias: ");
		dias = leia.nextInt();

		// calculo
		anos = dias / 365;
		meses = (dias % 365) / 30;
		idadeDias = (dias % 365) % 30;
				
		//sa�da
		System.out.println("Sua idade em anos �: " +anos);
		System.out.println("Sua idade em meses �: " +meses);
		System.out.println("Sua idade em dias �: " +idadeDias);

		//encerrando a fun��o leia
		leia.close();

	}
}