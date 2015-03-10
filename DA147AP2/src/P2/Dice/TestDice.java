/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2.Dice;
import P2.Player.Player;
import P2.Cheater.Cheater;

/**
 *
 * @author johan
 */
public class TestDice {
    private static int[] container;
    
    public static void test(Dice dice, int discard) {
        container = new int[dice.getSides()];
        for (int i = 0; i != discard; i++) {
            int nbr = dice.throwDice(); 
            container[nbr -1]++;
        }     
    }
    
    public static void test(Player player, int nbrOfThrows) {
        if (player instanceof Cheater) {
            System.out.print("Dice thrown by cheater! \n");
        } else {
            System.out.print("Dice thrown by player! \n");
        } 
    } 
    
    public void printNbr() {
        for (int i = 0; i != container.length; i++) {
            System.out.print(container[i]);
            System.out.print("\n");
        }
    }
}
