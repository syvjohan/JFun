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
public abstract class Player {
     private String name;
     private Dice dice;

    public Player(String name) {
        this.name = name;
    }
    
    public Player(String name, Dice dice) {
        this.name = name;
        this.dice = dice;
    }
    
    public String getName() {
        return name;
    }

    public abstract int throwDice();
}
