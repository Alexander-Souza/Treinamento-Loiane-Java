package br.com.exercicio.lampada;

public class Lampada {
	private String modelo;
	private String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;
	
	boolean ligada;
	
	void ligar() {
		ligada = true;
	}
	
	void desligada() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if(ligada) {
			System.out.println("A lâmpada esta ligada");
		}else {
			System.out.println("A lâmpada esta desligada");
		}
	}
	
	void mudarEstado() {
		if(ligada) {
			desligada();
		}else {
			ligar();
		}
	}
}
