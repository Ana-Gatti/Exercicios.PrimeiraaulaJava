/* Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula
que efetua tal c�lculo �: d - (raiz)(x2 - x1)� + (y2 - y1)�*/

package br.com.generation.aula01;

//importando biblioteca
import java.util.Scanner;


public class ListaExercicio6 {
	
	public static void main(String[] args) {
		
		// informando que o comando leia dever� ser escaneado
		Scanner leia = new Scanner(System.in);
		
		
		// declarando vari�veis
		double x1, x2, y1, y2, d, yt, xt;
		
		
		//solicitando informa��es 
		System.out.println("Informe a localiza��o do x (Ponto1): ");
		x1=leia.nextDouble();
		
		System.out.println("Informe a localiza��o do y (Ponto1): ");
		y1=leia.nextDouble();

		System.out.println("Informe a localiza��o do x (Ponto2): ");
		x2=leia.nextDouble();
		
		System.out.println("Informe a localiza��o do y (Ponto2): ");
		y2=leia.nextDouble();

		
		//calculos
		xt=Math.pow((x2-x1),2.0);
		yt=Math.pow((y2-y1),2.0);

		d = Math.sqrt((xt+yt));
		
		
		//sa�da
		System.out.println("A dist�ncia entre eles �: " +d);
		
		
		//encerrando a fun��o leia
		leia.close();
	}

}
