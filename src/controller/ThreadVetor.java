package controller;

public class ThreadVetor extends Thread {
	private int parImpar;
	private int[] vet;

	public ThreadVetor(int parImpar, int[] vet) {
		this.parImpar = parImpar;
		this.vet = vet;
	}

	public void Par() {
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < vet.length; i++) {

		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("O tempo para percorrer o par foi: " + tempoTotal + ".s");
	}

	public void Impar() {
		double tempoInicial = System.nanoTime();
		for (@SuppressWarnings("unused") int i : vet) {

		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("O tempo para percorrer o impar foi: " + tempoTotal + ".s");
	}
	
	public void run() {
		if(parImpar % 2 == 0) {
			Par();
		}else {
			Impar();
		}
	}
}
