/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

/**
 *
 * @author Alana Tenório
 */
public class Tabuleiro {
    protected static String[][] tabuleiro;
    boolean vencedor;
    public Tabuleiro() {
    }

    public boolean verificaJogada(String simbolo, int x, int y) {
        vencedor = false;
        if (x == 0 && y == 0) {
            if ((tabuleiro[0][1].equals(simbolo) && tabuleiro[0][2].equals(simbolo))
                    || (tabuleiro[1][0].equals(simbolo) && tabuleiro[2][0].equals(simbolo))
                    || (tabuleiro[1][1].equals(simbolo) && tabuleiro[2][2].equals(simbolo))) {
                vencedor = true;
            }
        }
        if (x == 0 && y == 1) {
            if ((tabuleiro[0][0].equals(simbolo) && tabuleiro[0][2].equals(simbolo))
                    || (tabuleiro[1][1].equals(simbolo) && tabuleiro[2][1].equals(simbolo))) {
                vencedor = true;
            }
        }
        if (x == 0 && y == 2) {
            if ((tabuleiro[0][1].equals(simbolo) && tabuleiro[0][0].equals(simbolo))
                    || (tabuleiro[1][2].equals(simbolo) && tabuleiro[2][2].equals(simbolo))
                    || (tabuleiro[1][1].equals(simbolo) && tabuleiro[2][0].equals(simbolo))) {
                vencedor = true;
            }
        }
        if (x == 1 && y == 0) {
            if ((tabuleiro[0][0].equals(simbolo) && tabuleiro[2][0].equals(simbolo))
                    || (tabuleiro[1][1].equals(simbolo) && tabuleiro[1][2].equals(simbolo))) {
                vencedor = true;
            }
        }
        if (x == 1 && y == 1) {
            if ((tabuleiro[0][1].equals(simbolo) && tabuleiro[2][1].equals(simbolo))
                    || (tabuleiro[1][0].equals(simbolo) && tabuleiro[1][2].equals(simbolo))
                    || (tabuleiro[0][0].equals(simbolo) && tabuleiro[2][2].equals(simbolo))
                    || (tabuleiro[0][2].equals(simbolo) && tabuleiro[2][0].equals(simbolo))) {
                vencedor = true;
            }
        }
        if (x == 1 && y == 2) {
            if ((tabuleiro[0][2].equals(simbolo) && tabuleiro[2][2].equals(simbolo))
                    || (tabuleiro[1][1].equals(simbolo) && tabuleiro[1][0].equals(simbolo))) {
                vencedor = true;
            }
        }
        if (x == 2 && y == 0) {
            if ((tabuleiro[0][0].equals(simbolo) && tabuleiro[1][0].equals(simbolo))
                    || (tabuleiro[2][1].equals(simbolo) && tabuleiro[2][2].equals(simbolo))
                    || (tabuleiro[1][1].equals(simbolo) && tabuleiro[0][2].equals(simbolo))) {
                vencedor = true;
            }
        }
        if (x == 2 && y == 1) {
            if ((tabuleiro[2][0].equals(simbolo) && tabuleiro[2][2].equals(simbolo))
                    || (tabuleiro[1][1].equals(simbolo) && tabuleiro[0][1].equals(simbolo))) {
                vencedor = true;
            }
        }
        if (x == 2 && y == 2) {
            if ((tabuleiro[2][1].equals(simbolo) && tabuleiro[2][0].equals(simbolo))
                    || (tabuleiro[1][2].equals(simbolo) && tabuleiro[0][2].equals(simbolo))
                    || (tabuleiro[1][1].equals(simbolo) && tabuleiro[0][0].equals(simbolo))) {
                vencedor = true;
            }
        }
        return vencedor;
    }

    public JogoSingleplayer InicializarSingleplayer(){
        tabuleiro = new String[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = "";
            }
        }
        JogoSingleplayer jogo = new JogoSingleplayer();
        return jogo;
    }
    
    public JogoMultiplayer InicializarMultiplayer(){
        tabuleiro = new String[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = "";
            }
        }
        JogoMultiplayer jogo = new JogoMultiplayer();
        return jogo;
    }

    public static String[][] getTabuleiro() {
        return tabuleiro;
    }
    
}
