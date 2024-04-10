import java.util.Scanner;

public class AppMadsH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Indtast personens navn: ");
        String navn = input.nextLine();
        System.out.println("Indtast personens vægt: ");
        int vægt = input.nextInt();
        System.out.println("Indtast personens højde i m: ");
        double højde = input.nextDouble();
        System.out.printf("Beregnet BMI: %.2f\n",udregnBMI(vægt,højde));
        System.out.printf("%s,BMI siger: %s",navn,fortolkBMI(udregnBMI(vægt,højde)));

    }

    public static double udregnBMI(int vægt, double højde){
        return vægt / Math.pow(højde,2);
    }

    public static String fortolkBMI(double BMI){
        if (BMI < 18.5)
            return "undervægtig";
        else if (BMI < 25)
            return "normal vægt";
        else if (BMI < 30)
            return "overvægtig";
        else
            return "fedme";
    }
}
