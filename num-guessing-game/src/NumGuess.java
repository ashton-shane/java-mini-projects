import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class NumGuess {
    public static void main() {
        // Initialise random and scanner objects
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Ask user for choice of game
        System.out.print("Would you like to guess a number from the normal die (numbers 1-6) or the weird die (random set of 10 numbers from 1 to 100)? "
                + "\n" + "Type '1' for normal die, or '2' for weird die: ");
        int choice = scanner.nextInt();

        // MAIN GAME
        if (choice == 1) {
            normalDie(random, scanner);
        } else if (choice == 2) {
            weirdDie(random, scanner);
        }

        // close scanner
        scanner.close();
    }
    private static void normalDie(Random random, Scanner scanner) {
        int die_result = random.nextInt(1, 7);
        int guess;

        // Game will re-run until correct guess then break out of loop
        do {
            System.out.print("Pick a number: ");
            guess = scanner.nextInt();

            if (guess < 1 || guess > 6) {
                System.out.println("Please only guess within the range of 1-6");
            } else if (guess!= die_result) {
                    System.out.println("Wrong answer, guess again!");
            }

        } while (guess != die_result);
        System.out.println("CORRECT GUESS!");
    }

    private static void weirdDie(Random random, Scanner scanner) {
        // initialise empty array of size 10
        int[] weirdDie = new int[10];

        // create weird die with 10 numbers
        for (int i = 0; i < weirdDie.length; i++) {
            weirdDie[i] = random.nextInt(1, 101);
        }

        // sort array
        Arrays.sort(weirdDie);
        System.out.println("weird die: " + Arrays.toString(weirdDie));

        // create guess with index of the die and initialise guess
        int die_result = weirdDie[random.nextInt(0, 10)];
        System.out.println("You rolled " + die_result);
        int guess;

        // Game will re-run until correct guess then break out of loop
        do {
            // ask user for guess
            System.out.print("Pick a number: ");
            guess = scanner.nextInt();

            // print wrong answer statement and help user guess
            if (guess < 1 || guess > 100) {
                System.out.println("Please only guess within the range of 1 and 100");
            } else if (guess < die_result) {
                System.out.println("Wrong answer, guess a higher number!");
            } else if (guess > die_result) {
                System.out.println("Wrong answer, guess a lower number!");
            }
        } while (guess != die_result);
        System.out.println("CORRECT GUESS!");
    }
}

