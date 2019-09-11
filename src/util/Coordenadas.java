/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Alana Tenório
 */

/* 
    Mapeamento:

        1 | 2 | 3     0,0 | 1,0 | 2,0
        4 | 5 | 6  =  0,1 | 1,1 | 2,1
        7 | 8 | 9     0,2 | 1,2 | 2,2

*/
public class Coordenadas {

    public static int getX(int pos) {
        switch(pos){
            case 1:
                return 0;
            case 2:
                return 0;
            case 3:
                return 0;
            case 4:
                return 1;
            case 5:
                return 1;
            case 6:
                return 1;
            case 7:
                return 2;
            case 8:
                return 2;
            case 9:
                return 2;
            default:
                return -1;
        }
    }

    public static int getY(int pos) {
        switch(pos){
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 0;
            case 5:
                return 1;
            case 6:
                return 2;
            case 7:
                return 0;
            case 8:
                return 1;
            case 9:
                return 2;
            default:
                return -1;
        }
    }
    
}
