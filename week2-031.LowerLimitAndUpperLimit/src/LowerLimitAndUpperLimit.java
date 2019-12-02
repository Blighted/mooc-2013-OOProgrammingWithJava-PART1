
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int userFirstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        int userSecondNumber = Integer.parseInt(reader.nextLine());

        while (userFirstNumber <= userSecondNumber) {
            System.out.println(userFirstNumber);
            userFirstNumber++;

        }
    }
}
