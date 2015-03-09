/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2.Player;
import P2.Dice.*;

/**
 *
 * @author johan
 */
public class OrdinaryPlayer extends Player {
    private Dice dice;
    private String name;
    
    public OrdinaryPlayer(String name) {
        super(name);
        this.name = name;
        
        SimpleDice simpledice = new SimpleDice(6);
        
    }
    public OrdinaryPlayer(String name, Dice dice) {
        super(name, dice);
        this.name = name;
        this.dice = dice;
    }
    
    public void setDice(Dice dice) {
        this.dice = dice;
    }
    
    public Dice getDice() {
        return dice;
    }
    
    @Override
    public int throwDice() {
        SimpleDice simpleDice = new SimpleDice();
        return simpleDice.throwDice();
    }
}
