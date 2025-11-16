import java.util.Random;
import java.util.Scanner;

public class NumGuess {
    public static void main() {
        // Initialise random and scanner objects
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Ask user for choice of game
        System.out.print("Would you like to guess a number from the normal die (numbers 1-6) or the weird die (random set of 6 numbers from 1 to 100)? "
                + "\n" + "Type '1' for normal die, or '2' for weird die: ");
        int choice = scanner.nextInt();

        // MAIN GAME
        if (choice == 1) {
            normalDie(random, scanner);
        }
    }
    private static void normalDie(Random random, Scanner scanner) {
        int die_result = random.nextInt(1, 7);
        int ans;

        // Game will re-run until correct guess then break out of loop
        do {
            System.out.print("Pick a number: ");
            ans = scanner.nextInt();
            if (ans!= die_result) {
                System.out.println("Wrong answer, guess again!");
            }
        } while (ans != die_result);
        System.out.println("CORRECT GUESS!");
    }
}

