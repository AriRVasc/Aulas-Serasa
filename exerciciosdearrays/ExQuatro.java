package exerciciosdearrays;

import java.util.Scanner;

public class ExQuatro {
//	 Faça um programa que leia cinco pares de valores (a,b) todos inteiros e positivos, 
//	um de cada vez. Mostre os números inteiros pares de a até b (inclusive). */
	
	public static void main(String[] args) {

	Scanner scan = new Scanner (System.in);
    int a, b;
    int cont=0;
	
    // loop
    do{
        System.out.println("\nDigite o valor de a");
        a = scan.nextInt();
        
        System.out.println("\nDigite o valor de b");
        b = scan.nextInt();
        
        // condição para que os números sejam diferentes um do outro e positivos
        if( (a != b) && (a > 0) && (b > 0) ){
            
            //1ª opção = se a for menor que b
            while(a < b){
                // incremento para a variável a
                a++;
                // se a for PAR e b for IMPAR
                if((a % 2 == 0) && (b % 2 == 1)){
                    System.out.print(a + ", ");
                // se b for PAR e a for IMPAR
                } else if((b % 2 == 0) && (a % 2 == 0)){
                    // tratamento da variável b
                    b = ((b++) - 1);
                    System.out.print(a + ", ");
                }
            }
            //2ª opção = se b for menor que a
            while(b < a){
                // incremento para a variável b
                b++;
                // se b for PAR e a for IMPAR
                if((b % 2 == 0) && (a % 2 == 1)){
                    System.out.print(b + ", ");
                // se a for PAR e b for IMPAR
                } else if((a % 2 == 0) && (b % 2 == 0)){
                    // tratamento da variável a
                    a = ((a++) - 1);
                    System.out.print(b + ", ");
                }
            }
            
            /* incremento da variável que controla a qtde vezes que
             * o Do...WHILE foi executado
             */
            cont++;
        // caso a e b sejam iguais OU sejam negativos
        } else{
            System.out.println("Digite somente números positivos e maiores que 0");
        }
    }while(cont <= 5);
}
}