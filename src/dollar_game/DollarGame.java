package dollar_game;

import java.util.Scanner;

public class DollarGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // number of pennies
        int pennies = 0;
        System.out.println("How many pannies do you have?");
        pennies = scanner.nextInt();
        //number of nickels
        int nickels = 0;
        System.out.println("How many nickels do you have?");
        nickels = scanner.nextInt();
        //number of dimes
        int dimes = 0;
        System.out.println("How many dimes do you have?");
        dimes = scanner.nextInt();
        //number of quarters
        int quarters = 0;
        System.out.println("How many quarters do you have?");
        quarters = scanner.nextInt();
        double total = (pennies + nickels * 5 + dimes * 10 + quarters * 25) / 100.0;
        if (total == 1.0) {
            System.out.println("you  have won!");
        } else {
            System.out.println("you have lost! You have " + total + " dollars.");
        }
    }
}
