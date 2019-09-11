/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Alana Tenório
 */
public class JogoFinalizadoException extends Exception{
    
    private int pos;
    
    public JogoFinalizadoException() {
    }

    public JogoFinalizadoException(String message) {
        super(message);
        this.pos = 0;
    }
    
    public JogoFinalizadoException(String message, int pos) {
        super(message);
        this.pos = pos;
    }

    public int getPos() {
        return pos;
    }
       
}
