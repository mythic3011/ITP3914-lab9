public class Q2c {
    public static void main(String[] args) {
        System.out.println("The maximum is " + max4(2.3, 4.9, -5.1, 0.0));
    }

    public static double max2(double a, double b) {
        return (a > b) ? a : b;
    }

    public static double max4(double a, double b, double c, double d) {
        return max2(max2(a, b), max2(c, d));
    }
}
