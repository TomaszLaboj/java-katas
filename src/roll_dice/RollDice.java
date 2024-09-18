package roll_dice;

import java.util.Random;

public class RollDice {
    public static void main(String[] args) {
        Random random = new Random();
        int total= 0;
        boolean win = false;
        for (int i = 0; i < 5; i++) {
            int roll = random.nextInt(6) + 1;
            total += roll;
            if (total == 20) {
                System.out.println("You win! You covered 20 spaces.");
                win = true;
                break;
            }
        }
        if (!win) {
            if (total >= 20) {
                System.out.println("You win! You covered " + total + " spaces.");
            } else {
                System.out.println("You lose! You covered " + total + " spaces.");
            }
        }
    }
}
