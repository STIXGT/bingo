package bingo;

import java.util.ArrayList;

public class Tablero {

	private ArrayList<Bola> tablero;

	public Tablero() {
		this.tablero = new ArrayList<Bola>();
	}

	public void inicializar() {
		System.out.println("Inicializando bingo 75 bolas");
		int valorBola = 1;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				agregarBola(new Bola(valorBola + "", false));
				System.out.print(getBola(valorBola - 1) + "\t");
				valorBola++;
			}
			System.out.println("\n");
		}
	}
	public void imprimirTablero(Bola bola) {
		int positionBola = Integer.parseInt(bola.getValor()) - 1;
		bola.setValor("[" + bola.getValor() + "]");
		actualizarBola(positionBola, bola);
		int valorBola = 1;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(getBola(valorBola - 1) + "\t");
				valorBola++;
			}
			System.out.println("\n");
		}
		System.out.println("Última bola sacada: " + bola);
	}

	public void agregarBola(Bola bola) {
		tablero.add(bola);
	}

	public void actualizarBola(int position, Bola bola) {
		tablero.set(position, bola);
	}

	public Bola getBola(int position) {
		return tablero.get(position);
	}

	public ArrayList<Bola> getTablero() {
		return tablero;
	}

	public void setTablero(ArrayList<Bola> tablero) {
		this.tablero = tablero;
	}

}