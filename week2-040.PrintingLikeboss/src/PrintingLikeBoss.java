
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 1;
        while (i <= amount) {
            System.out.print("*");
            i++;

        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 1;
        while (i <= amount) {
            System.out.print(" ");
            i++;

        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 1; //height

        while (i <= size) {
            printWhitespaces(size - i);
            printStars(i);

            i++;

        }

    }

    public static void xmasTree(int height) {
        // 40.3
        int t = 1;
        int t1 = 1;
        int t2 = 1;//height

        while (t <= 2) {

            while (t1 <= height) {
                printWhitespaces(height - (t1));
                printStars(t2);
                t1++;

                t2 += 2;

            }

            printWhitespaces(height - 2);
            printStars(3);
            t++;

        }

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
