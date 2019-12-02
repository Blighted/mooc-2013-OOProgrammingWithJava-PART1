
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        int result = 0;
        int amountOfNumbers = 0;
        int oddNumbers = 0;
        int evenNumbers = 0;

        while (true) {
            int userNumber = Integer.parseInt(reader.nextLine());
            if (userNumber < 0) {
                System.out.println("Thank you and see you later!");
                break;
            }
            if (userNumber > 0) {
                System.out.println("Type numbers: " + userNumber);
                result += userNumber;
                amountOfNumbers++;

                if ((userNumber % 2) == 0) {
                    evenNumbers++;
                } else {
                    oddNumbers++;
                }
            }
        }
        System.out.println("The sum is " + result);
        System.out.println("How many numbers: " + amountOfNumbers);
        System.out.println("Average: " + (double) result / amountOfNumbers);
        System.out.println("Even numbers: " + evenNumbers);       
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
