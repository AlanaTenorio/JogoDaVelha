/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Alana Tenório
 */
public class RandomInt {
    public static int generate(){
        Random random = new Random();
        int randomNum = ThreadLocalRandom.current().nextInt(1, 9 + 1);
        return randomNum; 
    }
}
