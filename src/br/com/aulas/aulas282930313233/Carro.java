package br.com.aulas.aulas282930313233;

public class Carro {
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capacidadeCombustivel;
	private double consumoCombustivel;
	
	public Carro() {
		
	}
	
	public Carro(String marca, String modelo, int numPassageiros, double capacidadeCombustivel,
			double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}

	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: "+ this.capacidadeCombustivel*this.consumoCombustivel);
	}
	
	public double obterAutonomia() {
		System.out.println("Método obter autonomia foi chamado.");
		return this.capacidadeCombustivel*this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		double quantidadeCombustivel = km/this.consumoCombustivel;
		return quantidadeCombustivel;
	}
	
	
	
}
