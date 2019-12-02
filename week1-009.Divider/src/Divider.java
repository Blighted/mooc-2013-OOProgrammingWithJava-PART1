
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        double aNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Type a number: ");
        double aNumber2 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Division: " + aNumber + " / " + aNumber2 + " = " + (aNumber / aNumber2));
        
        // Implement your program here. Remember to ask the input from user.
    }
}
