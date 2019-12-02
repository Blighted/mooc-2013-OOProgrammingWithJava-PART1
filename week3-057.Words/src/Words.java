import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);                         
        ArrayList<String> words = new ArrayList<String>();
        String Word = "moi";
        
        while (!Word.isEmpty()) {
            System.out.println("Type a word: ");
            Word = reader.nextLine();
            words.add(Word);
        }
      
        System.out.println("You typed the following words:");
        
        for(String test : words)    {
            System.out.println(test);
                

        }
    }

}