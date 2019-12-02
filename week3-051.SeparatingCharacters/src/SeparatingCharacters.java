
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {

        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        int counter = 0;
        int listCount = 1;
        
        while (name.length() >= counter) {
            System.out.println(listCount + ". character: " + name.charAt(counter));
            counter++;
            listCount++;
        if (name.length() == counter) {
            break;
        }
        }
    }
   
}
//
//    public static char lastCharacter(String text) {
//
//        return text.charAt(text.length() - 1);
//
//    }
//
//}
