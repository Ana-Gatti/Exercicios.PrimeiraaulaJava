/* O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor. */

package br.com.generation.aula01;

//importando biblioteca
import java.util.Scanner;


public class ListaExercicio8 {
	
	public static void main(String[] args) {
		
		// informando que o comando leia dever� ser escaneado
		Scanner leia = new Scanner(System.in);
		
		
		// declarando vari�veis
		double custoFabrica, custoConsumidor, porcDistribuidor, porcImpostos; 
		
		
		//solicitando informa��es
		System.out.println("Informe o custo de fabrica do veiculo:  ");
		custoFabrica = leia.nextDouble();
		
		
		//calculos
		porcDistribuidor = custoFabrica * 0.28;
		porcImpostos = custoFabrica * 0.45;
		custoConsumidor = custoFabrica + porcDistribuidor + porcImpostos;
		
		
		//saida
		System.out.println("O custo ao Consumidor � de: " +custoConsumidor + " reais");
		
		
		//encerrando a fun��o leia
		leia.close();
		
	}
	
	
	
}
