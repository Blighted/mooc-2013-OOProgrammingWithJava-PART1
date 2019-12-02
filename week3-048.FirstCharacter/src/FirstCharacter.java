
import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {

        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);

        String name = reader.nextLine();

        System.out.println("First character: " + firstCharacter(name));

    }

    public static char firstCharacter(String text) {

        return text.charAt(0);

    }

}
