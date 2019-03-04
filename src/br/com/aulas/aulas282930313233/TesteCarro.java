package br.com.aulas.aulas282930313233;

public class TesteCarro {
	public static void main(String[] args) {
		Carro carro = new Carro("Fiat", "Palio", 5, 45, 0.0);
		
		System.out.println(carro.getMarca());
		System.out.println(carro.getModelo());
	}
}
