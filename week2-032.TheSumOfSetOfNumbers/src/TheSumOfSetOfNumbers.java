
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int userNumber = Integer.parseInt(reader.nextLine());
        int i = 0;
        int result = 0;

        while (i <= userNumber) {
            result += i;
            i++;
        }
        System.out.println("Sum is " + result);

    }
}
