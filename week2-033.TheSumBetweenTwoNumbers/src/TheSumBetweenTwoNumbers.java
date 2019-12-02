
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int userNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        int userNumber2 = Integer.parseInt(reader.nextLine());

        int result = 0;

        while (userNumber <= userNumber2) {
            result += userNumber;
            userNumber++;
        }
        System.out.println("Sum is " + result);

    }
}
