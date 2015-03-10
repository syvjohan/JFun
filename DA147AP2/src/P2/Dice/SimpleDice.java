/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2.Dice;

import P2.Dice.Dice;
import P2.helpLib.*;
import java.util.Random;

/**
 *
 * @author johan
 */
public class SimpleDice implements Dice {
    private int sides;
    private Random rand = new Random();
    
    public SimpleDice() {
        this(6);
    }
    
    public SimpleDice(int sides) {
        if (sides <= 0) {
            throw new NegativeSidesException("number of sides shall be between 1 and 10");
        }
        this.sides = sides;
    }
    
    public int getSides() {
        return sides;
    }
    
    public int throwDice() {
        return generateRandNum(this.sides, 1);
    }
    
    private int generateRandNum(int maxSize, int minSize) {
        return rand.nextInt(maxSize) +minSize;
    }
}
