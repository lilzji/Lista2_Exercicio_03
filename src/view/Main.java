package view;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
		int[] vet = new int[1000];
		for (int i = 0; i < 1000; i++) {
			vet[i] = (int) (Math.random() * (99 + 1) + 1);

		}
		Thread threadVetor1 = new ThreadVetor(1, vet);
		threadVetor1.start();
		Thread threadVetor2 = new ThreadVetor(1, vet);
		threadVetor2.start();
	}
}
