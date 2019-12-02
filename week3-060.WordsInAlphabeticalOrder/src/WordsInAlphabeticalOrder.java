
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word = "meme";

        while(!word.equals("")) {
            System.out.println("Type a word: ");
            word = reader.nextLine();
            words.add(word);
        }
        
        Collections.sort(words);
      
        for (String meme : words)   {
            System.out.println(meme);
        }
        
    }
}
