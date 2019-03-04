package br.com.exercicio.conta;

public class TesteContaCorrente {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.numero = "123456";
		cc.agencia = "1234";
		cc.especial = true;
		cc.limiteEspecial = 500;
		cc.valorEspecialUsado = 0.0;
		cc.saldo = -10;
		
		System.out.println("Saldo da conta "+cc.numero+" = "+cc.saldo);
		
		boolean saqueEfetuado = cc.realizarSaque(520);
		
		if (saqueEfetuado) {
			System.out.println("Saque realiazado com sucesso...");
			cc.consultaSaldo();
		} else {
			System.out.println("Saldo insuficiente para saque...");
			cc.consultaSaldo();
		}
		
		System.out.println("Deposito realizado de: ");
		cc.deposita(500);
		cc.consultaSaldo();
		
		if(cc.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial...");
		}else {
			System.out.println("Não está usando cheque especial...");
		}
		
		cc.realizarSaque(600);
		cc.consultaSaldo();
		
		if(cc.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial...");
		}else {
			System.out.println("Não está usando cheque especial...");
		}
	}
}
