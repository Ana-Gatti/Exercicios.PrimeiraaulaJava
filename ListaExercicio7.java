/* Um sistema de equações lineares do tipo: ax + by = c dx + ey = f */

package br.com.generation.aula01;

//importando biblioteca
import java.util.Scanner;


public class ListaExercicio7 {
	public static void main(String[] args) {
	
		
		// informando que o comando leia deverá ser escaneado
		Scanner leia = new Scanner(System.in);
		
		
		// declarando variáveis
		int a, b, c, d, e, f, x, y;
		
		
		//solicitando informações 
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt(); 
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt(); 
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt(); 
		
		System.out.println("Digite o valor de D: ");
		d = leia.nextInt(); 
		
		System.out.println("Digite o valor de E: ");
		e = leia.nextInt(); 
		
		System.out.println("Digite o valor de F: ");
		f = leia.nextInt(); 
		
		
		//calculos
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));
		y = ((a*f) - (c*d)) / ((a*e) - (b*d));
		
		//saída
		System.out.println("Os valores de X e Y são respectivamente: " +x + " e " +y);
		
		//encerrando a função leia
		leia.close();
}  

}
