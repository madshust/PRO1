import java.util.Arrays;

public class Tasks {
    public static void printMethod(String name) {
        System.out.println(name);
    }

    public static void repeatMethod(int x, String string)
    // method for repeating a string
    {
        for (int i = 0; i < x; i++) {
            printMethod(string);
        }
    }


    public static void arrayMethod() {
        int[][] array = new int[4][4];
        int a = 1;
        int x = 1;

        for (int i = 0; i < 4; i++) {
            x = 1;
            a = i + 1;
            for (int j = 0; j < 4; j++) {
                array[i][j] = Metoder.power(a, x);
                x++;
            }
        }
        System.out.println("The 2D array is: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void taskone() {
        Tasks.printMethod("1.1:");
        Tasks.printMethod("Welcome to Java");
        Tasks.printMethod("Learning Java Now");
        Tasks.printMethod("Programming is fun");

    }

    public static void tasktwo() {
        Tasks.printMethod("1.2:");
        Tasks.repeatMethod(5, "I love Java");
    }

    public static void taskthree() {
        Tasks.printMethod("1.3:");
        Tasks.printMethod("   J            ");
        Tasks.printMethod("J aaa  v   vaaa ");
        Tasks.printMethod("J  J aa vv  a  a");
        Tasks.printMethod("J aaaa   v  aaaa");

    }

    public static void taskfour() {
        Tasks.printMethod("1.4:");
        Tasks.arrayMethod();

    }

    public static void tasksix() {
        Tasks.printMethod("1.6: ");
        Tasks.printMethod("The value of 1+2+3+4+5+6+7+8+9+10 is: ");
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);

    }

    public static void taskseven() {
        Tasks.printMethod("1.7: ");
        Tasks.printMethod("The value of pi is approximately: ");
        System.out.println(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
        System.out.println(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));
    }

    public static void taskeight() {
        System.out.println("The area of a circle with radius 6.5 is: ");
        System.out.format("%.3f", Metoder.areaC(6.5));
        System.out.println("\nThe perimeter of a circle with radius 6.5 is: ");
        System.out.format("%.3f", Metoder.perimeterC(6.5));


    }

    public static void tasknine() {
        System.out.println("The area of a rectangle with H: 8.6 and W: 5.3 is: ");
        System.out.format("%.3f", Metoder.areaR(8.6, 5.3));
        System.out.println("\nThe perimeter of a rectangle with H: 8.6 and W: 5.3 is: ");
        System.out.format("%.3f", Metoder.perimeterR(8.6, 5.3));

    }

    public static void taskKindergartenHARD() {
        // underviser har 6 børn, hhv. 3 drenge (6,6,8) og 3 piger (15,16,18)
        int[] børn = {6, 6, 8, 15, 16, 18};
        int alderSum = 0;

        for (int i = 0; i < børn.length; i++) {
            alderSum += børn[i];
        }
        int gns = alderSum / børn.length;

        System.out.println("Gennemsnittet af børnene med de følgende aldre: ");
        System.out.println(Arrays.toString(børn));
        System.out.print("Gennemsnit: ");
        System.out.println(gns);

        // På de fleste folkeskoler skal børn i dag
        // medbringe to madpakker hver dag. Underviseren har en husregel om, at man selv
        // smører madpakker fra man er fyldt 10 år. Et folkeskoleår i Danmark har gennemsnitligt
        // 200 undervisningsdage.

        // Skriv et program, der beregner hvor mange madpakker underviseren har smurt til nytår
        // (det kan antages, at alle børn har fødselsdag i juli)
        // VI antager at børn starter i skole som 6-årige
        // VI antager at der er 100 madpakker cirka fra dags dato til sommer 2023

        int madpakkerU = 0;
        int madpakkerB = 0;
        // for-løkke der tager også igennem arrayet
        for (int i = 0; i < børn.length; i++) {
            // if statement der lægger 100 madpakkerU fra sommer 2023 til nu hvis barn er under 10 år
            if (børn[i] < 10) {
                madpakkerU += 100;
            }
            // if statement der lægger 100 madpakkerB fra sommer 2023 til nu hvis barn er over 10 år
            if (børn[i] > 10) {
                madpakkerB += 100;
            }
            // tjek for om barnet er over 6 år for at tilføje 200 madpakker
            if (børn[i] > 6) {
                // for-løkke der kører igennem hvert af barnets år fra deres alder ned til 6 år
                for (; børn[i] != 6; børn[i]--) {
                    // if statement der tjekker om der skal lægges madpakker til madpakkerB
                    if (børn[i] > 10) {
                        madpakkerB += 200;
                    }
                    // if statement der lægger 200 til madpakkerU hvis barnet er under 10 år
                    if (børn[i] <= 10) {
                        madpakkerU += 200;
                    }
                }

            }


        }
        System.out.println("Det samlede antal madpakker lavet af underviser for hans børn frem til nytår 2023 er: ");
        System.out.println(madpakkerU);
        System.out.println("Det samlede antal madpakker lavet af hans børn frem til nytår 2023 er: ");
        System.out.println(madpakkerB);
    }
}

