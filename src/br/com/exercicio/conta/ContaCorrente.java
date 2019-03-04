package br.com.exercicio.conta;

public class ContaCorrente {
	
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	
	
	boolean realizarSaque(double quantiaSacar) {
		if (saldo >= quantiaSacar) {
			saldo -= quantiaSacar;
			return true;
		} else {
			if (especial) {
				double limite = limiteEspecial + saldo;
				if(limite >= quantiaSacar) {
					saldo -= quantiaSacar;
					return true;
				}else
					return false;
			} else {
				return false;
			}
		}
	}
	
	void deposita(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	void consultaSaldo() {
		System.out.println("O saldo atual da conta é: "+saldo);
	}
	
	boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
}
