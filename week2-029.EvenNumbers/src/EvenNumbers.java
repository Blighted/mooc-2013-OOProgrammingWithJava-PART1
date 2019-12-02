
public class EvenNumbers {

    public static void main(String[] args) {

        int numberIncrease = 0;

        while (numberIncrease < 100) {
            numberIncrease++;
            if ((numberIncrease % 2) == 0) {
                System.out.println(numberIncrease);
            }
        }
    }
}
