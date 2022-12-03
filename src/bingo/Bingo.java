package bingo;

import java.util.Random;

public abstract class Bingo {

	private int numeroBolas;


	public Bingo(int numeroBolas) {
		this.numeroBolas = numeroBolas;
	}

	public Bola sacarBola() {
		Random random = new Random();
		int value = (random.nextInt(numeroBolas - 1 + 1) + 1);
		return new Bola(value - 1, value + "", true);
	}

	protected abstract void jugar();

	public int getNumeroBolas() {
		return numeroBolas;
	}

	public void setNumeroBolas(int numeroBolas) {
		this.numeroBolas = numeroBolas;
	}
}
