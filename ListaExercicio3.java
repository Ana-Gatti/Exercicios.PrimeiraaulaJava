/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

package br.com.generation.aula01;

//importando biblioteca
import java.util.Scanner;


public class ListaExercicio3 {
	
	public static void main(String[] args) {
		
		// informando que o comando leia dever� ser escaneado
		Scanner leia = new Scanner(System.in);
		
		// declarando vari�veis
		double evento, tempoMinutos, tempoHoras;
		
		
		//solicitando informa��es
		System.out.println("Informe o tempo de dura��o em segundos: ");
		evento = leia.nextDouble();

		//calculo
		tempoMinutos = (evento / 60);
		tempoHoras = (tempoMinutos / 60);
		
		//sa�da
		System.out.println("A dura��o em horas � de: " + tempoHoras);
		System.out.println("A dura��o em minutos � de: " + tempoMinutos);
		System.out.println("A dura��o em segundos � de: " + evento);
		
		//encerrando a fun��o leia
		leia.close();

		
	}

}
