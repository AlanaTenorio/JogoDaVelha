/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import exceptions.JogoFinalizadoException;
import util.Coordenadas;
import util.RandomInt;

/**
 *
 * @author Alana Tenório
 */
public class JogoSingleplayer{
    Tabuleiro tab = new Tabuleiro();
    private int x;
    private int y;
    private int vez;
    public boolean ganhou;
    private int vencedor;

    public JogoSingleplayer() {
        super();
        vencedor = -1;
        x = 0;
        y = 0;
        vez = 1;
        ganhou = false;
    }

    public String escrever() {
        if (vez == 1) return "X";
        return "O";
    }

    public void jogar(int x, int y) throws JogoFinalizadoException {
        if (vez == 1)
            jogador1(x, y);
    }

    public void atualizarJogador() {
        if (!ganhou) {
            if (vez == 1) {
                vez = 2;
            } else {
                vez = 1;
            }
        }
    }

    public void jogador1(int x, int y) throws JogoFinalizadoException {
        if (!tab.tabuleiro[x][y].equals("X") && !tab.tabuleiro[x][y].equals("O")) {
            tab.tabuleiro[x][y] = "X";
            verificaVencedor("X", x, y, 0);
            atualizarJogador();
        } 
    }

    public int jogador2() throws JogoFinalizadoException {
        int pos = 0, x, y;
        boolean valido = false;
        while(!valido){
            pos = RandomInt.generate();
            x = Coordenadas.getX(pos);
            y = Coordenadas.getY(pos);
            if (!tab.tabuleiro[x][y].equals("X") && !tab.tabuleiro[x][y].equals("O")) {
                tab.tabuleiro[x][y] = "O";
                verificaVencedor("O", x, y, pos);
                atualizarJogador();
                valido = true;
            }   
        }
        return pos;
    }

    public void verificaVencedor(String token, int x, int y, int pos) throws JogoFinalizadoException {
        if (token.equals("X") && tab.verificaJogada(token, x, y) == true) {
            ganhou = true;
            vencedor = 1;
            throw  new JogoFinalizadoException("Ganhou");
        } else if (token.equals("O") && tab.verificaJogada(token, x, y) == true) {
            ganhou = true;
            vencedor = 2;
            throw  new JogoFinalizadoException("Ganhou", pos);
        } else if(empatou()){
            vencedor = 0;
            throw  new JogoFinalizadoException("Empate");            
        }
    }
    
    public boolean empatou(){
        boolean flag = true;
        if(!ganhou){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(tab.tabuleiro[i][j].isEmpty()){
                        flag = false;
                    }
                }
            }
        }
        return flag;
    }
    
    public int getVencedor() {
        return vencedor;
    }

    public int getVez() {
        return vez;
    }
}
