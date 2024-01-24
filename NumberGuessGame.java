import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");

        // Generate a random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;

        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Try to guess the secret number between 1 and 100.");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == secretNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
            } else if (userGuess < secretNumber) {
                System.out.println("Too low. Try again!");
            } else {
                System.out.println("Too high. Try again!");
            }
        }

        scanner.close();
    }
}
