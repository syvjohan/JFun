/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2.Cheater;
import P2.Dice.Dice;
import P2.Dice.SimpleDice;
import P2.Player.Player;

/**
 *
 * @author johan
 */
public class Cheater extends Player {
      private Dice dice;
      private String name;
      private int count;
    
     public Cheater(String name) {
        super(name);
        this.name = name;
        
        SimpleDice simpledice = new SimpleDice(6);
        
    }
    public Cheater(String name, Dice dice) {
        super(name);
        this.name = name;
        this.dice = dice;
    }
    
    public void setDice(Dice dice) {
        this.dice = dice;
    }
    
    private int isOdd() {
        if (count % 1 == 1) {
            return 0;
        }
        return 1;
    }
    
    public Dice getDice() {
        return dice;
    }
    
    @Override
    public int throwDice() {
         SimpleDice simpleDice = new SimpleDice(dice.getSides() + isOdd());
        return simpleDice.throwDice();
    }
}
