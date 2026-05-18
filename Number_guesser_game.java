// Write a program that keeps asking the user to guess a secret 
// number (between 1 and 100) until they get it right. After each wrong guess, tell them
// if the secret number is higher or lower. At the end, show how many attempts it took.
// Write a program that keeps asking the user to guess a secret 
// number (between 1 and 100) until they get it right. 
// After each wrong guess, tell them if the secret number is higher or lower. 
// At the end, show how many attempts it took.

import java.util.Random;
import java.util.Scanner;

public class Number_guesser_game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

         System.out.println("I've picked a number between 1 and 100. Can you guess it?");

        while (guess != secretNumber) {

            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try higher.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try lower.");
            } else {
                System.out.println("Correct! You got it in " + attempts + " attempts.");
            }

        }

        
    }
}
