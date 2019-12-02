
import java.util.Scanner;

public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int zero = 0;
        int userNumber = Integer.parseInt(reader.nextLine());

        while (zero < userNumber) {
            zero++;
            System.out.println(zero);
        }

    }
}
