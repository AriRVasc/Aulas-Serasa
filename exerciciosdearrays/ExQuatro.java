package exerciciosdearrays;

import java.util.Scanner;

public class ExQuatro {
//	 Fa�a um programa que leia cinco pares de valores (a,b) todos inteiros e positivos, 
//	um de cada vez. Mostre os n�meros inteiros pares de a at� b (inclusive). */
	
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
        
        // condi��o para que os n�meros sejam diferentes um do outro e positivos
        if( (a != b) && (a > 0) && (b > 0) ){
            
            //1� op��o = se a for menor que b
            while(a < b){
                // incremento para a vari�vel a
                a++;
                // se a for PAR e b for IMPAR
                if((a % 2 == 0) && (b % 2 == 1)){
                    System.out.print(a + ", ");
                // se b for PAR e a for IMPAR
                } else if((b % 2 == 0) && (a % 2 == 0)){
                    // tratamento da vari�vel b
                    b = ((b++) - 1);
                    System.out.print(a + ", ");
                }
            }
            //2� op��o = se b for menor que a
            while(b < a){
                // incremento para a vari�vel b
                b++;
                // se b for PAR e a for IMPAR
                if((b % 2 == 0) && (a % 2 == 1)){
                    System.out.print(b + ", ");
                // se a for PAR e b for IMPAR
                } else if((a % 2 == 0) && (b % 2 == 0)){
                    // tratamento da vari�vel a
                    a = ((a++) - 1);
                    System.out.print(b + ", ");
                }
            }
            
            /* incremento da vari�vel que controla a qtde vezes que
             * o Do...WHILE foi executado
             */
            cont++;
        // caso a e b sejam iguais OU sejam negativos
        } else{
            System.out.println("Digite somente n�meros positivos e maiores que 0");
        }
    }while(cont <= 5);
}
}