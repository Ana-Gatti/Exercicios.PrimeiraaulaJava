/* O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor. */

package br.com.generation.aula01;

//importando biblioteca
import java.util.Scanner;


public class ListaExercicio8 {
	
	public static void main(String[] args) {
		
		// informando que o comando leia deverá ser escaneado
		Scanner leia = new Scanner(System.in);
		
		
		// declarando variáveis
		double custoFabrica, custoConsumidor, porcDistribuidor, porcImpostos; 
		
		
		//solicitando informações
		System.out.println("Informe o custo de fabrica do veiculo:  ");
		custoFabrica = leia.nextDouble();
		
		
		//calculos
		porcDistribuidor = custoFabrica * 0.28;
		porcImpostos = custoFabrica * 0.45;
		custoConsumidor = custoFabrica + porcDistribuidor + porcImpostos;
		
		
		//saida
		System.out.println("O custo ao Consumidor é de: " +custoConsumidor + " reais");
		
		
		//encerrando a função leia
		leia.close();
		
	}
	
	
	
}
