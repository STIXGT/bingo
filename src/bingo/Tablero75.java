package bingo;

import java.util.ArrayList;

public class Tablero75 extends Tablero {

    private ArrayList<Bola> tablero;

    public Tablero75() {
        this.tablero = new ArrayList<Bola>();
    }

    public void inicializar() {
        System.out.println("Inicializando bingo 75 bolas");
        int valorBola = 1;
        for (int i = 0; i < 8; i++) {
            if (i == 7) {
                for (int j = 0; j < 5; j++) {
                    tablero.add(new Bola(valorBola - 1, valorBola + "", false));
                    System.out.print(getBola(valorBola - 1) + "\t|\t");
                    valorBola++;
                }
            } else {
                for (int j = 0; j < 10; j++) {
                    tablero.add(new Bola(valorBola - 1, valorBola + "", false));
                    System.out.print(getBola(valorBola - 1) + "\t|\t");
                    valorBola++;
                }
            }
            System.out.println("\n");
        }
    }
    public void imprimirTablero(Bola bola) {
        bola.setValor("[" + bola.getValor() + "]");
        tablero.set(bola.getPosition(), bola);
        int valorBola = 1;
        for (int i = 0; i < 8; i++) {
            if (i == 7) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(getBola(valorBola - 1) + "\t|\t");
                    valorBola++;
                }
            } else {
                for (int j = 0; j < 10; j++) {
                    System.out.print(getBola(valorBola - 1) + "\t|\t");
                    valorBola++;
                }
            }
            System.out.println("\n");
        }
        System.out.println("Última bola random: " + bola);
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
