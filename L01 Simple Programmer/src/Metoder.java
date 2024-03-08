public class Metoder {

    public static int power(int base, int exponent)
    // method to calculate base to the power of exponent
    {
        int result = 1;
        for (; exponent != 0; --exponent) {
            result *= base;
        }
        return result;
    }

    public static double areaC(double r){
        final double PI = 3.14159;
        return r*r*PI;
    }

    public static double perimeterC(double r){
        final double PI = 3.14159;
        return 2*r*PI;
    }

    public static double areaR(double h, double w){
        double result = h*w;
        return result;
    }
    public static double perimeterR(double h, double w){
        return 2*(h*w);

    }

}
