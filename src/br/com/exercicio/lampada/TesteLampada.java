package br.com.exercicio.lampada;

public class TesteLampada {
	public static void main(String[] args) {
		
		Lampada lampada = new Lampada(null, null, 0, null, null, 0, args, false, false);
		
		
		lampada.ligar();
		lampada.mostrarEstado();
		lampada.desligada();
		lampada.mostrarEstado();
		lampada.mudarEstado();
		lampada.mostrarEstado();
	}
}
