public class Methods {
    public static int sumWholeDigits(int start, int limit) {

        int sum = 0;
        while (start <= limit) {
             if (start % 2 == 0)
                sum = sum + start;
                start++;
        }
        return sum;
    }

    public static int sumSquareDigits(int limit){
        // sum
        int sum = 0;
        // tæller
        int i = 1;
        // variabel der tjekker for om variablen ganget med sig selv giver et tal
        int square = 1;

        while (i <= limit){
            // tjek om square^2 er = tæller
            if (square*square == i){
                sum += i;
                // læg en til square så vi tester næste kvadrattal
                square++;
            }
            i++;
        }
        return sum;
    }

    public static void printPowersOfTwo(){

        // init exponent
        int exponent = 0;
        // init base
        int base = 2;


        while (exponent <= 20){
            int i = exponent;
            // init result - since base to the power of 0 is 1 we can set this to 1
            int result = 1;
            while (i > 0){
                result *= base;
                i--;
            }
            System.out.println("2 opløftet i " + exponent + " er " + result);
            exponent++;
        }

    }

    public static int sumOddDigits(int num){

        int sum = 0;
        int digit = 0;

        while (num > 0){
            // find last digit of num
            digit = num % 10;
            // check if digit is odd
            if (digit % 2 != 0)
                // if digit is odd add it to sum
                sum += digit;
            // remove last digit of num
            num /= 10;
        }

        return sum;
    }

    public static int reverse(int num){
        int temp = 0;
        int digit = 0;

        while (num > 0){
            // get last digit of num
            digit = num % 10;
            // control the digit index
            temp *= 10;
            // add the last digit of num to digit
            temp += digit;
            // remove last digit of num
            num = num / 10;
        }
        return temp;
    }

    public static boolean isPalindrome(int num){
        if (reverse(num) == num)
            return true;
        else
            return false;
    }

    // futureInvestmentValue =
    // investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        double result = 0.0;

        result = investmentAmount * (Math.pow(1+monthlyInterestRate,years*12));

        return result;
    }
    //
    // Sales Amount Commission Rate
    // $0.01–$5,000 6 percent
    // $5,000.01–$10,000 8 percent
    // $10,000.01 and above 10 percent

    public static double computeCommission(double salesAmount){

        // return variable
        double result = 0.0;

        // variables for different interest rates
        double rate1 = 0.06;
        double rate2 = 0.08;
        double rate3 = 0.1;

        if (salesAmount <= 5000)
        {
            result += salesAmount * rate1;
        }
        else if (salesAmount > 5000 && salesAmount <= 10000){
            result += 5000*rate1;
            result += (salesAmount-5000) * rate2;
        }
        else if (salesAmount > 10000){
            result += 5000*rate1;
            result += 5000*rate2;
            result += (salesAmount-10000) * rate3;
        }
        return result;
    }



}
