/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

package br.com.generation.aula01;

//importando biblioteca
import java.util.Scanner;

public class ListaExercicio1 {
	
	public static void main(String[] args) {
		
		//informando que o comando leia deverá ser escaneado
		Scanner leia = new Scanner(System.in);
		
		//declarando variáveis
		int dias, meses, anos, idadeCompleta;
		
		//solicitando informações
		System.out.println("Informe a idade em Anos: ");
		anos = leia.nextInt();
		
		System.out.println("Informe a idade em Meses: ");
		meses = leia.nextInt();
		
		System.out.println("Informe a idade em Dias: ");
		dias = leia.nextInt();

		
		//calculo
		idadeCompleta = (anos * 365 + meses * 30 + dias);
		
		//saída
		System.out.println("A idade expressa em dias é de: " + idadeCompleta+ " dias");
		
		//encerrando a função leia
		leia.close();
		
		
		
	}

}
