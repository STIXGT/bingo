package bingo;

import java.io.IOException;

public class Bingo75 extends Bingo {

    private Tablero75 tablero75;
    public Bingo75() {
        super(75);
        setTablero(new Tablero75());
    }

    public Tablero75 getTablero() {
        return tablero75;
    }

    public void setTablero(Tablero75 tablero75) {
        this.tablero75 = tablero75;
    }

    @Override
    protected void jugar() {
        getTablero().inicializar();
        for (int i = 1; i <= 75; i++) {
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

}
