
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        // create here an ArrayList
        String Word = "hello";

        while (!Word.equals("")) {
            System.out.println("Type a word: ");
            Word = reader.nextLine();
            words.add(Word);
        }

        Collections.reverse(words);

        for (String meme : words) {

            System.out.println(meme);
        }
    }
}
