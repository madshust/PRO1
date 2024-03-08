import java.util.ArrayList;

public class Methods {

    public static void printOddNumbers(int limit) {

        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

    public static void printMultiplesOf3(int start) {

        for (int i = start; i > 0; i = i - 3) {
            System.out.println(i);
        }
    }
}
