
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {
            double number = Double.parseDouble(reader.nextLine());
            if (number < 41 && number > -31) {
                Graph.addNumber(number);

            }
        }
    }
}
