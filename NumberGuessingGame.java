import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();
        int number = ran.nextInt(100) + 1;
        int user = 0;
        int count = 0;
        
        System.out.println("Guess a number between 1 and 100.");

        while (user != number) {
            System.out.print("Enter your guess: ");
            user = scanner.nextInt();
            count++;

            if (user < number) {
                System.out.println("Too low, try again.");
            } else if (user > number) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations, you guessed the number in " + count + " tries!");
            }
        }
        scanner.close();
    }	
}		