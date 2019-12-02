
import java.util.Scanner;

public class ReversingName {

    public static void main(String[] args) {

        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        String reverseName = "";
        int counter = name.length()-1;
        
        while (counter>=0) {

            reverseName += name.charAt(counter);
            counter--;
            
        }
                System.out.print("In reverse order: " + reverseName);

         }
}