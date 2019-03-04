package br.com.exercicio.lampada;

public class Lampada {
	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMeses;
	private String[] tipos;
	private boolean tipoAbajur;
	
	private boolean ligada;
	
	
	
	public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMeses,
			String[] tipos, boolean tipoAbajur, boolean ligada) {
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia = potencia;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.garantiaMeses = garantiaMeses;
		this.tipos = tipos;
		this.tipoAbajur = tipoAbajur;
		this.ligada = ligada;
	}

	public void ligar() {
		this.ligada = true;
	}
	
	public void desligada() {
		this.ligada = false;
	}
	
	public void mostrarEstado() {
		if(this.ligada) {
			System.out.println("A lâmpada esta ligada");
		}else {
			System.out.println("A lâmpada esta desligada");
		}
	}
	
	public void mudarEstado() {
		if(this.ligada) {
			desligada();
		}else {
			ligar();
		}
	}
}
