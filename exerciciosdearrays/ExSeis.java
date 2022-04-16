package exerciciosdearrays;

import java.util.Scanner;

public class ExSeis {
	/*Escreva um array de números e devolve a posição onde se encontra o maior valor do 
array*/
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int[] vetorA = new int[10];
		
		
		
		for ( int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posição:"+i);
			vetorA[i] = scan.nextInt();
			}
		
		int numMaior= vetorA[0];
		
		for ( int i=1; i<vetorA.length; i++) {
			if ( vetorA[i]>numMaior) {
				numMaior=vetorA[i];
		}
		
	}
		System.out.println("O maior numero é: " +numMaior);
}
}