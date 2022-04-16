package exerciciosdearrays;

import java.util.Scanner;

public class ExSete {
	/* Crie um array de inteiros positivos e substitui seus elementos de valor ímpar por -1 e os 
pares por +1. */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int[] vetorA = new int[10];
		
		
		
		for ( int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posição:"+i);
			vetorA[i] = scan.nextInt();
			}
		
		int impar = -1;
		int par = 1;
		for ( int i=0; i<vetorA.length; i++) {
			if (vetorA[i]%2==0) {
				vetorA[i] = par;
			} else {
				vetorA[i] = impar;
			}
			System.out.print (" "+vetorA[i]+" ");	
			}
	
}
}
