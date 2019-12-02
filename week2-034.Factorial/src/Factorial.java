
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int userNumber = Integer.parseInt(reader.nextLine());

        int result = 1;
        int factorial = 1;
        
        while (factorial <= userNumber) {
            result *= factorial;
            factorial++;
        }
        System.out.println("Factorial is " + result);

    }
}
