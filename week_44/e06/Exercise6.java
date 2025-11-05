public class Exercise6 {
    public static void main(final String[] args) {
        int iResult = power(2,3);
        System.out.println("2^3 = " + iResult);

        double dResult = power(2.5, 3.5);
        System.out.println("2^3 = " + dResult);
    }

    public static int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }

    public static double power(double base, double exponent) {
          return Math.pow(base, exponent);
    }
}