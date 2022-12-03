package bingo;

import java.io.IOException;

public class Bingo90 extends Bingo {

	private Tablero90 tablero90;

	public Bingo90() {
		super(90);
		setTablero(new Tablero90());
	}

	@Override
	protected void jugar() {
		getTablero().inicializar();
		// TODO
		// No debe limitar a 90
		// Controlar que no se repita
		for (int i = 1; i <= 90; i++) {
			System.out.println("Pulse enter para sacar bola..");
			Bola bola = new Bola();
			try {
				System.in.read();
				bola = sacarBola();
			} catch (IOException e) {
				e.printStackTrace();
			}
			getTablero().imprimirTablero(bola);
		}
	}

	public Tablero90 getTablero() {
		return tablero90;
	}

	public void setTablero(Tablero90 tablero90) {
		this.tablero90 = tablero90;
	}

}
