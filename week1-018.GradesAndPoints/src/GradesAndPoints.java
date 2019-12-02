
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]: ");
        int scoreGrade = Integer.parseInt(reader.nextLine());
        
        if (scoreGrade <= 29) {
            System.out.println("Grade: Failed");
    }   else if (scoreGrade <= 34) {
            System.out.println("Grade: 1");
    }   else if (scoreGrade <= 39) {
            System.out.println("Grade: 2");
    }   else if (scoreGrade <= 44) {
            System.out.println("Grade: 3");
    }   else if (scoreGrade <= 49) {
            System.out.println("Grade: 4");
    }   else if (scoreGrade >= 50) {
            System.out.println("Grade: 5");
    }
        
        
    }
}
