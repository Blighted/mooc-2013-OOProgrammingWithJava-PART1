
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {

        System.out.println("Type a word");
        Scanner reader = new Scanner(System.in);

        String name = reader.nextLine();

        int userNumber = reader.nextInt();

        System.out.println("Result: " + (name.substring(0, userNumber)));

    }
}
