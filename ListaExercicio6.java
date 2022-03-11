/* Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
que efetua tal cálculo é: d - (raiz)(x2 - x1)² + (y2 - y1)²*/

package br.com.generation.aula01;

//importando biblioteca
import java.util.Scanner;


public class ListaExercicio6 {
	
	public static void main(String[] args) {
		
		// informando que o comando leia deverá ser escaneado
		Scanner leia = new Scanner(System.in);
		
		
		// declarando variáveis
		double x1, x2, y1, y2, d, yt, xt;
		
		
		//solicitando informações 
		System.out.println("Informe a localização do x (Ponto1): ");
		x1=leia.nextDouble();
		
		System.out.println("Informe a localização do y (Ponto1): ");
		y1=leia.nextDouble();

		System.out.println("Informe a localização do x (Ponto2): ");
		x2=leia.nextDouble();
		
		System.out.println("Informe a localização do y (Ponto2): ");
		y2=leia.nextDouble();

		
		//calculos
		xt=Math.pow((x2-x1),2.0);
		yt=Math.pow((y2-y1),2.0);

		d = Math.sqrt((xt+yt));
		
		
		//saída
		System.out.println("A distância entre eles é: " +d);
		
		
		//encerrando a função leia
		leia.close();
	}

}
