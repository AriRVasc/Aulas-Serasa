package exerciciosdearrays;

import java.util.Scanner;

public class ExTres {
	/*Crie um array de inteiros e retorna a quantidade de elementos do array que são 
números negativos.  */
	
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int[] vetorA = new int[10];
	
	for ( int i=0; i<vetorA.length; i++) {
		System.out.println("Entre com o valor da posição:"+i);
		vetorA[i] = scan.nextInt();
		}
	
	int qtdNegativos=0;
	for ( int i=0; i<vetorA.length; i++) {
		if ( vetorA[i]<0) {
			qtdNegativos += 1;
		}
	}
	System.out.println("Quantidade de numeros negativos: "+qtdNegativos);
}
	
}
