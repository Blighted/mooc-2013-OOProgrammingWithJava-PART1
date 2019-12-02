
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double exponent;
        int i = 0;
        int sum = 0;
        
        exponent = reader.nextInt();
        
        while (i <= exponent)   {
            sum = sum + (int) (Math.pow(2, exponent));
            exponent--;
        }
        
        System.out.println(sum);
        
    }
}
