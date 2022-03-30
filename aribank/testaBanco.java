package aribank;

public class testaBanco {
	public static void main(String[] args) {
//		
//		Pessoa pessoaNova = new Pessoa(); //instanciar a classe Pessoa
//		
//		pessoaNova.setNome("Ariadne");
//		System.out.println("Nome:"+pessoaNova.getNome());
//		
//		Pessoa pessoaComConstrutor = new Pessoa("João dos Tomates", "259.800.966-55","123.456-78");
//		System.out.println("Nome:"+pessoaComConstrutor.getNome());
//		System.out.println("CPF:"+pessoaComConstrutor.getCpf());
//		System.out.println("RG:"+pessoaComConstrutor.getRg());
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setnumeroConta(7889);
		conta1.setSaldo(15000.50);
		conta1.setTitular("Ariadne");
		
		conta1.depositar(100.0);
		
		
		
		System.out.println("Agencia: "+conta1.getAgencia());
		System.out.println("Conta: "+conta1.getnumeroConta());
		System.out.println("Titular: "+conta1.getTitular());
		System.out.printf("Saldo: %.2f ",conta1.getSaldo());
		
	if ( conta1.sacar(10)) {
		System.out.println("\nSaque efetuado com sucesso!");
	} else {
		System.out.printf("\nSaldo indisponível!");
	}
	System.out.printf("\nSaldo Atual : R$%.2f",conta1.getSaldo());
	
	
	Conta conta2 = new Conta();
	conta2.setAgencia(5582);
	conta2.setnumeroConta(2234);
	
	conta1.transferir(10000.0, conta2);
	System.out.printf("\nSaldo Atual Flavia: R$%.2f",conta1.getSaldo());
	System.out.printf("\nSaldo Atual Babaguxy: R$%.2f",conta2.getSaldo());
	}

}
