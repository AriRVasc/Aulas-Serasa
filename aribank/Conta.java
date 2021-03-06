package aribank;

public class Conta {
	//atributos
	private int agencia;
	private int numeroConta;
	private double saldo;
	public String titular;
	
	
	//construtores
	public Conta() { //padrao
	
	}
	public Conta(int agencia, int numeroConta, String titular) { //sobrecarregado
		super();
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.titular = titular; 
	}
	//metodos
	//encapsulamentos
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getnumeroConta() {
		return numeroConta;
	}
	public void setnumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	//metodos
			public void depositar(double valor) {
				if(valor>0) {
					saldo +=valor; // saldo = saldo+valor
				}
			}
			public boolean sacar(double valor) {
				if ( valor > 0 && saldo>= valor) {
					saldo -=valor;
				return true;
				}
				
				return false;
			}

			public boolean transferir ( double valor, Conta destinatario) {
				if ( valor>0 && saldo>=valor) {
					saldo -=valor;
					destinatario.depositar(valor);
					return true;
					}
					
					return false;
				}


}
