/*Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

package br.com.generation.aula01;

//importando biblioteca
import java.util.Scanner;

public class ListaExercicio1 {
	
	public static void main(String[] args) {
		
		//informando que o comando leia dever� ser escaneado
		Scanner leia = new Scanner(System.in);
		
		//declarando vari�veis
		int dias, meses, anos, idadeCompleta;
		
		//solicitando informa��es
		System.out.println("Informe a idade em Anos: ");
		anos = leia.nextInt();
		
		System.out.println("Informe a idade em Meses: ");
		meses = leia.nextInt();
		
		System.out.println("Informe a idade em Dias: ");
		dias = leia.nextInt();

		
		//calculo
		idadeCompleta = (anos * 365 + meses * 30 + dias);
		
		//sa�da
		System.out.println("A idade expressa em dias � de: " + idadeCompleta+ " dias");
		
		//encerrando a fun��o leia
		leia.close();
		
		
		
	}

}
