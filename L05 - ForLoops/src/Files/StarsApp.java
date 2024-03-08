package Files;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class StarsApp {
    final static int MAX_ROWS = 10;

    public static void starPicture() {
        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void starPictureA() {
        for (int row = MAX_ROWS; row > 0; row--) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void starPictureB() {
        // numberOfSpaces variable 
        int numberOfSpaces = 0;

        // main row loop
        for (int row = MAX_ROWS; row > 0; row--) {

            // spaces loop
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
                // for each space, ++ numberOfSpaces
                numberOfSpaces++;
            }
            // since we know the number of spaces with the numberOfSpaces, the number of stars has to be MAX_ROWS-numberOfSpaces
            for (int star = 1; star <= MAX_ROWS - numberOfSpaces; star++) {
                System.out.print("*");
            }
            // end of row loop, new line and reset space numberOfSpaces
            System.out.println();
            numberOfSpaces = 0;
        }
        System.out.println();
    }

    public static void starPictureC() {
        // counter variable
        int numberOfSpaces = 1;

        // main row loop
        for (int row = MAX_ROWS; row > 0; row--) {

            // spaces loop - numberOfSpaces is init to 1 so first iteration no spaces will be set
            for (int space = 1; space < numberOfSpaces; space++) {
                System.out.print(" ");
            }
            // stars loop, stars will be printed with 10-numberOfSpaces
            for (int star = 1; star <= MAX_ROWS - numberOfSpaces; star++) {
                System.out.print("*");
            }

            // end of row loop, new line and increment numberOfSpaces
            System.out.println();
            numberOfSpaces++;

        }
        System.out.println();


    }


    public static void starPictureD() {
        // counter variables
        int n = MAX_ROWS / 2;
        int row = 0;

        // main row loop
        for (int i = 1; i <= n; i++) {
            // inc row number
            row ++;
            // print row number
            System.out.printf("%3d: ", row);

            // spaces loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (i * 2) - 1; star++) {
                System.out.print("*");
            }

            // end of row loop, new line, decrement numberOfSpaces and add 2 stars
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            // inc row number
            row++;
            // print row number
            System.out.printf("%3d: ", row);

            // spaces loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * i) - 1; star++) {
                System.out.print("*");
            }


            // end of row loop, new line, increment numberOfSpaces and remove 2 stars
            System.out.println();
        }
    }


}

