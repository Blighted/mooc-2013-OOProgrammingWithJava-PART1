
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int counter = 0;

        while (true) {
            System.out.println("Guess a number: ");
            int userNumber = Integer.parseInt(reader.nextLine());
            counter++;
            
            if (userNumber == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;

            }
            if (numberDrawn < userNumber) {
                System.out.println("The number is lesser, guesses made: " + counter);
            } else if (numberDrawn > userNumber) {
                System.out.println("The number is greater, guesses made: " + counter);
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
