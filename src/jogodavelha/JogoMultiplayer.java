/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import exceptions.JogoFinalizadoException;


/**
 *
 * @author Alana Tenório
 */
public class JogoMultiplayer{

    Tabuleiro tab;
    private int x;
    private int y;
    private int vez;
    public boolean ganhou;
    private int vencedor;

    public JogoMultiplayer() {
        super();
        tab = new Tabuleiro();
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
        if (vez == 1) {
            jogador1(x, y);
        } else {
            jogador2(x, y);
        }
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
            verificaVencedor("X", x, y);
            atualizarJogador();
        } 
    }

    public void jogador2(int x, int y) throws JogoFinalizadoException {
        if (!tab.tabuleiro[x][y].equals("X") && !tab.tabuleiro[x][y].equals("O")) {
            tab.tabuleiro[x][y] = "O";
            verificaVencedor("O", x, y);
            atualizarJogador();
        } 
    }

    public void verificaVencedor(String token, int x, int y) throws JogoFinalizadoException {
        if (token.equals("X") && tab.verificaJogada(token, x, y) == true) {
            ganhou = true;
            vencedor = 1;
            throw  new JogoFinalizadoException("Ganhou");
        } else if (token.equals("O") && tab.verificaJogada(token, x, y) == true) {
            ganhou = true;
            vencedor = 2;
            throw  new JogoFinalizadoException("Ganhou");
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

    public boolean isGanhou() {
        return ganhou;
    }
    
}
