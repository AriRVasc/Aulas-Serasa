package exerciciosdearrays;


public class ExCinco {
	
	/* Escreva um array de inteiros a e devolve um array de boolean onde, cada posição 
	indique true se o elemento da posição correspondente de a é positivo e false caso seja 
	negativo ou zero. */
	
	public static void main(String[] args) {
		
		int[] vetorA = { 1, -2 , 3, -4, 5, 6};
		boolean[] vetorBoolean = new boolean[10];
		
		System.out.println("Resp: ");
		for ( int i=0; i<vetorA.length; i++) {
			if ( vetorA[i]>0) {
				vetorBoolean[i]=true;
				
			} else {
				vetorBoolean[i]=false;
			}
			
			System.out.print(" "+vetorBoolean[i]);
		}
	}
}
