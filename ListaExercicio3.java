/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

package br.com.generation.aula01;

//importando biblioteca
import java.util.Scanner;


public class ListaExercicio3 {
	
	public static void main(String[] args) {
		
		// informando que o comando leia deverá ser escaneado
		Scanner leia = new Scanner(System.in);
		
		// declarando variáveis
		double evento, tempoMinutos, tempoHoras;
		
		
		//solicitando informações
		System.out.println("Informe o tempo de duração em segundos: ");
		evento = leia.nextDouble();

		//calculo
		tempoMinutos = (evento / 60);
		tempoHoras = (tempoMinutos / 60);
		
		//saída
		System.out.println("A duração em horas é de: " + tempoHoras);
		System.out.println("A duração em minutos é de: " + tempoMinutos);
		System.out.println("A duração em segundos é de: " + evento);
		
		//encerrando a função leia
		leia.close();

		
	}

}
